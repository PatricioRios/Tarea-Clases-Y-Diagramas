package models.tres;

public class RolRequerido {
    private Long id;
    private Rol rol;
    private Integer cantidadMinima;
    private Integer nivelMinimo;

    public RolRequerido() { }

    public RolRequerido(Long id, Rol rol) {
        this.id = id;
        this.rol = rol;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
}
