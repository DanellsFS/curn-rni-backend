package com.services.uninunezrni.curriculum.coilExperience.application.service;

import com.services.uninunezrni.curriculum.coilExperience.application.ports.input.CoilExperienceServicePort;
import com.services.uninunezrni.curriculum.coilExperience.application.ports.output.CoilExperiencePersistencePort;
import com.services.uninunezrni.curriculum.coilExperience.domain.exception.CoilExperienceNotFoundException;
import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoilExperienceService implements CoilExperienceServicePort {

    private final CoilExperiencePersistencePort persistencePort;

    @Override
    public CoilExperience findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(CoilExperienceNotFoundException::new);
    }

    @Override
    public List<CoilExperience> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public CoilExperience save(CoilExperience coilExperience) {
        return persistencePort.save(coilExperience);
    }

    @Override
    public CoilExperience update(Long id, CoilExperience coilExperience) {
        return persistencePort.findById(id)
                .map(savedCoilExperience -> {
                    savedCoilExperience.setCorreo(coilExperience.getCorreo());
                    savedCoilExperience.setNombrePersonaRegistro(coilExperience.getNombrePersonaRegistro());
                    savedCoilExperience.setFacultad(coilExperience.getFacultad());
                    savedCoilExperience.setProgramaAcademico(coilExperience.getProgramaAcademico());
                    savedCoilExperience.setInstitucionAliada(coilExperience.getInstitucionAliada());
                    savedCoilExperience.setPaisInstitucion(coilExperience.getPaisInstitucion());
                    savedCoilExperience.setFechaInicio(coilExperience.getFechaInicio());
                    savedCoilExperience.setFechaFin(coilExperience.getFechaFin());
                    savedCoilExperience.setAsignatura(coilExperience.getAsignatura());
                    savedCoilExperience.setNumeroSecciones(coilExperience.getNumeroSecciones());
                    savedCoilExperience.setDocenteUninunez(coilExperience.getDocenteUninunez());
                    savedCoilExperience.setDocenteExterno(coilExperience.getDocenteExterno());
                    savedCoilExperience.setIdentificacionDocenteExterno(coilExperience.getIdentificacionDocenteExterno());
                    savedCoilExperience.setNumeroEstudiantes(coilExperience.getNumeroEstudiantes());
                    savedCoilExperience.setLinkEvidencias(coilExperience.getLinkEvidencias());
                    return persistencePort.save(savedCoilExperience);
                })
                .orElseThrow(CoilExperienceNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isPresent()) {
            throw new CoilExperienceNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
