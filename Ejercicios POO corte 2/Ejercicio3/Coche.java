package Ejercicio3;

public class Coche {
  private final String marca;
  private String color;
  private int km;
  private double precio;
  private final double factor_contaminacion;
  private final int anio;
  private String matricula;
  private String dniTitular;

  public Coche(String marca, String color, double precio, double factor_contaminacion, int anio) {
    this.marca = marca;
    this.color = color;
    this.km = 0;
    this.precio = precio;
    this.factor_contaminacion = factor_contaminacion;
    this.anio = anio;
    this.matricula = null;
    this.dniTitular = null;
  }

  public String getMarca() {
    return marca;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getKm() {
    return km;
  }

  public void incrementarKm(int km) {
    this.km += km;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getFactorContaminacion() {
    return factor_contaminacion;
  }

  public int getAnio() {
    return anio;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    if (this.matricula == null) {
      this.matricula = matricula;
    }
  }

  public String getDniTitular() {
    return dniTitular;
  }

  public void setDniTitular(String dniTitular) {
    this.dniTitular = dniTitular;
  }

  public void comprarCoche(Coche otroCoche) {
    if (this.dniTitular != null && otroCoche.getDniTitular() != null) {
      this.dniTitular = otroCoche.getDniTitular();
    }
  }
}
