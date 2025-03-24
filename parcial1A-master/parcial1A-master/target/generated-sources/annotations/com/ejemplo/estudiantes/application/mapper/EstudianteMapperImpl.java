package com.ejemplo.estudiantes.application.mapper;

import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.domain.Estudiante.EstudianteBuilder;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity.EstudianteEntityBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-24T12:28:18-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
)
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public EstudianteEntity mapToEntity(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        EstudianteEntityBuilder estudianteEntity = EstudianteEntity.builder();

        estudianteEntity.apellido( estudiante.getApellido() );
        estudianteEntity.edad( estudiante.getEdad() );
        estudianteEntity.id( estudiante.getId() );
        estudianteEntity.nombre( estudiante.getNombre() );

        return estudianteEntity.build();
    }

    @Override
    public Estudiante mapToDomain(EstudianteEntity estudianteEntity) {
        if ( estudianteEntity == null ) {
            return null;
        }

        EstudianteBuilder estudiante = Estudiante.builder();

        estudiante.apellido( estudianteEntity.getApellido() );
        estudiante.edad( estudianteEntity.getEdad() );
        estudiante.id( estudianteEntity.getId() );
        estudiante.nombre( estudianteEntity.getNombre() );

        return estudiante.build();
    }
}
