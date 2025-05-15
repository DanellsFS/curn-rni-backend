package com.services.uninunezrni.curriculum.coilExperience.domain.model;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.ProgramaAcademico;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoilExperience {
    private Long id;

    private String correo;
    private String nombrePersonaRegistro;

    private Facultad facultad;
    private ProgramaAcademico programaAcademico;

    private String institucionAliada;
    private String paisInstitucion;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private String asignatura;
    private int numeroSecciones;

    private String docenteUninunez;
    private String docenteExterno;
    private String identificacionDocenteExterno;

    private int numeroEstudiantes;

    private String linkEvidencias;
}
