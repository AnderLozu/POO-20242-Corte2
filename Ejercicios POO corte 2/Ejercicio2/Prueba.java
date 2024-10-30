package Ejercicio2;

public class Prueba {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("Juan Roberto", "247481992", 20, false, 4500000);
    System.out.println(empleado.toString());
    System.out.println("Clasificación: " + empleado.clasifica());
    
    empleado.subirSalario(8);
    System.out.println("Salario después del aumento: " + empleado.getSalario());
    
    empleado.setEdad(27); 
    System.out.println("Edad después de intentar establecer a 50: " + empleado.getEdad());
  }
}
