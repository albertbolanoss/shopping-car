package com.perficient.shoppingcart.domain.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Generic domain page response
 */
@AllArgsConstructor
@Getter
public class PageResponseDomain {
    /**
     * The total of register in data source
     */
    private long totalItems;
    /**
     * The total of generated pages
     */
    private int totalPages;

    /**
     * The request page domain
     */
    private PageRequestDomain pageRequestDomain;
}
