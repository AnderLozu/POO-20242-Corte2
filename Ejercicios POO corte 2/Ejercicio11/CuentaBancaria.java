package Ejercicio11;

public class CuentaBancaria {
  private String numeroCuenta;
  private double saldo;
  private String nombreTitular;

  public CuentaBancaria(String numeroCuenta, double saldo, String nombreTitular) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.nombreTitular = nombreTitular;
  }

  public void ingreso(int cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
    }
  }

  public void extraccion(int cantidad) {
    if (cantidad > 0 && cantidad <= saldo) {
      saldo -= cantidad;
    }
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNombreTitular() {
    return nombreTitular;
  }
}
