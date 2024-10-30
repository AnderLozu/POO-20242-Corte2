package Ejercicio12;

public class Prueba {
  public static void main(String[] args) {
    Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1000);
    Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 500);
    Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 600);

    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);

    Libro libroConMasPaginas = libro1;

    if (libro2.getNumeroPaginas() > libroConMasPaginas.getNumeroPaginas()) {
      libroConMasPaginas = libro2;
    }
    if (libro3.getNumeroPaginas() > libroConMasPaginas.getNumeroPaginas()) {
      libroConMasPaginas = libro3;
    }

    System.out.println("El libro con más páginas es: " + libroConMasPaginas);
  }
}
