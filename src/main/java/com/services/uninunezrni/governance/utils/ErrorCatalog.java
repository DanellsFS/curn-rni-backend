package com.services.uninunezrni.governance.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    AGREEMENT_NOT_FOUND("ERR_AGREEMENT_NOT_FOUND_001",  "Agreement not found."),
    INVALID_AGREEMENT("ERR_AGREEMENT_002",  "Invalid agreement parameters."),
    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
