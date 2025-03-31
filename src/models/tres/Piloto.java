package models.tres;

public class Piloto {
    private Long id;
    private String nombre;
    private Aerolinea aerolinea; // Relación N..1 con Aerolinea
    private Integer nivelDeExperiencia; // 1 a 10

    public Piloto() { }

    public Piloto(Long id, String nombre, Aerolinea aerolinea) {
        this.id = id;
        this.nombre = nombre;
        this.aerolinea = aerolinea;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Aerolinea getAerolinea() { return aerolinea; }
    public void setAerolinea(Aerolinea aerolinea) { this.aerolinea = aerolinea; }
}
