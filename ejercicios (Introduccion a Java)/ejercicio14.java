/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.aprendizaje;



/**
 *
 * @author user
 */
import java.util.Scanner;
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
       System.out.println("Introduzca la cantidad de € que desea convertir: ");
        double euro = leer.nextDouble();
        Cambio(euro);
        
    }
    public static void Cambio(double euro){
        double libra = euro/0.86;
        double dolar = euro/1.29611;
        double yen = euro/129.852;
        System.out.println("----------------------------------");
        System.out.println(euro+" € son: "+libra+" libras");
        System.out.println(euro+" € son: "+yen+" yenes");
        System.out.println(euro+" € son: "+dolar+" dolares");
        System.out.println("----------------------------------");
    }
    }
    

    
    
        
    
    
    
