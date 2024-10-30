package Ejercicio6;

public class Prueba {
    public static void main(String[] args) {
        
        AlfombraCuadrada alfombraCuadrada = new AlfombraCuadrada("Rojo", 50, 4);
        AlfombraRedonda alfombraRedonda = new AlfombraRedonda("Azul", 60, 3);

        
        System.out.println("Alfombra Cuadrada:");
        System.out.println("Color: " + alfombraCuadrada.getColor());
        System.out.println("Precio x metro: " + alfombraCuadrada.getPrecioMetro());
        System.out.println("Lado: " + alfombraCuadrada.getLado());
        System.out.println("Superficie: " + alfombraCuadrada.calcularSuperficie() + " m2");
        System.out.println("Precio total: " + alfombraCuadrada.calcularPrecio());
        System.out.println();

        
        System.out.println("Alfombra Redonda:");
        System.out.println("Color: " + alfombraRedonda.getColor());
        System.out.println("Precio x metro: " + alfombraRedonda.getPrecioMetro());
        System.out.println("Radio: " + alfombraRedonda.getRadio());
        System.out.println("Superficie: " + alfombraRedonda.calcularSuperficie() + " m²");
        System.out.println("Precio total: " + alfombraRedonda.calcularPrecio());
    }
}

