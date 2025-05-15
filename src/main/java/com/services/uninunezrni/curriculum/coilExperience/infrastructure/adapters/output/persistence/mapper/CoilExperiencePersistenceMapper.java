package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.entity.CoilExperienceEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoilExperiencePersistenceMapper {
    CoilExperienceEntity toCoilExperienceEntity(CoilExperience coilExperience);
    CoilExperience toCoilExperience(CoilExperienceEntity entity);
    List<CoilExperience> toCoilExperienceList(List<CoilExperienceEntity> entityList);
}
