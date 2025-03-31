package models.uno;

public class Aula {
    private String nombre;
    private Departamento departamento;

    public Aula(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.addAula(this); // Auto-registro en el departamento
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public Departamento getDepartamento() { return departamento; }
}
