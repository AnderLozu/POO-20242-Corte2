package Ejercicio8;

public class Prueba {
  public static void main(String[] args) {
    Alumno alumno = new Alumno("Juan");

    
    alumno.ponerNota(1, 8.5);
    alumno.ponerNota(2, 9.0);
    alumno.ponerNota(3, 7.5);

    
    System.out.println("Nombre del alumno: " + alumno.getNombre());

    
    System.out.println("Nota 1: " + alumno.getNota(1));
    System.out.println("Nota 2: " + alumno.getNota(2));
    System.out.println("Nota 3: " + alumno.getNota(3));

    
    System.out.println("Número de notas: " + alumno.numeroNotas());

    
    System.out.println("Nota máxima: " + alumno.notaMaxima());

    
    alumno.borrarNota(2);
    System.out.println("Nota 2 después de borrar: " + alumno.getNota(2));
  }
}
