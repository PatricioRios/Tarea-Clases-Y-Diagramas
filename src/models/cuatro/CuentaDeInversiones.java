package models.cuatro;

import java.util.ArrayList;
import java.util.List;

public class CuentaDeInversiones extends Cuenta {
    private Long id;
    private List<PedidoDeAccion> pedidos = new ArrayList<>();

    public CuentaDeInversiones() {
        super();
    }

    public CuentaDeInversiones(Long numero, Double saldo, Cliente cliente, Long id) {
        super(numero, saldo, cliente);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PedidoDeAccion> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDeAccion> pedidos) {
        this.pedidos = pedidos;
    }
}
