package Ejercicio6;

public class AlfombraRedonda extends Alfombra implements IAlfombras {
  private int radio;

  public AlfombraRedonda(String color, int precioMetro, int radio) {
      super(color, precioMetro); 
      this.radio = radio;
  }

  public int getRadio() {
      return radio;
  }

  public void setRadio(int radio) {
      this.radio = radio;
  }


  public double calcularSuperficie() {
      return Math.PI * radio * radio; 
  }

  
  public double calcularPrecio() {
      return calcularSuperficie() * getPrecioMetro(); 
  }
}