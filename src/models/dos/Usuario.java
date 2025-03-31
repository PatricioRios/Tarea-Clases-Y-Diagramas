package models.dos;

public class Usuario {
    private long id;
    private String nombre;
    
    public Usuario(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters
    public long getId() { return id; }
    public String getNombre() { return nombre; }
}
