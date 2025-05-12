package com.services.uninunezrni.curriculum.infrastructure.adapters.output.persistence.entity;

import com.services.uninunezrni.curriculum.domain.model.enums.Decanatura;
import com.services.uninunezrni.curriculum.domain.model.enums.ElementoEIC;
import com.services.uninunezrni.curriculum.domain.model.enums.ProgramaAcademico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eic_registrations")
public class EicRegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;
    private String nombreCompleto;

    @Enumerated(EnumType.STRING)
    private Decanatura decanatura;
    @Enumerated(EnumType.STRING)
    private ProgramaAcademico programaAcademico;

    private String nombreAsignatura;
    private String semestre;
    private String unidadTematica;

    @Enumerated(EnumType.STRING)
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
