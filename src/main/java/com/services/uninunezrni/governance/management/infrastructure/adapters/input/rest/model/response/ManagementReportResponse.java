package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ManagementReportResponse {
    private Long id;
    private String annualReport;
}
