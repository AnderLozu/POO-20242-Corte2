package Ejercicio12;

public class Libro {
  private String ISBN;
  private String titulo;
  private String autor;
  private int numeroPaginas;

  public Libro(String titulo, String autor, int numeroPaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  @Override
  public String toString() {
    return "El libro con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroPaginas + " paginas";
  }
}
