package Ejercicio3;

public class CocheMatriculado extends Coche{
  
    private int aniomatriculacion;
    private int mesmatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factor_contaminacion, int anio, int aniomatriculacion, int mesmatriculacion, String matricula, String dniTitular) {
      super(marca, color, precio, factor_contaminacion, anio);
      this.aniomatriculacion = aniomatriculacion;
      this.mesmatriculacion = mesmatriculacion;
      setMatricula(matricula);
      setDniTitular(dniTitular);
      calculaImpuestoMatriculacion();
    }

    public int getAniomatriculacion() {
      return aniomatriculacion;
    }

    public void setAniomatriculacion(int aniomatriculacion) {
      this.aniomatriculacion = aniomatriculacion;
    }

    public int getMesmatriculacion() {
      return mesmatriculacion;
    }

    public void setMesmatriculacion(int mesmatriculacion) {
      this.mesmatriculacion = mesmatriculacion;
    }

    public double getImpuestoMatriculacion() {
      return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
      calculaImpuestoMatriculacion();
    }

    private void calculaImpuestoMatriculacion() {
      impuestoMatriculacion = getPrecio() / 20;
      if (getAnio() < (2023 - 10)) {
        impuestoMatriculacion += 100;
      }
    }
  }

