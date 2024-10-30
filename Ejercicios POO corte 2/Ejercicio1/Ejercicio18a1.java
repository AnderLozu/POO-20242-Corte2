package Ejercicio1;

public class Ejercicio18a1 {
  public static void main(String[] args) {
    Triangulo triangulo = new Triangulo("Triángulo", 0, 0, "Rojo", 5, 10);
    System.out.println("Área del Triángulo: " + triangulo.calcularArea());

    Cuadrado cuadrado = new Cuadrado("Cuadrado", 0, 0, "Azul", 4);
    System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
    System.out.println("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro());
  }
}
