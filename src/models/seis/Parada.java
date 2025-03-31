package models.seis;

public class Parada {
    private String nombre;
    private String direccion;
    private String coordenadas;
    private String tipoDeParada;
    private String idParada;
    private String idLineaDeTransporte;

    public Parada(String nombre, String direccion, String coordenadas, String tipoDeParada, String idParada, String idLineaDeTransporte) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.tipoDeParada = tipoDeParada;
        this.idParada = idParada;
        this.idLineaDeTransporte = idLineaDeTransporte;
    }

}