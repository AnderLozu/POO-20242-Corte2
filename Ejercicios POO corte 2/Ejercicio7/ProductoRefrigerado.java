package Ejercicio7;

public class ProductoRefrigerado extends Producto {
  private String codOrgSupervision;
  private String fechaEnvasado;
  private double tempMantenimiento;
  private String paisOrigen;

  
  public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismoSupervision, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
      super(fechaCaducidad, numeroLote); 
      this.codOrgSupervision = codigoOrganismoSupervision;
      this.fechaEnvasado = fechaEnvasado;
      this.tempMantenimiento = temperaturaMantenimiento;
      this.paisOrigen = paisOrigen;
  }

  
  public String getCodOrgSupervision() {
      return codOrgSupervision;
  }

  public void setCodOrgSupervision(String codigoOrganismoSupervision) {
      this.codOrgSupervision = codigoOrganismoSupervision;
  }

  public String getFechaEnvasado() {
      return fechaEnvasado;
  }

  public void setFechaEnvasado(String fechaEnvasado) {
      this.fechaEnvasado = fechaEnvasado;
  }

  public double getTempMantenimiento() {
      return tempMantenimiento;
  }

  public void setTempMantenimiento(double temperaturaMantenimiento) {
      this.tempMantenimiento = temperaturaMantenimiento;
  }

  public String getPaisOrigen() {
      return paisOrigen;
  }

  public void setPaisOrigen(String paisOrigen) {
      this.paisOrigen = paisOrigen;
  }

  
  @Override
  public void mostrarInformacion() {
      super.mostrarInformacion(); 
      System.out.println("Código del Organismo de Supervisión: " + codOrgSupervision);
      System.out.println("Fecha de Envasado: " + fechaEnvasado);
      System.out.println("Temperatura de Mantenimiento: " + tempMantenimiento + "°C");
      System.out.println("País de Origen: " + paisOrigen);
  }
}