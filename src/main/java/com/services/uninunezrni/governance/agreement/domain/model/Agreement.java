package com.services.uninunezrni.governance.agreement.domain.model;

import com.services.uninunezrni.governance.agreement.domain.model.enums.AgreementType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agreement {
    private Long id;
    private String name;
    private AgreementType type;
    private LocalDate dateStart;
    private LocalDate dateEnd;
}
