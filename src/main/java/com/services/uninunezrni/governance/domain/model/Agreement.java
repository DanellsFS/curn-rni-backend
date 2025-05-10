package com.services.uninunezrni.governance.domain.model;

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
