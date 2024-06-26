package com.ecommerce.user.domain.valueobjects;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represent a domain customer
 */
@AllArgsConstructor
@Getter
public class UserDomain {
    /**
     * First name max length
     */
    private static final int FIRSTNAME_MAX_LENGTH = 125;
    /**
     * Last name max length
     */
    private static final int LASTNAME_MAX_LENGTH = 125;
    /**
     * Email max length
     */
    private static final int EMAIL_MAX_LENGTH = 255;
    /**
     * Password max length
     */
    private static final int PASSWORD_MAX_LENGTH = 255;
    /**
     * Phone max length
     */
    private static final int PHONE_MAX_LENGTH = 40;

    /**
     * The Customer Identified
     */
    private final UserIdDomain customerId;
    /**
     * The customer first name
     */
    private final @Size(max = FIRSTNAME_MAX_LENGTH) String firstName;
    /**
     * The customer last name
     */
    private final @Size(max = LASTNAME_MAX_LENGTH) String lastName;
    /**
     * The customer email
     */
    private final @Size(max = EMAIL_MAX_LENGTH) String email;
    /**
     * The customer password
     */
    private final @Size(max = PASSWORD_MAX_LENGTH) String password;
    /**
     * The customer phone
     */
    private final @Size(max = PHONE_MAX_LENGTH) String phone;
    /**
     * indicates whether the customer is active or inactive
     */
    private final Boolean active;

}
