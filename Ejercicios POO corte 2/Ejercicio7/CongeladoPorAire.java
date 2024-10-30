package Ejercicio7;

public class CongeladoPorAire extends ProductoCongelado {
  private double porcentajeNitrogeno;
  private double porcentajeOxigeno;
  private double porcentajeDioxidoCarbono;
  private double porcentajeVaporAgua;


  public CongeladoPorAire(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
      super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen, tempMantenimiento);
      this.porcentajeNitrogeno = porcentajeNitrogeno;
      this.porcentajeOxigeno = porcentajeOxigeno;
      this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
      this.porcentajeVaporAgua = porcentajeVaporAgua;
  }


  public double getPorcentajeNitrogeno() {
      return porcentajeNitrogeno;
  }

  public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
      this.porcentajeNitrogeno = porcentajeNitrogeno;
  }

  public double getPorcentajeOxigeno() {
      return porcentajeOxigeno;
  }

  public void setPorcentajeOxigeno(double porcentajeOxigeno) {
      this.porcentajeOxigeno = porcentajeOxigeno;
  }

  public double getPorcentajeDioxidoCarbono() {
      return porcentajeDioxidoCarbono;
  }

  public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
      this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
  }

  public double getPorcentajeVaporAgua() {
      return porcentajeVaporAgua;
  }

  public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
      this.porcentajeVaporAgua = porcentajeVaporAgua;
  }


  @Override
  public void mostrarInformacion() {
      super.mostrarInformacion();
      System.out.println("Composición del Aire: ");
      System.out.println(" Nitrógeno: " + porcentajeNitrogeno);
      System.out.println(" Oxígeno: " + porcentajeOxigeno);
      System.out.println(" Dióxido de Carbono: " + porcentajeDioxidoCarbono);
      System.out.println(" Vapor de Agua: " + porcentajeVaporAgua);
  }
}
