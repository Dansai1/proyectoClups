package com.example.proyectoClups;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//interaccion con la basa de datos
public interface AutomovilRepo extends JpaRepository<Automovil, Integer> {
    List<Automovil> findByClienteClupIdAndActivoTrue(Integer clubId);
}
