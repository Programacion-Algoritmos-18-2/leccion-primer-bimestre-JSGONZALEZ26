/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        Empleado e = new Empleado();
        e.setNombre("Luis");
        e.setApellido("Benitez");
        e.setCedula("110001");
        System.out.println(e);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        EmpleadoPorHoras eh = new EmpleadoPorHoras(nombre, "Andrade", "112233",10, 20.2, 15);
        System.out.println(eh);
        System.out.print("Ingrese la comision: ");
        double comision = entrada.nextDouble();
        EmpleadoFijo ef = new EmpleadoFijo("Ana", "Andrade", "223344", comision, 300.2, 10);
        System.out.println(ef);
        EmpleadoPorSemana es = new EmpleadoPorSemana("Jose", "Lopez","111401", 35, 8, 24);
        System.out.println(es);
    }

}
