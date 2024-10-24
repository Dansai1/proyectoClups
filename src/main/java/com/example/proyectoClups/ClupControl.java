package com.example.proyectoClups;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class ClupControl {
    private final AutomovilServis automovilServis;

    public ClupControl(AutomovilServis automovilServis){
        this.automovilServis=automovilServis;
    }

    @GetMapping("/chips-activos")
    public List<Integer> getChipsActivos(@RequestParam Integer clubId){
        return automovilServis.getActiveChipsByclub(clubId);
    }
}
