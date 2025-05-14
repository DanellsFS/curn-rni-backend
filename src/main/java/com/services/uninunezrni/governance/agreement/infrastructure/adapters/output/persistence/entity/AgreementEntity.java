package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.entity;

import com.services.uninunezrni.governance.agreement.domain.model.enums.AgreementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agreement")
public class AgreementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private AgreementType type;

    private LocalDate dateStart;
    private LocalDate dateEnd;
}
