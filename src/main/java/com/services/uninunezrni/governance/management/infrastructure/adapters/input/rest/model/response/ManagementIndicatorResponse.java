package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ManagementIndicatorResponse {
    private Long id;
    private String annualResult;
}
