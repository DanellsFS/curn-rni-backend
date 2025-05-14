package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response;

import com.services.uninunezrni.governance.agreement.domain.model.enums.AgreementType;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgreementResponse {
    private Long id;
    private String name;
    private AgreementType type;
    private LocalDate dateStart;
    private LocalDate dateEnd;
}
