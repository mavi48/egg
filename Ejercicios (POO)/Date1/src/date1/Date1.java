/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date1;


import java.util.Date;

/**
 *
 * @author user
 */
public class Date1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio = 2000;
        int mes = 6;
        int dia = 7;

        Date Fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println("Fecha " + Fecha);
       
        Date fechaActual = new Date();
        System.out.println("Actual: " + fechaActual);
        int difAnios = fechaActual.getYear() - Fecha.getYear();
        System.out.println("la diferencia de años es: " + difAnios);
    }

}
