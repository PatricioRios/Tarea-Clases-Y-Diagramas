package models.uno;

public class Profesor extends Trabajador {
    private Categoria categoria;

    public Profesor(String matricula, String documento, Categoria categoria) {
        super(matricula, documento);
        this.categoria = categoria;
    }

    // Getters y setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
