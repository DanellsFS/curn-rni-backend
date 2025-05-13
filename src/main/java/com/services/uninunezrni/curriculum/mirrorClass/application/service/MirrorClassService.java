package com.services.uninunezrni.curriculum.mirrorClass.application.service;

import com.services.uninunezrni.curriculum.mirrorClass.application.ports.input.MirrorClassServicePort;
import com.services.uninunezrni.curriculum.mirrorClass.application.ports.output.MirrorClassPersistencePort;
import com.services.uninunezrni.curriculum.mirrorClass.domain.exception.MirrorClassNotFoundException;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MirrorClassService implements MirrorClassServicePort {

    private final MirrorClassPersistencePort persistencePort;

    @Override
    public MirrorClass findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(MirrorClassNotFoundException::new);
    }

    @Override
    public List<MirrorClass> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public MirrorClass save(MirrorClass mirrorClass) {
        return persistencePort.save(mirrorClass);
    }

    @Override
    public MirrorClass update(Long id, MirrorClass mirrorClass) {
        return persistencePort.findById(id)
                .map(savedMirrorClass -> {
                    savedMirrorClass.setCorreo(mirrorClass.getCorreo());
                    savedMirrorClass.setNombrePersonaRegistro(mirrorClass.getNombrePersonaRegistro());
                    savedMirrorClass.setFacultad(mirrorClass.getFacultad());
                    savedMirrorClass.setProgramaAcademico(mirrorClass.getProgramaAcademico());
                    savedMirrorClass.setInstitucionAliada(mirrorClass.getInstitucionAliada());
                    savedMirrorClass.setPaisInstitucion(mirrorClass.getPaisInstitucion());
                    savedMirrorClass.setCiudadInstitucion(mirrorClass.getCiudadInstitucion());
                    savedMirrorClass.setDocenteUninunez(mirrorClass.getDocenteUninunez());
                    savedMirrorClass.setDocenteExterno(mirrorClass.getDocenteExterno());
                    savedMirrorClass.setIdentificacionDocenteExterno(mirrorClass.getIdentificacionDocenteExterno());
                    savedMirrorClass.setAsignatura(mirrorClass.getAsignatura());
                    savedMirrorClass.setUnidadTematica(mirrorClass.getUnidadTematica());
                    savedMirrorClass.setNumeroSecciones(mirrorClass.getNumeroSecciones());
                    savedMirrorClass.setNumeroSeccionesOtro(mirrorClass.getNumeroSeccionesOtro());
                    savedMirrorClass.setFechaInicio(mirrorClass.getFechaInicio());
                    savedMirrorClass.setFechaFin(mirrorClass.getFechaFin());
                    savedMirrorClass.setHerramientasWeb(mirrorClass.getHerramientasWeb());
                    savedMirrorClass.setNumeroEstudiantes(mirrorClass.getNumeroEstudiantes());
                    savedMirrorClass.setLinkEvidencias(mirrorClass.getLinkEvidencias());
                    return persistencePort.save(savedMirrorClass);
                })
                .orElseThrow(MirrorClassNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isPresent()) {
            throw new MirrorClassNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
