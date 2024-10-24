package com.example.proyectoClups;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutomovilServis {
    private final AutomovilRepo automovilRepo;

    public AutomovilServis (AutomovilRepo automovilRepo){
        this.automovilRepo= automovilRepo;
    }

    public List<Automovil> getChipsActivosClup(Integer clupId){
        return automovilRepo.findByClienteClupIdAndActivoTrue(clupId);
    }
}
