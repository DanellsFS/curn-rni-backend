package com.services.uninunezrni.governance.agreement.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    AGREEMENT_NOT_FOUND("ERR_AGREEMENT_NOT_FOUND_001",  "Agreement not found."),
    AGREEMENTS_EXCEL_NOT_FOUND("ERR_AGREEMENTS_EXCEL_NOT_FOUND_001",  "Agreements excel not found."),
    NEW_AGREEMENT_NOT_FOUND("ERR_NEW_AGREEMENT_NOT_FOUND_001",  "New agreement not found."),
    OPERATIONALIZATION_NOT_FOUND("ERR_OPERATIONALIZATION_NOT_FOUND_001",  "Operationalization not found."),

    INVALID_AGREEMENT("ERR_AGREEMENT_002",  "Invalid agreement parameters."),
    INVALID_AGREEMENTS_EXCEL("ERR_AGREEMENTS_EXCEL_002",  "Invalid agreements excel parameters."),
    INVALID_NEW_AGREEMENT("ERR_NEW_AGREEMENT_002",  "Invalid new agreement parameters."),
    INVALID_OPERATIONALIZATION("ERR_OPERATIONALIZATION_002",  "Invalid operationalization parameters."),

    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
