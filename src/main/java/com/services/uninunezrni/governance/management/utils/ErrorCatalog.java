package com.services.uninunezrni.governance.management.utils;

import lombok.Getter;

@Getter
public enum ErrorCatalog {
    MANAGEMENT_INDICATOR_NOT_FOUND("ERR_MANAGEMENT_NOT_FOUND_001",  "Management not found."),
    MANAGEMENT_REPORT_NOT_FOUND("ERR_MANAGEMENT_REPORT_NOT_FOUND_001",  "Management report not found."),
    SEMESTER_MANAGEMENT_REPORT_NOT_FOUND("ERR_SEMESTER_MANAGEMENT_REPORT_NOT_FOUND_001",  "Semester management report not found."),

    INVALID_MANAGEMENT_INDICATOR("ERR_MANAGEMENT_INDICATOR_002",  "Invalid management indicator parameters."),
    INVALID_MANAGEMENT_REPORT("ERR_MANAGEMENT_REPORT_002",  "Invalid management report parameters."),
    INVALID_SEMESTER_MANAGEMENT_REPORT("ERR_SEMESTER_MANAGEMENT_REPORT_002",  "Invalid semester management report parameters."),

    GENERIC_ERROR("ERR_GEN_001",  "An unexpected error occurred.");

    private final String code;
    private final String message;

    ErrorCatalog(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
