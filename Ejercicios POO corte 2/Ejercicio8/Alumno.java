package Ejercicio8;

public class Alumno {
  private String nombre;
  private double[] notas;

  public Alumno(String nombre) {
    this.nombre = nombre;
    this.notas = new double[3];
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean ponerNota(int evaluacion, double nota) {
    if (evaluacion < 1 || evaluacion > 3 || nota < 1 || nota > 10) {
      return false;
    }
    notas[evaluacion - 1] = nota;
    return true;
  }

  public boolean borrarNota(int evaluacion) {
    if (evaluacion < 1 || evaluacion > 3) {
      return false;
    }
    notas[evaluacion - 1] = 0;
    return true;
  }

  public int numeroNotas() {
    int count = 0;
    for (double nota : notas) {
      if (nota != 0) {
        count++;
      }
    }
    return count;
  }

  public double notaMaxima() {
    double maximo = -1;
    for (double nota : notas) {
      if (nota > maximo) {
        maximo = nota;
      }
    }
    return maximo;
  }

  public boolean tieneNota(int evaluacion) {
    if (evaluacion < 1 || evaluacion > 3) {
      return false;
    }
    return notas[evaluacion - 1] != 0;
  }

  public double getNota(int evaluacion) {
    if (evaluacion < 1 || evaluacion > 3) {
      return -1;
    }
    return notas[evaluacion - 1];
  }
}
