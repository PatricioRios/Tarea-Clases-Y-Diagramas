package models.uno;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Aula> aulas = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para gestionar aulas y empleados
    public void addAula(Aula aula) {
        aulas.add(aula);
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public List<Aula> getAulas() { return aulas; }
    public List<Empleado> getEmpleados() { return empleados; }
}
