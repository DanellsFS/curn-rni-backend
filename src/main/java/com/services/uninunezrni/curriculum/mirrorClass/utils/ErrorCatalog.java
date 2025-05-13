package com.services.uninunezrni.curriculum.mirrorClass.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    MIRRORCLASS_NOT_FOUND("ERR_MIRRORCLASS_NOT_FOUND_001",  "MirrorClass not found."),
    INVALID_MIRRORCLASS("ERR_MIRRORCLASS_002",  "Invalid MirrorClass parameters."),
    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
