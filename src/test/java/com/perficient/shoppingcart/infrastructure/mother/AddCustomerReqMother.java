package com.perficient.shoppingcart.infrastructure.mother;

import com.perficient.shoppingcart.application.api.model.AddCustomerReq;

/**
 * Generate data for Add user request instances
 */
public class AddCustomerReqMother {

    /**
     * Generate a Add User Request with random data
     * @return a instance of AddUserReq
     */
    public static AddCustomerReq random() {
        return new AddCustomerReq()
                .firstName(FakerMother.getFaker().name().firstName())
                .lastName(FakerMother.getFaker().name().lastName())
                .email(FakerMother.getFaker().internet().emailAddress())
                .phone(FakerMother.getFaker().phoneNumber().phoneNumberInternational())
                .password(FakerMother.getFaker().internet().password());
    }

    /**
     * Generate a Add User Request with random data
     * @return a instance of AddUserReq
     */
    public static AddCustomerReq nullable() {
        return new AddCustomerReq()
                .firstName(null)
                .lastName(null)
                .email(null)
                .phone(null)
                .password(null);
    }

    /**
     * Generate a Add User Request with random data
     * @return a instance of AddUserReq
     */
    public static AddCustomerReq invalidMaxLength() {
        return new AddCustomerReq()
                .firstName(FakerMother.getFaker().lorem().characters(CustomerDomainMother.FIRSTNAME_MAX_LENGTH + 1))
                .lastName(FakerMother.getFaker().lorem().characters((CustomerDomainMother.LASTNAME_MAX_LENGTH + 1)))
                .email(FakerMother.getFaker().lorem().characters((CustomerDomainMother.EMAIL_MAX_LENGTH + 1)))
                .phone(FakerMother.getFaker().lorem().characters((CustomerDomainMother.PHONE_MAX_LENGTH + 1)))
                .password(FakerMother.getFaker().lorem().characters((CustomerDomainMother.PASSWORD_MAX_LENGTH + 1)));
    }

    /**
     * Generate an Add User Request with random data
     * @return an instance of AddUserReq
     */
    public static AddCustomerReq invalidEmail() {
        return new AddCustomerReq()
                .firstName(FakerMother.getFaker().name().firstName())
                .lastName(FakerMother.getFaker().name().lastName())
                .email(FakerMother.getFaker().internet().username())
                .phone(FakerMother.getFaker().phoneNumber().phoneNumberInternational())
                .password(FakerMother.getFaker().internet().password());
    }
}
