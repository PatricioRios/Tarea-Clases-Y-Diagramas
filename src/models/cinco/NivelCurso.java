package models.cinco;

public enum NivelCurso {
    BASICO("Básico"),
    INTERMEDIO("Intermedio"),
    AVANZADO("Avanzado");

    private String nombre;

    NivelCurso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}