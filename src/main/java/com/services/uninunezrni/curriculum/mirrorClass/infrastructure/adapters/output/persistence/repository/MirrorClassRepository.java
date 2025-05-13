package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.entity.MirrorClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MirrorClassRepository extends JpaRepository<MirrorClassEntity, Long> {
}
