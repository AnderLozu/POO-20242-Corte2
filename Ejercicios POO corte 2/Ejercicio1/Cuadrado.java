package Ejercicio1;

public class Cuadrado extends Forma{
  private double lado;

  public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
    
    super(nombre, posicionX, posicionY, color);
    this.lado = lado;
  }

  
  public double calcularArea() {
    return lado * lado;
  }

  public double calcularPerimetro() {
    return 4 * lado;
  }

  // Getters y Setters
  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }
}
