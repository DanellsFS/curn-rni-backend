package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management;

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
