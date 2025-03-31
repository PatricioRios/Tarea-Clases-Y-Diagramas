package models.tres;

public class AsignacionRol {
    private Long id;
    private Piloto piloto;
    private Vuelo vuelo;
    private RolRequerido rolRequerido;

    public AsignacionRol() { }

    public AsignacionRol(Long id, Piloto piloto, Vuelo vuelo, RolRequerido rolRequerido) {
        this.id = id;
        this.piloto = piloto;
        this.vuelo = vuelo;
        this.rolRequerido = rolRequerido;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Piloto getPiloto() { return piloto; }
    public void setPiloto(Piloto piloto) { this.piloto = piloto; }
    public Vuelo getVuelo() { return vuelo; }
    public void setVuelo(Vuelo vuelo) { this.vuelo = vuelo; }
    public RolRequerido getRolRequerido() { return rolRequerido; }
    public void setRolRequerido(RolRequerido rolRequerido) { this.rolRequerido = rolRequerido; }
}
