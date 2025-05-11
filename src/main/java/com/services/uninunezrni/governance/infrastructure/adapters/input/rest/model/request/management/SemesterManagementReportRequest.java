package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SemesterManagementReportRequest {

    @NotBlank(message = "Field format cannot be empty or null.")
    private String format;
}
