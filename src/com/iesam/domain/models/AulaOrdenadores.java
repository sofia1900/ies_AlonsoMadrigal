package src.com.iesam.domain.models;

public class AulaOrdenadores extends Aula {

    private Integer cantidadOrdenadores;
    private  String tipoOrdenadores;


    //getters y setters

    public Integer getCantidadOrdenadores() {
        return cantidadOrdenadores;
    }

    public void setCantidadOrdenadores(Integer cantidadOrdenadores) {
        this.cantidadOrdenadores = cantidadOrdenadores;
    }

    public String getTipoOrdenadores() {
        return tipoOrdenadores;
    }

    public void setTipoOrdenadores(String tipoOrdenadores) {
        this.tipoOrdenadores = tipoOrdenadores;
    }
}
