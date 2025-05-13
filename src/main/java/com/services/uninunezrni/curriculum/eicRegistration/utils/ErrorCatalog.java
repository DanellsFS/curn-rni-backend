package com.services.uninunezrni.curriculum.eicRegistration.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    EICREGISTRATION_NOT_FOUND("ERR_EICREGISTRATION_NOT_FOUND_001",  "EicRegistration not found."),
    INVALID_EICREGISTRATION("ERR_EICREGISTRATION_002",  "Invalid EicRegistration parameters."),
    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
