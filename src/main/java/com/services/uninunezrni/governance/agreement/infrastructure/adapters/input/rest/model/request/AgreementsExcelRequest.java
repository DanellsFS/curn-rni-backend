package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgreementsExcelRequest {

    @NotBlank(message = "Field excel link cannot be empty or null.")
    private String excelLink;
}
