package models.uno;

public class Empleado extends Trabajador {
    private Dedicacion dedicacion;
    private Departamento departamento;

    public Empleado(String matricula, String documento, Dedicacion dedicacion, Departamento departamento) {
        super(matricula, documento);
        this.dedicacion = dedicacion;
        this.departamento = departamento;
        departamento.addEmpleado(this); // Registro automático en el departamento
    }

    // Getters y setters
    public Dedicacion getDedicacion() { return dedicacion; }
    public Departamento getDepartamento() { return departamento; }
}
