package models.cuatro;

public class Accion {
    private String simbolo;
    private String nombreEmpresa;

    public Accion() { }

    public Accion(String simbolo, String nombreEmpresa) {
        this.simbolo = simbolo;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
