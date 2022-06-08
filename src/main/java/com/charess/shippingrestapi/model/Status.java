package com.charess.shippingrestapi.model;

public enum Status {

    USER_ACTIVE,
    USER_LOCKED,
    USER_PENDING,
    USER_INACTIVE,

    COLIS_VALIDATED,
    COLIS_REJECTED,
    COLIS_PENDING,
    COLIS_COMPLETED,
    COLIS_UNCOMPLETED,
    COLIS_IN_PROGRESS,
    COLIS_DELIVERED
}
