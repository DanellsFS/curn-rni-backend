package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management;

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
