/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import Alumnos.estudiantes;
import Servicio.chicos;

import java.util.Scanner;

public class Curso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        estudiantes est = new estudiantes();
        chicos sc = new chicos();
        
      for (int i = 1; i <= 5; i++) {
        sc.crearCurso(est);
        sc.calcularGananciaSemanal(est);}
        //System.out.println(est.getGanancia());
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        

   

