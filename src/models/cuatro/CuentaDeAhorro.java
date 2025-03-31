package models.cuatro;

public class CuentaDeAhorro extends Cuenta {
    private Double tasaDeInteres;

    public CuentaDeAhorro() {
        super();
    }

    public CuentaDeAhorro(Long numero, Double saldo, Cliente cliente, Double tasaDeInteres) {
        super(numero, saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    public Double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(Double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
