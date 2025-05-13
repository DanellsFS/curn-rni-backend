package com.services.uninunezrni.curriculum.eicRegistration.domain.model;

import com.services.uninunezrni.curriculum.eicRegistration.domain.model.enums.Decanatura;
import com.services.uninunezrni.curriculum.eicRegistration.domain.model.enums.ElementoEIC;
import com.services.uninunezrni.curriculum.eicRegistration.domain.model.enums.ProgramaAcademico;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EicRegistration {

    private Long id;

    private String correo;
    private String nombreCompleto;

    private Decanatura decanatura;
    private ProgramaAcademico programaAcademico;

    private String nombreAsignatura;
    private String semestre;
    private String unidadTematica;

    private ElementoEIC elementoEIC;
    private String idiomaClase;
    private String descripcionActividad;

    private String herramientasTecnologicas;
    private String entidadAliada;
    private String personaAliada;
    private String bibliografia;

    private int numeroClases;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private int numeroEstudiantes;
    private String lugarActividad;

    private String herramientasEvaluativas;
    private String otroElemento;
    private String linkCarpetaEvidencias;

}
