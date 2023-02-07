package com.iesam.domain.models;

import java.util.Date;

public class Profesor extends Persona{
    private String tituloAcademico;
    private Date fechaAlta;


    //Getters and Setters

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

}
