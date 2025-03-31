package models.tres;

import java.util.ArrayList;

public class TipoAvion {
    private Long id;
    private String model; // Ej: "Boeing 737", "Airbus A320", etc.
    private ArrayList<RolRequerido> rolesRequeridos;

    public TipoAvion() { }

    public TipoAvion(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
