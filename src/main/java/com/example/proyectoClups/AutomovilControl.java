package com.example.proyectoClups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*controlador para las diferentes peticiones relacionadas con los automoviles*/
@RestController
@RequestMapping
public class AutomovilControl {
    @Autowired
    private AutomovilServis automovilServis;

    @GetMapping
    public List<Integer> getChipsActivos(@RequestParam int clupId){
        return automovilServis.getActiveChipsByclub(clupId);
    }
}
