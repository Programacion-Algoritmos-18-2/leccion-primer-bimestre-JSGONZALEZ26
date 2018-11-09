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
public class Empleado {
//Clase padre
    public String nombre = "";
    public String apellido = "";
    public String cedula = "";
    public double comisionFija = 0;
    
//Constructor
    public Empleado(String n, String a, String b, double e) {
        setNombre(n);
        setApellido(a);
        setCedula(b);
        setComisionFija(e);
    }

    Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getComisionFija() {
        return comisionFija;
    }

    public void setComisionFija(double comisionFija) {
        this.comisionFija = comisionFija;
    }
//Sobreescritura de Metodo
    @Override
    public String toString() {
        String cadena = String.format("Información de: %s %s\n\tCédula: %s\n", getNombre(), getApellido(), getCedula(), getComisionFija());
        return cadena;
    }

}
