package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "operationalization")
public class OperationalizationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String operationalization;
}
