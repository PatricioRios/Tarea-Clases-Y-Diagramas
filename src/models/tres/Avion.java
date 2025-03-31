package models.tres;

public class Avion {

    private Long id;
    private Boolean enVuelo;
    private AvionState avionState;
    private TipoAvion tipoAvion;

    public Avion() { }

    public Avion(Long id, Boolean enVuelo, AvionState avionState, Aerolinea aerolinea, TipoAvion tipoAvion) {
        this.id = id;
        this.enVuelo = enVuelo;
        this.avionState = avionState;
        this.tipoAvion = tipoAvion;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Boolean getEnVuelo() { return enVuelo; }
    public void setEnVuelo(Boolean enVuelo) { this.enVuelo = enVuelo; }
    public AvionState getAvionState() { return avionState; }
    public void setAvionState(AvionState avionState) { this.avionState = avionState; }
    public TipoAvion getTipoAvion() { return tipoAvion; }
    public void setTipoAvion(TipoAvion tipoAvion) { this.tipoAvion = tipoAvion; }
}
