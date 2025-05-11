package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.AgreementType;
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
