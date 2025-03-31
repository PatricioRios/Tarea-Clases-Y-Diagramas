package models.uno;


// Clase Oficina (campos genéricos como ejemplo)
public class Oficina {
    private String ubicacion;
    private int capacidad;
    private String responsable;

    public Oficina(String ubicacion, int capacidad, String responsable) {
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.responsable = responsable;
    }

    // Getters y setters
    public String getUbicacion() { return ubicacion; }
    public int getCapacidad() { return capacidad; }
    public String getResponsable() { return responsable; }
}