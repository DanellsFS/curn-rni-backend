package com.services.uninunezrni.curriculum.coilExperience.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    COILEXPERIENCE_NOT_FOUND("ERR_COILEXPERIENCE_NOT_FOUND_001",  "CoilExperience not found."),
    INVALID_COILEXPERIENCE("ERR_COILEXPERIENCE_002",  "Invalid CoilExperience parameters."),
    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
