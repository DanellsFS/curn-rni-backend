package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgreementsExcelResponse {
    private Long id;
    private String excelLink;
}
