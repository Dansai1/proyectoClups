package com.example.proyectoClups;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//POJO cliente
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private LocalDate fechaDeAlta;
    private LocalDate fechaDeActuali;
    private Boolean activo;
    private Boolean accesoPermitido;

    @OneToMany(mappedBy = "cliente")
    private List<Automovil> automovilList;

    @ManyToOne
    @JoinColumn(name= "id_clup")
    private Clup clup;

    //getter
    public int getIdCliente(){return id;}
    public String getNombre(){return nombre;}
    public LocalDate getFechaDeAlta(){return fechaDeAlta;}
    public LocalDate getFechaDeActuali(){return fechaDeActuali;}
    public Boolean getActivo(){return activo;}
    public Boolean getAccesoPermitido(){return accesoPermitido;}

    //setter

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setFechaDeActuali(LocalDate fechaDeActuali) {
        this.fechaDeActuali = fechaDeActuali;
    }

    public void setAutomovilList(List<Automovil> automovilList) {
        this.automovilList = automovilList;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public void setAccesoPermitido(Boolean accesoPermitido) {
        this.accesoPermitido = accesoPermitido;
    }
}
