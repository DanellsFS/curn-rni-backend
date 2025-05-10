package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OperationalizationResponse {

    private Long id;
    private String operationalization;
}
