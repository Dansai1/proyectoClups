package com.example.proyectoClups;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

//POJOS Clup
@Entity
public class Clup implements Serializable {
    private static final long seralVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    //relacion uno a muchos
    @OneToMany(mappedBy = "clup")
    private List<Cliente> clientes;

    //Getter
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    //
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
}
