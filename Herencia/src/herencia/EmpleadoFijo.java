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
public class EmpleadoFijo extends Empleado {

    public double sueldoFijo = 0;

    public double descuentoSeguro = 0;
    public Empleado e = new Empleado();
//Constructor que llama a los atributos de la clase padre
    public EmpleadoFijo(String n, String a, String b, double e, double f, double g) {
        super(n, a, b, e);
        setSueldoFijo(f);
        setDescuentoSeguro(g);
    }

    public EmpleadoFijo() {
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public double getDescuentoSeguro() {
        return descuentoSeguro;
    }

    public void setDescuentoSeguro(double descuentoSeguro) {
        this.descuentoSeguro = descuentoSeguro;
    }

    public Empleado getE() {
        return e;
    }

    public void setE(Empleado e) {
        this.e = e;
    }

    
//calculo del sueldo, regresa el sueldo  mas la comisión fija establecida en la clase padre
    public double calcularSueldoFinal() {
        double sueldo = sueldoFijo - ((sueldoFijo / 100) * descuentoSeguro);
        return sueldo + comisionFija;
    }
//Sobreescritura de metodo, se usa el super.toString() para llamar al metodo de la clase padre
    @Override
    public String toString() {
        String cadena = String.format("%s\n\tSueldo Fijo: %.2f\n\tDescuento Seguro: %.0f%%\n\tSueldo Final: %.2f\n", super.toString(), getSueldoFijo(), getDescuentoSeguro(), calcularSueldoFinal());
        return cadena;
    }
}
