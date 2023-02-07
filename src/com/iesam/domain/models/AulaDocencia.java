package src.com.iesam.domain.models;

public class AulaDocencia extends Aula {

    private Integer sillas;
    private String tipoPizarra;


    //getters y setters

    public Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public String getTipoPizarra() {
        return tipoPizarra;
    }

    public void setTipoPizarra(String tipoPizarra) {
        this.tipoPizarra = tipoPizarra;
    }
}

