package models.dos;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private Date fecha;
    private double montoTotal;
    private TipoPedido tipo;
    private List<DetallePedido> detalles = new ArrayList<>();
    
    public Pedido(long id, Date fecha, TipoPedido tipo) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    
    public void agregarDetalle(DetallePedido detalle) {
        detalles.add(detalle);
        montoTotal += detalle.getSubtotal();
    }
}
