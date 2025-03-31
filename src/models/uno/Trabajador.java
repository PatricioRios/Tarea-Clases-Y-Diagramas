package models.uno;

public abstract class Trabajador {
    private String matricula;
    private String documento;

    public Trabajador(String matricula, String documento) {
        this.matricula = matricula;
        this.documento = documento;
    }

    // Método genérico (ejemplo)
    public void realizarTarea(Object parametro) {
        System.out.println("Realizando tarea genérica");
    }

    // Getters y setters
    public String getMatricula() { return matricula; }
    public String getDocumento() { return documento; }
}
