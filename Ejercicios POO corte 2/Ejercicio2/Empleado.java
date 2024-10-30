package Ejercicio2;

public class Empleado {
  private String nombre;
  private String dni;
  private int edad;
  private boolean casado;
  private double salario;

  public Empleado() {
  }

  public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
    this.casado = casado;
    this.salario = salario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    if (edad < 18 || edad > 45) {
      System.out.println("Edad debe estar entre 18 y 45 años.");
    }
    this.edad = edad;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String clasifica() {
    if (edad <= 21) {
      return "Principiante";
    } else if (edad <= 35) {
      return "Intermedio";
    } else {
      return "Senior";
    }
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + " DNI: " + dni + " Edad: " + edad + " Casado: " + casado + " Salario: " + salario;
  }

  public void subirSalario(int porcentaje) {
    this.salario += this.salario * porcentaje / 100;
  }

  
}
