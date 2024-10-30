package Ejercicio10;

public class Persona {
  private String nombre;
  private int edad;
  private String dni;

  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  public void esMayorDeEdad() {
    if (edad >= 18) {
      System.out.println(nombre + " es mayor de edad.");
    } else {
      System.out.println(nombre + " no es mayor de edad.");
    }
  }
  
  public int cuantoHaceMayorEdad() {
    return Math.max(0, edad - 18);
  }

  public boolean asignarDNI(String dni) {
    if (dni.length() == 9) {
      this.dni = dni;
      return true;
    }
    return false;
  }

  public boolean estaJubilado(int edadDeJubilacion) {
    return edad >= edadDeJubilacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  
}
