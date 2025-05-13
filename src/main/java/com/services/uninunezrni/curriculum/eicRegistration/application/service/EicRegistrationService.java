package com.services.uninunezrni.curriculum.eicRegistration.application.service;

import com.services.uninunezrni.curriculum.eicRegistration.application.ports.input.EicRegistrationServicePort;
import com.services.uninunezrni.curriculum.eicRegistration.application.ports.output.EicRegistrationPersistencePort;
import com.services.uninunezrni.curriculum.eicRegistration.domain.exception.EicRegistrationNotFoundException;
import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EicRegistrationService implements EicRegistrationServicePort {

    private final EicRegistrationPersistencePort persistencePort;

    @Override
    public EicRegistration findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(EicRegistrationNotFoundException::new);
    }

    @Override
    public List<EicRegistration> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public EicRegistration save(EicRegistration eicRegistration) {
        return persistencePort.save(eicRegistration);
    }

    @Override
    public EicRegistration update(Long id, EicRegistration eicRegistration) {
        return persistencePort.findById(id)
                .map(savedEicRegistration -> {
                    savedEicRegistration.setElementoEIC(eicRegistration.getElementoEIC());
                    savedEicRegistration.setCorreo(eicRegistration.getCorreo());
                    savedEicRegistration.setBibliografia(eicRegistration.getBibliografia());
                    savedEicRegistration.setDecanatura(eicRegistration.getDecanatura());
                    savedEicRegistration.setDescripcionActividad(eicRegistration.getDescripcionActividad());
                    savedEicRegistration.setEntidadAliada(eicRegistration.getEntidadAliada());
                    savedEicRegistration.setFechaFin(eicRegistration.getFechaFin());
                    savedEicRegistration.setFechaInicio(eicRegistration.getFechaInicio());
                    savedEicRegistration.setHerramientasEvaluativas(eicRegistration.getHerramientasEvaluativas());
                    savedEicRegistration.setPersonaAliada(eicRegistration.getPersonaAliada());
                    savedEicRegistration.setProgramaAcademico(eicRegistration.getProgramaAcademico());
                    savedEicRegistration.setUnidadTematica(eicRegistration.getUnidadTematica());
                    savedEicRegistration.setSemestre(eicRegistration.getSemestre());
                    savedEicRegistration.setIdiomaClase(eicRegistration.getIdiomaClase());
                    savedEicRegistration.setNumeroClases(eicRegistration.getNumeroClases());
                    savedEicRegistration.setNumeroEstudiantes(eicRegistration.getNumeroEstudiantes());
                    savedEicRegistration.setLugarActividad(eicRegistration.getLugarActividad());
                    savedEicRegistration.setOtroElemento(eicRegistration.getOtroElemento());
                    savedEicRegistration.setLinkCarpetaEvidencias(eicRegistration.getLinkCarpetaEvidencias());
                    savedEicRegistration.setNombreAsignatura(eicRegistration.getNombreAsignatura());
                    savedEicRegistration.setHerramientasTecnologicas(eicRegistration.getHerramientasTecnologicas());
                    savedEicRegistration.setNombreCompleto(eicRegistration.getNombreCompleto());
                    return persistencePort.save(savedEicRegistration);
                })
                .orElseThrow(EicRegistrationNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isPresent()) {
            throw new EicRegistrationNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
