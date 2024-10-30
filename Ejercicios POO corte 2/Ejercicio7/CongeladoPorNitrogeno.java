package Ejercicio7;

public class CongeladoPorNitrogeno extends ProductoCongelado {
  private String Congelacion;
  private int Exposicion; 

  
  public CongeladoPorNitrogeno(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, String Congelacion, int Exposicion) {
      super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen, tempMantenimiento);
      this.Congelacion = Congelacion;
      this.Exposicion = Exposicion;
  }

  
  public String getCongelacion() {
      return Congelacion;
  }

  public void setCongelacion(String metodoCongelacion) {
      this.Congelacion = metodoCongelacion;
  }

  public int getExposicion() {
      return Exposicion;
  }

  public void setExposicion(int tiempoExposicion) {
      this.Exposicion = tiempoExposicion;
  }

  
  @Override
  public void mostrarInformacion() {
      super.mostrarInformacion(); 
      System.out.println("Congelacion: " + Congelacion);
      System.out.println("Tiempo de Exposición al Nitrógeno: " + Exposicion);
  }
}
