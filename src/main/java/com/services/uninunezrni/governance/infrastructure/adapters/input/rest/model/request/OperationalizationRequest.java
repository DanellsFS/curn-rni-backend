package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OperationalizationRequest {

    @NotBlank(message = "Field operationalization cannot be empty or null.")
    private String operationalization;

}
