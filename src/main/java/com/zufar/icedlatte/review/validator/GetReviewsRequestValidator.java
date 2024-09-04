package com.zufar.icedlatte.review.validator;

import com.zufar.icedlatte.common.validation.pagination.PaginationParametersValidator;
import com.zufar.icedlatte.product.exception.GetProductsBadRequestException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class GetReviewsRequestValidator {

    private static final Set<String> ALLOWED_SORT_ATTRIBUTES_VALUES = Set.of("createdAt", "productRating");
    private static final Set<Integer> ALLOWED_PRODUCT_RATING_VALUES = Set.of(1, 2, 3, 4, 5);

    private final PaginationParametersValidator paginationParametersValidator;

    public void validate(final Integer pageNumber,
                         final Integer pageSize,
                         final String sortAttribute,
                         final String sortDirection,
                         final List<Integer> productRatings) {
        StringBuilder errorMessages = new StringBuilder();

        StringBuilder paginationErrorMessages = paginationParametersValidator.validate(pageNumber, pageSize, sortAttribute, sortDirection, ALLOWED_SORT_ATTRIBUTES_VALUES);
        errorMessages.append(paginationErrorMessages);

        StringBuilder productRatingsParameterErrorMessages = validateProductRatingsParameter(productRatings);
        errorMessages.append(productRatingsParameterErrorMessages);

        if (!errorMessages.isEmpty()) {
            throw new GetProductsBadRequestException(errorMessages.toString());
        }
    }

    private StringBuilder validateProductRatingsParameter(final List<Integer> productRatings) {
        final StringBuilder errorMessages = new StringBuilder();
        if (productRatings == null) {
            String errorMessage = String.format("product's rating is required. Allowed 'productRating' values are '%s'.", ALLOWED_PRODUCT_RATING_VALUES);
            errorMessages.append(createErrorMessage(errorMessage));
        }
        if ((productRatings != null && productRatings.stream().anyMatch(Objects::isNull))
                || (productRatings != null && !ALLOWED_PRODUCT_RATING_VALUES.containsAll(productRatings))) {
            String errorMessage = String.format("Some values of this product's rating list = '%s' are incorrect. Allowed 'productRating' values are '%s'.",
                    productRatings, ALLOWED_PRODUCT_RATING_VALUES);
            errorMessages.append(createErrorMessage(errorMessage));
        }
        if (productRatings != null && productRatings.stream().noneMatch(Objects::isNull) &&
                productRatings.stream().distinct().count() < productRatings.size()) {
            String errorMessage = String.format("This list of product's rating values '%s' has duplicates. Product's rating values must be unique.", productRatings);
            errorMessages.append(createErrorMessage(errorMessage));
        }
        return errorMessages;
    }

    private static String createErrorMessage(final String errorMessage) {
        return String.format(" Error: { %s }. ", errorMessage);
    }
}
