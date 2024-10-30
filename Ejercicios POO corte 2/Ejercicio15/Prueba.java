package Ejercicio15;

public class Prueba {
      public static void main(String[] args) {
        Triangulo[] triangulos = {
            new Triangulo(10, 5),
            new Triangulo(8, 3),
            new Triangulo(6, 4)
        };

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Triángulo " + (i + 1) + ": Base = " + triangulos[i].getBase() + ", Altura = " + triangulos[i].getAltura() + ", Área = " + triangulos[i].calcularArea());
        }

        triangulos[0].setBase(12);
        triangulos[0].setAltura(6);

        System.out.println("Triángulo 1: Base = " + triangulos[0].getBase() + ", Altura = " + triangulos[0].getAltura() + ", Nueva Área = " + triangulos[0].calcularArea());
    }
}


