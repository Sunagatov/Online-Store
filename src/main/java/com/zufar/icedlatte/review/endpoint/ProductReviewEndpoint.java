package com.zufar.icedlatte.review.endpoint;

import com.zufar.icedlatte.openapi.dto.ProductReviewRatingStats;
import com.zufar.icedlatte.openapi.dto.ProductReviewRequest;
import com.zufar.icedlatte.openapi.dto.ProductReviewDto;
import com.zufar.icedlatte.openapi.dto.ProductReviewLikeDto;
import com.zufar.icedlatte.openapi.dto.ProductReviewsAndRatingsWithPagination;
import com.zufar.icedlatte.review.validator.GetReviewsRequestValidator;
import com.zufar.icedlatte.review.api.ProductReviewsStatisticsProvider;
import com.zufar.icedlatte.review.api.ProductReviewCreator;
import com.zufar.icedlatte.review.api.ProductReviewDeleter;
import com.zufar.icedlatte.review.api.ProductReviewLikesUpdater;
import com.zufar.icedlatte.review.api.ProductReviewsProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static com.zufar.icedlatte.common.util.Utils.createPageableObject;

@Slf4j
@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping(value = ProductReviewEndpoint.PRODUCT_REVIEW_URL)
public class ProductReviewEndpoint implements com.zufar.icedlatte.openapi.product.review.api.ProductReviewApi {

    public static final String PRODUCT_REVIEW_URL = "/api/v1/products/";

    private final ProductReviewCreator productReviewCreator;
    private final ProductReviewDeleter productReviewDeleter;
    private final ProductReviewsProvider productReviewsProvider;
    private final ProductReviewsStatisticsProvider productReviewsStatisticsProvider;
    private final ProductReviewLikesUpdater productReviewLikesUpdater;
    private final GetReviewsRequestValidator getReviewsRequestValidator;

    @Override
    @PostMapping(value = "/{productId}/reviews")
    public ResponseEntity<ProductReviewDto> addNewProductReview(@PathVariable final UUID productId,
                                                                final ProductReviewRequest productReviewRequest) {
        log.info("Received the request to add a new product review for the product with the productId = '{}'", productId);
        var review = productReviewCreator.create(productId, productReviewRequest);
        log.info("New product review was added with productReviewId = '{}' for the product with the productId = '{}'", review.getProductReviewId(), productId);
        return ResponseEntity.ok().body(review);
    }

    @Override
    @DeleteMapping(value = "/{productId}/reviews/{productReviewId}")
    public ResponseEntity<Void> deleteProductReview(@PathVariable final UUID productId,
                                                    @PathVariable final UUID productReviewId) {
        log.info("Received request to delete product review with productReviewId = '{}', productId = '{}'", productReviewId, productId);
        productReviewDeleter.delete(productId, productReviewId);
        log.info("Product review with productReviewId = '{}' was deleted", productReviewId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    @GetMapping(value = "/{productId}/reviews")
    public ResponseEntity<ProductReviewsAndRatingsWithPagination> getProductReviewsAndRatings(@PathVariable final UUID productId,
                                                                                              @RequestParam(name = "page", defaultValue = "0") final Integer pageNumber,
                                                                                              @RequestParam(name = "size", required = false) final Integer pageSize,
                                                                                              @RequestParam(name = "sort_attribute", defaultValue = "createdAt") final String sortAttribute,
                                                                                              @RequestParam(name = "sort_direction", defaultValue = "desc") final String sortDirection,
                                                                                              @RequestParam(name = "product_ratings", required = false) List<Integer> productRatings) {
        log.info("Received the request to get reviews and ratings for the product with the productId = '{}' and with the next pagination and sorting attributes: pageNumber - {}, pageSize - {}, sort_attribute - {}, sort_direction - {}, productRatings - {}",
                productId, pageNumber, pageSize, sortAttribute, sortDirection, productRatings);
        getReviewsRequestValidator.validate(pageNumber, pageSize, sortAttribute, sortDirection, productRatings);
        Pageable pageable = createPageableObject(pageNumber, pageSize, sortAttribute, sortDirection);
        ProductReviewsAndRatingsWithPagination reviewsPaginationDto = productReviewsProvider.getProductReviews(productId, pageable, productRatings);
        log.info("Product reviews and ratings were retrieved successfully for the product with the productId = '{}'", productId);
        return ResponseEntity.ok().body(reviewsPaginationDto);
    }

    @Override
    @GetMapping(value = "/{productId}/review")
    public ResponseEntity<ProductReviewDto> getProductReview(@PathVariable final UUID productId) {
        log.info("Received the request to get product review and rating for the product with the productId = '{}'", productId);
        ProductReviewDto result = productReviewsProvider.getProductReviewForUser(productId);
        log.info("Product review and rating were retrieved successfully for the product with the productId = '{}'", productId);
        return ResponseEntity.ok().body(result);
    }

    @Override
    @GetMapping("/{productId}/reviews/statistics")
    public ResponseEntity<ProductReviewRatingStats> getRatingAndReviewStat(@PathVariable final UUID productId) {
        log.info("Received the request to get the statistics of product's review and rating for the product with the productId = '{}'", productId);
        final ProductReviewRatingStats stats = productReviewsStatisticsProvider.get(productId);
        log.info("Statistics for product's review and rating for the product with the productId = '{}' was retrieved successfully", productId);
        return ResponseEntity.ok().body(stats);
    }

    @Override
    @PostMapping(value = "/{productId}/reviews/{productReviewId}/rate")
    public ResponseEntity<ProductReviewDto> addProductReviewLike(@PathVariable final UUID productId,
                                                                 @PathVariable final UUID productReviewId,
                                                                 final ProductReviewLikeDto request) {
        log.info("Received the request to rate a product review for the product with the productId = '{}'.", productId);
        var productReview = productReviewLikesUpdater.update(productId, productReviewId, request.getIsLike());
        log.info("Product review with id = '{}' was successfully {}.", productReviewId, request.getIsLike() ? "liked" : "disliked");
        return ResponseEntity.ok().body(productReview);
    }
}
