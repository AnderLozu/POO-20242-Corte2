package Ejercicio4;

import java.util.Scanner;

public class Prueba {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Empleado[] empleados = new Empleado[4];

    for (int i = 0; i < empleados.length; i++) {
      System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
      String nombre = scanner.nextLine();
      System.out.println("Ingrese el teléfono del empleado " + (i + 1) + ":");
      String telefono = scanner.nextLine();
      empleados[i] = new Empleado(nombre, telefono);
    }

    System.out.println("Datos de los empleados:");
    for (Empleado empleado : empleados) {
      System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
    }

    System.out.println("\nNúmero de empleados instanciados: " + Empleado.getNumeroEmpleados());
    scanner.close();
  }
}
