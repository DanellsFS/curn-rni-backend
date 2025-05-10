package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement;


import com.services.uninunezrni.governance.domain.model.agreement.NewAgreement;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.NewAgreementEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NewAgreementPersistenceMapper {
    NewAgreementEntity toNewAgreementEntity(NewAgreement newagreement);
    NewAgreement toNewAgreement(NewAgreementEntity entity);
    List<NewAgreement> toNewAgreementList(List<NewAgreementEntity> entityList);
}