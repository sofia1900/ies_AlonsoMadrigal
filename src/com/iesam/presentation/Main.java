package src.com.iesam.presentation;

import src.com.iesam.domain.models.AulaOrdenadores;

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

    }
}

