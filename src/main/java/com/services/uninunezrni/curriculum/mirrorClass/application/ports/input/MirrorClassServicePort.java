package com.services.uninunezrni.curriculum.mirrorClass.application.ports.input;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;

import java.util.List;

public interface MirrorClassServicePort {

    MirrorClass findById(Long id);
    List<MirrorClass> findAll();
    MirrorClass save(MirrorClass mirrorClass);
    MirrorClass update(Long id, MirrorClass mirrorClass);
    void deleteById(Long id);

}
