package Ejercicio7;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ProductoFresco productoFresco = new ProductoFresco("2025-12-31", 101, "2023-10-20", "España");
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("2024-06-30", 102, "ORG12345", "2023-11-01", -5.0, "Francia");
        CongeladoPorAgua congeladoAgua = new CongeladoPorAgua("2025-09-15", 103, "2023-09-15", "Noruega", -18.0, 3.5);
        CongeladoPorAire congeladoAire = new CongeladoPorAire("2026-03-10", 104, "2023-12-10", "Canadá", -20.0, 78.0, 21.0, 0.03, 0.97);
        CongeladoPorNitrogeno congeladoNitrogeno = new CongeladoPorNitrogeno("2027-08-05", 105, "2024-01-05", "Argentina", -30.0, "Inmersión Rápida", 15);

        
        System.out.println("Seleccione el tipo de producto que desea ver:");
        System.out.println("1. Producto Fresco");
        System.out.println("2. Producto Refrigerado");
        System.out.println("3. Producto Congelado por Agua");
        System.out.println("4. Producto Congelado por Aire");
        System.out.println("5. Producto Congelado por Nitrógeno");
        
        int opcion = scanner.nextInt();
        

        
        switch (opcion) {
            case 1:
                System.out.println("Información del Producto Fresco:");
                productoFresco.mostrarInformacion();
                break;
            case 2:
                System.out.println("Información del Producto Refrigerado:");
                productoRefrigerado.mostrarInformacion();
                break;
            case 3:
                System.out.println("Información del Producto Congelado por Agua:");
                congeladoAgua.mostrarInformacion();
                break;
            case 4:
                System.out.println("Información del Producto Congelado por Aire:");
                congeladoAire.mostrarInformacion();
                break;
            case 5:
                System.out.println("Información del Producto Congelado por Nitrógeno:");
                congeladoNitrogeno.mostrarInformacion();
                break;
            default:
                System.out.println("Opción no válida. Por favor seleccione un número entre 1 y 5.");
                break;
        }

        
    }
}
