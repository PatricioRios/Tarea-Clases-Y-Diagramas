package models.cinco;

public class Progreso {
    private int porcentaje;
    private int tiempoVisualizado;
    private int tiempoTotal;
    private Alumno alumno;
    private Curso curso;

    public Progreso(int porcentaje, int tiempoVisualizado, int tiempoTotal, RecursoDidactico recursoDidactico) {
        this.porcentaje = porcentaje;
        this.tiempoVisualizado = tiempoVisualizado;
        this.tiempoTotal = tiempoTotal;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getTiempoVisualizado() {
        return tiempoVisualizado;
    }

    public void setTiempoVisualizado(int tiempoVisualizado) {
        this.tiempoVisualizado = tiempoVisualizado;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

}

