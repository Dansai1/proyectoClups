package com.example.proyectoClups;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

//POJO autos
@Entity
public class Automovil implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String color;
    private String placas;
    private int idChip;
    private String marca;
    private String modelo;
    private LocalDate fechaAlta;
    private LocalDate fechaActualizacion;
    private boolean activo;

    @ManyToOne
    @JoinColumn(name= "id_cliente")
    private Cliente cliente;

    //getter
    public int getId(){
        return id;
    }
    public String getColor(){return color;}
    public String getPlacas(){return placas;}
    public int getIdChip(){return idChip;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public LocalDate getFechaAlta(){return fechaAlta;}
    public LocalDate getFechaActualizacion(){return fechaActualizacion;}
    public boolean getActivo(){return activo;}

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setIdChip(int idChip) {
        this.idChip = idChip;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
