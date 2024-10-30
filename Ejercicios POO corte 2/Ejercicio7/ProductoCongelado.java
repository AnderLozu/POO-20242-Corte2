package Ejercicio7;

public class ProductoCongelado extends Producto {
  private String fechaEnvasado;
  private String paisOrigen;
  private double tempMantenimiento;

  
  public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento) {
      super(fechaCaducidad, numeroLote); 
      this.fechaEnvasado = fechaEnvasado;
      this.paisOrigen = paisOrigen;
      this.tempMantenimiento = temperaturaMantenimiento;
  }

  
  public String getFechaEnvasado() {
      return fechaEnvasado;
  }

  public void setFechaEnvasado(String fechaEnvasado) {
      this.fechaEnvasado = fechaEnvasado;
  }

  public String getPaisOrigen() {
      return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
      this.paisOrigen = paisOrigen;
  }

  public double getTempMantenimiento() {
      return tempMantenimiento;
  }

  public void setTempMantenimiento(double temperaturaMantenimiento) {
      this.tempMantenimiento = temperaturaMantenimiento;
  }

  
  @Override
  public void mostrarInformacion() {
      super.mostrarInformacion(); 
      System.out.println("Fecha Envasado: " + fechaEnvasado);
      System.out.println("Pais Origen: " + paisOrigen);
      System.out.println("Temperatura Mantenimiento: " + tempMantenimiento);
  }
}
