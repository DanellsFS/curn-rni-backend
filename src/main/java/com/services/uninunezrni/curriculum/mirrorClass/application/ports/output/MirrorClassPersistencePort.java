package com.services.uninunezrni.curriculum.mirrorClass.application.ports.output;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;

import java.util.List;
import java.util.Optional;

public interface MirrorClassPersistencePort {

    Optional<MirrorClass> findById(Long id);
    List<MirrorClass> findAll();
    MirrorClass save(MirrorClass mirrorClass);
    void deleteById(Long id);

}
