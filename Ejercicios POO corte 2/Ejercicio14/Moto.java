package Ejercicio14;

public class Moto {
  private int velocidad;

  public Moto() {
    this.velocidad = 0;
  }

  public void acelerar(int incremento) {
    if (velocidad + incremento <= 150) {
      velocidad += incremento;
    } else {
      velocidad = 150;
    }
  }

  public void frenar(int decremento) {
    if (velocidad - decremento >= 0) {
      velocidad -= decremento;
    } else {
      velocidad = 0;
    }
  }

  public int getVelocidad() {
    return velocidad;
  }
}
