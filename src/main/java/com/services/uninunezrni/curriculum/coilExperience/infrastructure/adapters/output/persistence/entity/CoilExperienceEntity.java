package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.entity;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
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
@Table(name = "coil_experiences")
public class CoilExperienceEntity {

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
