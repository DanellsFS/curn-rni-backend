package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.output.persistence.entity;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.NumeroSecciones;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.ProgramaAcademico;
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
@Table(name = "mirror_classes")
public class MirrorClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;
    private String nombrePersonaRegistro;

    @Enumerated(EnumType.STRING)
    private Facultad facultad;
    @Enumerated(EnumType.STRING)
    private ProgramaAcademico programaAcademico;

    private String institucionAliada;
    private String paisInstitucion;
    private String ciudadInstitucion;

    private String docenteUninunez;
    private String docenteExterno;
    private String identificacionDocenteExterno;

    private String asignatura;
    private String unidadTematica;

    @Enumerated(EnumType.STRING)
    private NumeroSecciones numeroSecciones;
    private Integer numeroSeccionesOtro;// Solo se llena si el enum = OTRO

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private String herramientasWeb;
    private int numeroEstudiantes;

    private String linkEvidencias;

}
