
package relej1;

import relej1.Entidades.Perro;
import relej1.Entidades.Persona;


public class RelEj1 {

  
    public static void main(String[] args) {
        
        
        Perro perro1 = new Perro("Bambi","Pastor Aleman","1","Grande");
        Perro perro2 = new Perro("Nose","Chihuahua","10","Chiquito");
        Perro perro3 = new Perro("Paul","Shnauzer","10","Mediano");
        Persona persona1 = new Persona("Yohan","Venturas", "28", "2340951" );
        Persona persona2 = new Persona("Vicky","Gamba", "15", "9613786");

        persona1.adoptarPerro(perro1);
        persona1.adoptarPerro(perro2);
        persona2.adoptarPerro(perro3);



        System.out.println("Lista de Adopciones");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());  
        
        
    } 
    }
    

