package Ejercicio11;

public class GestionCuentas {
  public static void main(String[] args) {
      Persona persona1 = new Persona("Juan", "Perez", 25);
      Persona persona2 = new Persona("Ana", "Garcia", 17);

      
      Cuenta cuenta1 = new Cuenta(persona1, 500);
      Cuenta cuenta2 = new Cuenta(persona2, 300);

      System.out.println("Saldo cuenta1: " + cuenta1.consultarSaldo());
      System.out.println("Saldo cuenta2: " + cuenta2.consultarSaldo());

      cuenta1.ingresar(300);
      System.out.println("Saldo despues ingreso cuenta1: " + cuenta1.consultarSaldo());

      cuenta1.extraer(600);
      System.out.println("Saldo después extracción cuenta1: " + cuenta1.consultarSaldo());

      cuenta1.ingresar(900);
      System.out.println("Saldo despues ingreso adicional cuenta1: " + cuenta1.consultarSaldo());

      cuenta1.ingresoTotal(cuenta2);
      System.out.println("Saldo despues transferir dinero de cuenta2 a cuenta1:");
      System.out.println("Saldo cuenta1: " + cuenta1.consultarSaldo());
      System.out.println("Saldo cuenta2: " + cuenta2.consultarSaldo());

      cuenta2.extraer(100); 
  }
}

