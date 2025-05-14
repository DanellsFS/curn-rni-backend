package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response;

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
