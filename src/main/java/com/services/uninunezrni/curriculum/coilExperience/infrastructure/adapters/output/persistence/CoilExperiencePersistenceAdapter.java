package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence;

import com.services.uninunezrni.curriculum.coilExperience.application.ports.output.CoilExperiencePersistencePort;
import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.mapper.CoilExperiencePersistenceMapper;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.repository.CoilExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CoilExperiencePersistenceAdapter implements CoilExperiencePersistencePort {

    private final CoilExperienceRepository repository;
    private final CoilExperiencePersistenceMapper mapper;

    @Override
    public Optional<CoilExperience> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toCoilExperience);
    }

    @Override
    public List<CoilExperience> findAll() {
        return mapper.toCoilExperienceList(repository.findAll());
    }

    @Override
    public CoilExperience save(CoilExperience coilExperience) {
        return mapper.toCoilExperience(repository.save(mapper.toCoilExperienceEntity(coilExperience)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
