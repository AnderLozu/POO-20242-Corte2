package Ejercicio5;

public class Prueba {
  public static void main(String[] args) {
    
    ProfesorEmerito profesorEmerito = new ProfesorEmerito("Juan Pérez", 65, 30, 5);

    
    System.out.println("Nombre: " + profesorEmerito.getNombre());
    System.out.println("Edad: " + profesorEmerito.getEdad());
    System.out.println("Años Consolidados: " + profesorEmerito.getAñosConsolidados());
    System.out.println("Años como Emérito: " + profesorEmerito.getAñosEmerito());
}
}
