package Ejercicio13;

public class ConjuntoLibros {
  
  private Libro[] libros;
  private int cantidadActual;

  public ConjuntoLibros(int tamaño) {
    libros = new Libro[tamaño];
    cantidadActual = 0;
  }

  public boolean añadirLibro(Libro nuevoLibro) {
    if (cantidadActual >= libros.length) return false;
    
    for (int i = 0; i < cantidadActual; i++) {
      if (libros[i].getTitulo().equalsIgnoreCase(nuevoLibro.getTitulo())) return false;
    }
    
    libros[cantidadActual++] = nuevoLibro;
    return true;
  }

  public boolean eliminarLibro(String criterio) {
    for (int i = 0; i < cantidadActual; i++) {
      if (libros[i].getTitulo().equalsIgnoreCase(criterio) || libros[i].getAutor().equalsIgnoreCase(criterio)) {
        libros[i] = libros[cantidadActual - 1];
        libros[cantidadActual - 1] = null;
        cantidadActual--;
        return true;
      }
    }
    return false;
  }

  public void mostrarMayorYMenorCal() {
    if (cantidadActual == 0) {
      System.out.println("No hay libros en el conjunto.");
      return;
    }

    Libro mayorCalificacion = libros[0];
    Libro menorCalificacion = libros[0];

    for (int i = 1; i < cantidadActual; i++) {
      if (libros[i].getCalificacion() > mayorCalificacion.getCalificacion()) {
        mayorCalificacion = libros[i];
      }
      if (libros[i].getCalificacion() < menorCalificacion.getCalificacion()) {
        menorCalificacion = libros[i];
      }
    }

    System.out.println("Libro mayor calificacion: " + mayorCalificacion);
    System.out.println("Libro menor calificacion: " + menorCalificacion);
  }

  public void mostrarLibroTitulo(String titulo) {
    for (int i = 0; i < cantidadActual; i++) {
      if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
        System.out.println(libros[i]);
        return;
      }
    }
    System.out.println("Libro no encontrado.");
  }

  public void mostrarTodosLosLibros() {
    if (cantidadActual == 0) {
      System.out.println("No hay libros en el conjunto.");
    } else {
      for (int i = 0; i < cantidadActual; i++) {
        System.out.println(libros[i]);
      }
    }
  }


}



