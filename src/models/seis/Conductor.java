package models.seis;

public class Conductor {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private Licencia licencia;
    private UnidadDeTransporte unidadDeTransporte;

    public Conductor(String nombre, String apellido, String dni, String telefono, String email, TipoDeUsuario tipoDeUsuario, Licencia licencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.licencia = licencia;
    }
}