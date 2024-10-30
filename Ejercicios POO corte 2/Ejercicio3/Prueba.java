package Ejercicio3;

public class Prueba {
  public static void main(String[] args) {
    Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.05, 2015);
    Coche coche2 = new Coche("Honda", "Azul", 15000, 0.03, 2018);

    coche1.setDniTitular("12345678A");
    coche2.setDniTitular("87654321B");

    coche1.comprarCoche(coche2);

    Cochematriculado cocheMatriculado = new Cochematriculado("1234ABC", "12345678A", "Ford", "Negro", 25000, 0.04, 2010, 2010, 5);
    cocheMatriculado.calculaImpuestoMatriculacion();

    System.out.println("Impuesto de matriculación: " + cocheMatriculado.getImpuestoMatriculacion());
  }
}
