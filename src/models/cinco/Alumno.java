package models.cinco;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private TipoDeSuscripcion tipoDeSuscripcion;
    private RecursoDidactico recursoDidactico;
    private Profesor profesor;

    public Alumno(String nombre, String apellido, String dni, String email, String telefono, TipoDeSuscripcion tipoDeSuscripcion, RecursoDidactico recursoDidactico, Profesor profesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.tipoDeSuscripcion = tipoDeSuscripcion;
        this.recursoDidactico = recursoDidactico;
        this.profesor = profesor;
    }
}