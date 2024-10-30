package Ejercicio10;

public class Prueba {
  public static void main(String[] args) {
      Persona[] personas = {
          new Persona("Juan", 20, "123456789"),
          new Persona("Ana", 15, "987654321"),
          new Persona("Luis", 70, "456789123")
      };

      for (Persona persona : personas) {
          System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad() + " DNI: " + persona.getDni());
          persona.esMayorDeEdad();
          System.out.println("Hace " + persona.cuantoHaceMayorEdad() + " años que " + persona.getNombre() + " es mayor de edad.");
          
          String nuevoDNI = "A12345678";
          System.out.println("Asignando nuevo DNI a " + persona.getNombre() + ": " + (persona.asignarDNI(nuevoDNI) ? "Asignado" : "No asignado"));
          System.out.println("DNI actual de " + persona.getNombre() + ": " + persona.getDni());

          int edadDeJubilacionDefault = 65; 
          System.out.println(persona.getNombre() + " esta jubilado? " + (persona.estaJubilado(edadDeJubilacionDefault) ? "Sí" : "No"));

          int edadDeJubilacion = 67;
          System.out.println(persona.getNombre() + " esta jubilado a los " + edadDeJubilacion + " años? " +
                  (persona.estaJubilado(edadDeJubilacion) ? "Si" : "No"));
          System.out.println();
      }
  }
}

