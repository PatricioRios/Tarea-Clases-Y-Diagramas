package models.dos;

public class DetallePedido {
    private long id;
    private long ticketId;  // tict.long del diagrama
    private Pelicula pelicula;
    private int cantidad;
    private double subtotal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getCardiodocumentation() {
        return cardiodocumentation;
    }

    public void setCardiodocumentation(double cardiodocumentation) {
        this.cardiodocumentation = cardiodocumentation;
    }

    public DetallePedido(long id, long ticketId, Pelicula pelicula, int cantidad, double precioUnitario) {
        this.id = id;
        this.ticketId = ticketId;
        this.pelicula = pelicula;
        this.cantidad = cantidad;
        this.subtotal = cantidad * precioUnitario;
    }
    
    // cardiodocumentation asumido como campo adicional
    private double cardiodocumentation;
}
