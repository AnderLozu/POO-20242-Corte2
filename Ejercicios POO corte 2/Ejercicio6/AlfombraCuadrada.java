package Ejercicio6;

public class AlfombraCuadrada extends Alfombra implements IAlfombras {
  private int lado;

  
  public AlfombraCuadrada(String color, int precioMetro, int lado) {
      super(color, precioMetro); 
      this.lado = lado;
  }

  
  public int getLado() {
      return lado;
  }

  public void setLado(int lado) {
      this.lado = lado;
  }

  
  
  public double calcularSuperficie() {
      return lado * lado; 
  }

  
  public double calcularPrecio() {
      return calcularSuperficie() * getPrecioMetro(); 
  }
}
