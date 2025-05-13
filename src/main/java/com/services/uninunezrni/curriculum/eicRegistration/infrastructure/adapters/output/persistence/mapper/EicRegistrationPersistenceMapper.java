package com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.entity.EicRegistrationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EicRegistrationPersistenceMapper {
    EicRegistrationEntity toEicRegistrationEntity(EicRegistration eicRegistration);
    EicRegistration toEicRegistration(EicRegistrationEntity entity);
    List<EicRegistration> toEicRegistrationList(List<EicRegistrationEntity> entityList);
}
