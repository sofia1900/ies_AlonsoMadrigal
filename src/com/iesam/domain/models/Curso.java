package src.com.iesam.domain.models;

public class Curso {

    private String id;
    private String nombre;
    private String descripcion;
    private Aula aula;


    //getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Aula getAulas() {
        return aula;
    }

    public void setAulas(Aula aula) {
        this.aula = aula;
    }
}

