package models.dos;

public class Pelicula {
    private long id;
    private String titulo;
    private double precioAlquiler;
    private double precioVenta;
    private int cantidadDisponible;
    private boolean disponible;
    
    public Pelicula(long id, String titulo, double precioAlquiler, double precioVenta, int cantidadDisponible) {
        this.id = id;
        this.titulo = titulo;
        this.precioAlquiler = precioAlquiler;
        this.precioVenta = precioVenta;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = cantidadDisponible > 0;
    }
    
    // Getters y setters
    public boolean isDisponible() { return disponible; }
    public void actualizarDisponibilidad() { this.disponible = cantidadDisponible > 0; }
}
