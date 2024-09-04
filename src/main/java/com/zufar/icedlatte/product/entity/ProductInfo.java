package com.zufar.icedlatte.product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID productId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "average_rating")
    private BigDecimal averageRating;

    @Column(name = "reviews_count")
    private Integer reviewsCount;

    @Column(name = "brand_name", nullable = false)
    private String brandName;

    @Column(name = "seller_name", nullable = false)
    private String sellerName;

    @Column(name = "origin_country", nullable = false)
    private String originCountry;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "size_length", nullable = false)
    private Integer lengthSize;

    @Column(name = "size_width", nullable = false)
    private Integer widthSize;

    @Column(name = "size_height", nullable = false)
    private Integer heightSize;

    @Column(name = "sold_products_count", nullable = false)
    private Integer soldProductsCount;

    @Column(name = "discount", nullable = false)
    private Integer discount;

    @Column(name = "date_added", nullable = false)
    private LocalDateTime dateAdded;

    @Column(name = "popularity_score", nullable = false)
    private Integer popularityScore;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ProductInfo productInfo)) {
            return false;
        }
        return new EqualsBuilder()
                .append(productId, productInfo.productId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(productId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("productId", productId)
                .toString();
    }
}