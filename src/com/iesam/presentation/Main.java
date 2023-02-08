package com.iesam.presentation;

import com.iesam.domain.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        /*
        Todos los datos han sido ya introducidos, pero esto se puede mejorar haciendo que los
        datos sean introducidos por teclado utilizando la clase Scanner.

        Además, se podría mejorar mucho más si en vez de instanciar todo en main (como es el caso),
        se creara un solo método para cada instanciar cada clase. De esta manera se cumpliría
        aún más con el primer principio SOLID (Single Responsability), ya que se crearía una función
        para crear objetos de cada clase. Pero, esto haría que se tuvieran que crear dataStore y casos
        de uso para poder utilizar en otros métodos los diferentes objetos creados.
        Ponemos un ejemplo con la clase Profesor que, como no tiene ningún tipo de composicion, no es
        tan necesario crear su dataStore y casos de uso. El metodo queda comentado y la parte de main
        sería así:
            Main main = new Main(); //Ya que main es static y no puede coger atributos de la propia clase
            main.crearProfesor();
         */


        
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

        //Alumno
        Alumno alumno1 = new Alumno();
        alumno1.setId("10.179");
        alumno1.setDni("00000000A");
        alumno1.setNombre("Sofia");
        alumno1.setApellidos("Jimenez Lapido");
        alumno1.setDireccion("Avila");
        alumno1.setMadre("Maria");
        alumno1.setPadre("Sergio");
        alumno1.setEmail("sofia@gmail.com");

        System.out.println("--- ALUMNO ---");
        System.out.println(alumno1.getId());
        System.out.println(alumno1.getDni());
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getApellidos());
        System.out.println(alumno1.getDireccion());
        System.out.println(alumno1.getMadre());
        System.out.println(alumno1.getPadre());
        System.out.println(alumno1.getEmail());


        //Matricula
        Matricula matricula1 = new Matricula();
        matricula1.setId("12575");
        matricula1.setAlumno(alumno1);
        matricula1.setCurso(curso1);

        System.out.println("--- MATRICULA ---");
        System.out.println(matricula1.getId());
        System.out.println(matricula1.getAlumno().getNombre());
        System.out.println(matricula1.getCurso().getNombre());


        //Profesor
        Profesor profesor1 = new Profesor();
        profesor1.setId("75454");
        profesor1.setDni("11111111X");
        profesor1.setNombre("Pepe");
        profesor1.setApellidos("Perez Perez");
        profesor1.setDireccion("Segovia");
        profesor1.setTituloAcademico("Grado en Ingenieria Informatica");
        String fechaComoTexto = "20/07/202";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        profesor1.setFechaAlta(fecha);

        System.out.println("--- PROFESOR ---");
        System.out.println(profesor1.getId());
        System.out.println(profesor1.getNombre());
        System.out.println(profesor1.getApellidos());
        System.out.println(profesor1.getDni());
        System.out.println(profesor1.getDireccion());
        System.out.println(profesor1.getTituloAcademico());
        System.out.println(profesor1.getFechaAlta());


    }

    /*
    public void crearProfesor() throws ParseException {
        Profesor profesor1 = new Profesor();
        profesor1.setId("75454");
        profesor1.setDni("11111111X");
        profesor1.setNombre("Pepe");
        profesor1.setApellidos("Perez Perez");
        profesor1.setDireccion("Segovia");
        profesor1.setTituloAcademico("Grado en Ingenieria Informatica");
        String fechaComoTexto = "20/07/202";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        profesor1.setFechaAlta(fecha);

        System.out.println("--- PROFESOR ---");
        System.out.println(profesor1.getId());
        System.out.println(profesor1.getNombre());
        System.out.println(profesor1.getApellidos());
        System.out.println(profesor1.getDni());
        System.out.println(profesor1.getDireccion());
        System.out.println(profesor1.getTituloAcademico());
        System.out.println(profesor1.getFechaAlta());

    }

     */
}


