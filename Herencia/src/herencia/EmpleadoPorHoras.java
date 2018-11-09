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
public class EmpleadoPorHoras extends Empleado {
//Procedimientos similares a la clase Empleado Fijo
    public int numeroHoras = 0;
    public double valorHora = 0;

    public EmpleadoPorHoras(String n, String a, String b, double e, double f, int h) {
        super(n, a, b, e);
        setNumeroHoras(h);
        setValorHora(f);
    }
//Getters & Setters
    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSueldoFinal() {
        double sueldo = numeroHoras * valorHora;
        return sueldo + comisionFija;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n\tNúmero de Horas: %d\n\tValor por Hora: %.2f\n\tSueldo Final: %.2f\n", super.toString(), getNumeroHoras(), getValorHora(), calcularSueldoFinal());
        return cadena;
    }
}
