package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewAgreementResponse {
    private Long id;
    private String newAgreement;
}
