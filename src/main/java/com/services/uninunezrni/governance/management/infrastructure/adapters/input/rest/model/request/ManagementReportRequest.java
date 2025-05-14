package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ManagementReportRequest {

    @NotBlank(message = "Field annual report cannot be empty or null.")
    private String annualReport;
}
