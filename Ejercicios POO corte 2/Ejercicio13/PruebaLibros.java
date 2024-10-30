package Ejercicio13;

public class PruebaLibros {
  public static void main(String[] args) {
      ConjuntoLibros biblioteca = new ConjuntoLibros(5);

      Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1000, 5);
      Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel Garcia Márquez", 500, 4);

      
      
      System.out.println(biblioteca.añadirLibro(libro1) ? "Libro 1 añadido." : "No se pudo añadir el Libro 1.");
      System.out.println(biblioteca.añadirLibro(libro2) ? "Libro 2 añadido." : "No se pudo añadir el Libro 2.");

      
      System.out.println("Consultando el libro El Quijote:");
      biblioteca.mostrarLibroTitulo("El Quijote");

      
      System.out.println("Eliminando Cien Años de Soledad por título...");
      biblioteca.eliminarLibro("Cien Años de Soledad");
      System.out.println("Eliminando Miguel de Cervantes por autor...");
      biblioteca.eliminarLibro("Miguel de Cervantes");

      
      System.out.println("Estado de la biblioteca tras eliminaciones:");
      biblioteca.mostrarTodosLosLibros();

      
      Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafon", 600, 5);
      System.out.println("Añadiendo un nuevo libro a la biblioteca...");
      biblioteca.añadirLibro(libro3);

      // Mostrar el contenido final del array
      System.out.println("Contenido final de la biblioteca:");
      biblioteca.mostrarTodosLosLibros();
  }
}

