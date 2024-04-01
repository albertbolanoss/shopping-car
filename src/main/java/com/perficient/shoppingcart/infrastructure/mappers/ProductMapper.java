package com.perficient.shoppingcart.infrastructure.mappers;


import com.perficient.shoppingcart.domain.valueobjects.ProductDomain;
import com.perficient.shoppingcart.domain.valueobjects.ProductIdDomain;
import com.perficient.shoppingcart.infrastructure.entities.Product;

import java.util.Optional;

/**
 * Convert to Product entity
 */
public class ProductMapper {
    /**
     * Convert from domain to entity
     * @param productDomain the product domain
     * @return a Product entity
     */
    public static Product fromDomain(ProductDomain productDomain) {
        return Optional.ofNullable(productDomain)
                .map(domain -> new Product(
                        Optional.ofNullable(domain.getProductIdDomain())
                                .map(ProductIdDomain::getId)
                                .orElse(null),
                        domain.getName(),
                        domain.getCode(),
                        null,
                        domain.getUnitPrice(),
                        domain.getStock(),
                        domain.getActive()
                ))
                .orElse(null);
    }
}