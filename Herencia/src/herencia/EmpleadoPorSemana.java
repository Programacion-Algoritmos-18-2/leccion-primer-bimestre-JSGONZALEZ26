/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Jairo
 */
public class EmpleadoPorSemana extends Empleado {
//Procedimientos similares a la clase Empleado Fijo
    public int numeroSemanas = 0;
    public double valorPorSemana = 0;

    public EmpleadoPorSemana(String n, String a, String b, double e,int f, double g) {
        super(n, a, b, e);
        setNumeroSemanas(f);
        setValorPorSemana(g);
    }

    public int getNumeroSemanas() {
        return numeroSemanas;
    }

    public void setNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public double getValorPorSemana() {
        return valorPorSemana;
    }

    public void setValorPorSemana(double valorPorSemana) {
        this.valorPorSemana = valorPorSemana;
    }
    public double calcularSueldoFinal() {
        double sueldo = numeroSemanas * valorPorSemana;
        return sueldo + comisionFija;
    }
      @Override
    public String toString() {
        String cadena = String.format("%s\n\tNúmero de Semanas: %d\n\tValor por Semana: %.2f\n\tSueldo Final: %.2f\n", super.toString(), getNumeroSemanas(), getValorPorSemana(), calcularSueldoFinal());
        return cadena;
    }
}
