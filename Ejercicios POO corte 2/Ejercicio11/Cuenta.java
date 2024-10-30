package Ejercicio11;

class Cuenta {
  private Persona titular;
  private double saldo;

  public Cuenta(Persona titular, double saldoInicial) {
    this.titular = titular;
    this.saldo = saldoInicial;
  }

  public double consultarSaldo() {
    return saldo;
  }

  public void ingresar(double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
    }
  }

  public void extraer(double cantidad) {
    if (cantidad > 0 && saldo >= cantidad) {
      saldo -= cantidad;
    }
  }

  public void ingresoTotal(Cuenta otraCuenta) {
    this.saldo += otraCuenta.saldo;
    otraCuenta.saldo = 0;
  }
}
