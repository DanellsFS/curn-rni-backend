package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Agreement;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.AgreementEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgreementPersistenceMapper {
    AgreementEntity toAgreementEntity(Agreement agreement);
    Agreement toAgreement(AgreementEntity entity);
    List<Agreement> toAgreementList(List<AgreementEntity> entityList);
}
