package com.example.proyectoClups;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//interaccion con la basa de datos para las diferentes entidades
public interface AutomovilRepo extends JpaRepository<Automovil, Integer> {
    //verificacion si el auto y el cliente dueño de dicho carro estan activos
    List<Automovil> findByClienteClupIdAndActivoTrueAndClienteActivoTrue(Integer clubId);
}
