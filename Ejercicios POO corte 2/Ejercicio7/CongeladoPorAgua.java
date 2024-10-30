package Ejercicio7;

public class CongeladoPorAgua extends ProductoCongelado {
  private double salinidad;

  
  public CongeladoPorAgua(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double salinidad) {
      super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen, tempMantenimiento);
      this.salinidad = salinidad;
  }

  
  public double getSalinidad() {
      return salinidad;
  }

  public void setSalinidad(double salinidad) {
      this.salinidad = salinidad;
  }

  
  @Override
  public void mostrarInformacion() {
      super.mostrarInformacion(); 
      System.out.println("Salinidad del Agua: " + salinidad);
  }
}