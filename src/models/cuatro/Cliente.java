package models.cuatro;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private ArrayList<Cuenta> cuentas;

    public Cliente() { }

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
