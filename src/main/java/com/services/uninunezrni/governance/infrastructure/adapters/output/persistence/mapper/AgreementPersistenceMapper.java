package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.governance.domain.model.Agreement;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.AgreementEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgreementPersistenceMapper {
    AgreementEntity toAgreementEntity(Agreement agreement);
    Agreement toAgreement(AgreementEntity entity);
    List<Agreement> toAgreementList(List<AgreementEntity> entityList);
}
