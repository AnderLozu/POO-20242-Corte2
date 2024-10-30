package Ejercicio14;

public class PruebaMoto {
  public static void main(String[] args) {
      Moto moto = new Moto();

      System.out.println("Velocidad inicial de la moto: " + moto.getVelocidad());

      moto.acelerar(50);
      System.out.println("Velocidad después de acelerar 50 km/h: " + moto.getVelocidad());

      moto.acelerar(120);
      System.out.println("Velocidad después de acelerar 120 km/h: " + moto.getVelocidad());

      moto.frenar(30);
      System.out.println("Velocidad después de frenar 30 km/h: " + moto.getVelocidad());

      moto.frenar(150);
      System.out.println("Velocidad después de frenar 150 km/h: " + moto.getVelocidad());
  }
}