/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import Entidad.SumarRestar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1;
        double n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        SumarRestar primernum = new SumarRestar(n1, n2);
        primernum.mostrarsumar();
        primernum.mostrarrestar();
      
        primernum.mostrardividir();
        primernum.mostrardividir1();
        if(0!=primernum.multiplicar()){
            primernum.mostrarmultiplicar();
        }else{
            primernum.mostrarmultiplicar1(); 
        }
    }
}
