package models.cuatro;

public class PedidoDeAccion {
    private int cantidad;
    private Double precioCompra;
    private Double comision;
    private Accion accion;
    private CuentaDeInversiones cuentaDeInversiones; // Relación N..1 (muchos pedidos en una cuenta)

    public PedidoDeAccion() { }

    public PedidoDeAccion(int cantidad, Double precioCompra, Double comision, Accion accion, CuentaDeInversiones cuentaDeInversiones) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.comision = comision;
        this.accion = accion;
        this.cuentaDeInversiones = cuentaDeInversiones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public CuentaDeInversiones getCuentaDeInversiones() {
        return cuentaDeInversiones;
    }

    public void setCuentaDeInversiones(CuentaDeInversiones cuentaDeInversiones) {
        this.cuentaDeInversiones = cuentaDeInversiones;
    }
}
