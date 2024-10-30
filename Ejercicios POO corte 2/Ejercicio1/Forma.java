package Ejercicio1;

public class Forma {
  private String nombre;
  private double posicionX;
  private double posicionY;
  private String color;

  public Forma(String nombre, double posicionX, double posicionY, String color) {
    this.nombre = nombre;
    this.posicionX = posicionX;
    this.posicionY = posicionY;
    this.color = color;
  }

  public double calcularArea() {
    return 0; // Método abstracto en la práctica, pero no se puede definir abstracto en una clase concreta
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPosicionX() {
    return posicionX;
  }

  public void setPosicionX(double posicionX) {
    this.posicionX = posicionX;
  }

  public double getPosicionY() {
    return posicionY;
  }

  public void setPosicionY(double posicionY) {
    this.posicionY = posicionY;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

