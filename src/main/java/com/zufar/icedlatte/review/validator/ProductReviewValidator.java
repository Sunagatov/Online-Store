package com.zufar.icedlatte.review.validator;

import com.zufar.icedlatte.product.repository.ProductInfoRepository;
import com.zufar.icedlatte.review.api.ProductReviewProvider;
import com.zufar.icedlatte.review.exception.DeniedProductReviewCreationException;
import com.zufar.icedlatte.review.exception.DeniedProductReviewDeletionException;
import com.zufar.icedlatte.review.exception.EmptyProductReviewException;
import com.zufar.icedlatte.review.exception.ProductIdsAreNotMatchException;
import com.zufar.icedlatte.review.exception.ProductNotFoundForReviewException;
import com.zufar.icedlatte.review.exception.ProductReviewNotFoundException;
import com.zufar.icedlatte.review.exception.InvalidProductReviewTextException;
import com.zufar.icedlatte.review.repository.ProductReviewRepository;
import com.zufar.icedlatte.security.api.SecurityPrincipalProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductReviewValidator {

    private final SecurityPrincipalProvider securityPrincipalProvider;
    private final ProductReviewProvider productReviewProvider;
    private final ProductReviewRepository productReviewRepository;
    private final ProductInfoRepository productInfoRepository;

    /**
     * Check if the product review's text is not empty
     */
    public void validateReviewText(final String productReviewText) {
        if (productReviewText.trim().isEmpty()) {
            throw new EmptyProductReviewException();
        }
        Pattern p = Pattern.compile("[^a-zA-Z0-9\\u00C0-\\u017F.,! ]");
        Matcher matcher = p.matcher(productReviewText);
        if(matcher.find()) {
            throw new InvalidProductReviewTextException();
        }
    }

    /**
     * Check if the product exists
     */
    public void validateProductExists(final UUID productId) {
        var productInfo = productInfoRepository.findById(productId);
        if (productInfo.isEmpty()) {
            throw new ProductNotFoundForReviewException(productId);
        }
    }

    /**
     * Check if the user has already created a review for this product
     */
    public void validateReviewExistsForUser(final UUID userId,
                                            final UUID productId) {
        var productReview = productReviewRepository.findByUserIdAndProductId(userId, productId);
        if (productReview.isPresent()) {
            throw new DeniedProductReviewCreationException(userId, productId, productReview.get().getId());
        }
    }

    /**
     * Check if the user has already created a review for this product
     */
    public void validateReviewExistsForUser(final UUID productReviewId) {
        var productReview = productReviewRepository.findById(productReviewId);
        if (productReview.isEmpty()) {
            throw new ProductReviewNotFoundException(productReviewId);
        }
    }

    /**
     * Check if the product's review deletion is allowed
     */
    public void validateProductReviewDeletionAllowed(final UUID productReviewId) {
        var currentUserId = securityPrincipalProvider.getUserId();
        var creatorId = productReviewProvider.getReviewEntityById(productReviewId).getUser().getId();

        if (!currentUserId.equals(creatorId)) {
            throw new DeniedProductReviewDeletionException(productReviewId, currentUserId);
        }
    }

    /**
     * Check if the product's review deletion is allowed
     */
    public void validateProductIdIsValid(final UUID productId,
                                         final UUID productReviewId) {
        var productInfo = productInfoRepository.findById(productId);
        if (productInfo.isEmpty()) {
            throw new ProductNotFoundForReviewException(productId);
        }
        var productReview = productReviewRepository.findById(productReviewId);
        if (productReview.isEmpty()) {
            throw new ProductReviewNotFoundException(productReviewId);
        }
        if (!productInfo.get().getProductId().equals(productReview.get().getProductId())) {
            throw new ProductIdsAreNotMatchException(productReviewId);
        }
    }
}
