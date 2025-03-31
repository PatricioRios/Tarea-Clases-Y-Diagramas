package models.seis;

public class Mantenimiento {
    private TipoDeMantenimiento tipoDeMantenimiento;
    private String fechaInicio;
    private String fechaFin;
    private String observaciones;
    private UnidadDeTransporte unidadDeTransporte;

    public Mantenimiento(
            TipoDeMantenimiento tipoDeMantenimiento,
            String fechaInicio,
            String fechaFin,
            String observaciones,
            LineaDeTransporte lineaDeTransporte,
            UnidadDeTransporte unidadDeTransporte
    ) {
        this.tipoDeMantenimiento = tipoDeMantenimiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observaciones = observaciones;
        this.unidadDeTransporte = unidadDeTransporte;
    }

}