package Ejercicio7;

public class Producto {
  private String fechaCaducidad;
  private int numLote;

  public Producto(String fechaCaducidad, int numLote) {
      this.fechaCaducidad = fechaCaducidad;
      this.numLote = numLote;
  }

  
  public String getFechaCaducidad() {
      return fechaCaducidad;
  }

  public void setFechaCaducidad(String fechaCaducidad) {
      this.fechaCaducidad = fechaCaducidad;
  }

  public int getNumLote() {
      return numLote;
  }

  public void setNumLote(int numeroLote) {
      this.numLote = numeroLote;
  }

  
  public void mostrarInformacion() {
      System.out.println("Fecha de Caducidad: " + fechaCaducidad);
      System.out.println("Número Lote: " + numLote);
  }
}