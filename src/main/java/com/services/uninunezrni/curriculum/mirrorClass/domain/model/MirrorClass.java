package com.services.uninunezrni.curriculum.mirrorClass.domain.model;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.NumeroSecciones;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.ProgramaAcademico;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MirrorClass {
    private Long id;

    private String correo;
    private String nombrePersonaRegistro;

    private Facultad facultad;
    private ProgramaAcademico programaAcademico;

    private String institucionAliada;
    private String paisInstitucion;
    private String ciudadInstitucion;

    private String docenteUninunez;
    private String docenteExterno;
    private String identificacionDocenteExterno;

    private String asignatura;
    private String unidadTematica;

    private NumeroSecciones numeroSecciones;
    private Integer numeroSeccionesOtro;// Solo se llena si el enum = OTRO

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private String herramientasWeb;
    private int numeroEstudiantes;

    private String linkEvidencias;
}
