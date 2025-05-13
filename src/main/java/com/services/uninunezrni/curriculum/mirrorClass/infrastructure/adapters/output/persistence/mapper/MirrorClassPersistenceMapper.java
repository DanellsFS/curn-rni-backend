package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.entity.MirrorClassEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MirrorClassPersistenceMapper {
    MirrorClassEntity toMirrorClassEntity(MirrorClass mirrorClass);
    MirrorClass toMirrorClass(MirrorClassEntity entity);
    List<MirrorClass> toMirrorClassList(List<MirrorClassEntity> entityList);
}
