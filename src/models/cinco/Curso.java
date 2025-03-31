package models.cinco;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String descripcion;
    private String categoria;
    private int duracion; // en horas
    private String fechaCreacion;
    private String fechaActualizacion;
    private boolean activo;

    private NivelCurso nivel;
    private ArrayList<RecursoDidactico> recursos;
    private ArrayList<Foro> foros;
    private Profesor profesor;
    private ArrayList<TutorDeApoyo> tutoresDeApoyo;

    public Curso(String nombre, String descripcion, String categoria, NivelCurso nivel, int duracion, String fechaCreacion, String fechaActualizacion, boolean activo, ArrayList<RecursoDidactico> recursos, ArrayList<Foro> foros, Profesor profesor, ArrayList<TutorDeApoyo> tutoresDeApoyo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel = nivel;
        this.duracion = duracion;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.activo = activo;
        this.recursos = recursos;
        this.foros = foros;
        this.profesor = profesor;
        this.tutoresDeApoyo = tutoresDeApoyo;
    }

}