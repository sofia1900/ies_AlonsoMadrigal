package com.iesam.presentation;

import com.iesam.domain.models.Asignatura;
import com.iesam.domain.models.AulaOrdenadores;
import com.iesam.domain.models.Curso;

public class Main {
    public static void main(String[] args) {


        //Creando un aula
        AulaOrdenadores aulaOrdenadores1 = new AulaOrdenadores();

        aulaOrdenadores1.setId("C15");
        aulaOrdenadores1.setPlanta(2);
        aulaOrdenadores1.setCapacidad(30);
        aulaOrdenadores1.setCantidadOrdenadores(27);
        aulaOrdenadores1.setTipoOrdenadores("Intel i3, 16 GB RAM, 256 GB SSD");

        System.out.println(aulaOrdenadores1.getId());
        System.out.println(aulaOrdenadores1.getPlanta());
        System.out.println(aulaOrdenadores1.getCapacidad());
        System.out.println(aulaOrdenadores1.getCantidadOrdenadores());
        System.out.println(aulaOrdenadores1.getTipoOrdenadores());


        //Creaando un curso
        Curso curso1 = new Curso();

        curso1.setId("DAM-2495");
        curso1.setNombre("DAM-2022-2023");
        curso1.setDescripcion("Ciclo Superior en Desarrollo de Aplicaciones Multiplataforma, también conocido como DAM, es una formación profesional que se centra en la programación de software para aplicaciones móviles o de escritorio");
        curso1.setAulas(aulaOrdenadores1);

        System.out.println("--------------------");
        System.out.println(curso1.getId());
        System.out.println(curso1.getNombre());
        System.out.println(curso1.getDescripcion());

        System.out.println(curso1.getAulas().getId());
        //De esta manera solo se podran imprimir los atributos de la clase padre,
        // para imprimir otros atributos, habra que añadir a Curso el tipo de aula d
        // el que se quieran imprimir los atributos.


        //asignatura
        Asignatura asignatura1 = new Asignatura();
        asignatura1.setId("1");
        asignatura1.setNombre("Entorno de Desarrollo");
        asignatura1.setCurso(curso1);

        System.out.println("--- ASIGNATURA ---");
        System.out.println(asignatura1.getId());
        System.out.println(asignatura1.getNombre());
        System.out.println(asignatura1.getCurso().getNombre());


    }
}


