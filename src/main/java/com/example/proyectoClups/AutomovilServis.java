package com.example.proyectoClups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/*encargado de controlar los diferentes servicios relacionados con los automoviles
* en este caso de varificar si estan activos */
@Service
public class AutomovilServis {
    @Autowired
    private final AutomovilRepo automovilRepo;

    public AutomovilServis (AutomovilRepo automovilRepo){
        this.automovilRepo= automovilRepo;
    }

    public List<Integer> getActiveChipsByclub(int idClup){
        List<Automovil> automovils= automovilRepo.findByClienteClupIdAndActivoTrueAndClienteActivoTrue(idClup);
        return automovils.stream().map(Automovil::getIdChip).collect(Collectors.toList());
    }
}
