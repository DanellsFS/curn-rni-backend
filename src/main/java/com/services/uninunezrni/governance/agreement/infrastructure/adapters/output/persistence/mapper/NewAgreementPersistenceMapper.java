package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.mapper;


import com.services.uninunezrni.governance.agreement.domain.model.NewAgreement;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.entity.NewAgreementEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NewAgreementPersistenceMapper {
    NewAgreementEntity toNewAgreementEntity(NewAgreement newagreement);
    NewAgreement toNewAgreement(NewAgreementEntity entity);
    List<NewAgreement> toNewAgreementList(List<NewAgreementEntity> entityList);
}