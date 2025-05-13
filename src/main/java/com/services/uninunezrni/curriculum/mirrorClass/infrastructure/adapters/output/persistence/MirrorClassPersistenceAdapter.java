package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence;

import com.services.uninunezrni.curriculum.mirrorClass.application.ports.output.MirrorClassPersistencePort;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.mapper.MirrorClassPersistenceMapper;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.repository.MirrorClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MirrorClassPersistenceAdapter implements MirrorClassPersistencePort {

    private final MirrorClassRepository repository;
    private final MirrorClassPersistenceMapper mapper;

    @Override
    public Optional<MirrorClass> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toMirrorClass);
    }

    @Override
    public List<MirrorClass> findAll() {
        return mapper.toMirrorClassList(repository.findAll());
    }

    @Override
    public MirrorClass save(MirrorClass mirrorClass) {
        return mapper.toMirrorClass(repository.save(mapper.toMirrorClassEntity(mirrorClass)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
