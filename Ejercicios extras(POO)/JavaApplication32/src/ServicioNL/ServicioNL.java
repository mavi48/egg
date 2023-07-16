
package ServicioNL;

import java.util.Scanner;
import numLetra.numLetra;


public class ServicioNL {
    
      Scanner leer = new Scanner(System.in);
      
    public void crearUnidad(numLetra nums){
      
        System.out.println("Ingrese el numero que desea convertir en letras:");
       int numeros = leer.nextInt();
        nums.setNumeros(numeros);
         
        /*nums.setDecena(numeros); /*nums.setDecena(numeros);
          
        nums.setCentena(numeros);*/
    
    }

   public String Unidadtext(int numero){
    
    switch(numero){
           
           case 1:
               return "uno";
           case 2:
               return "dos";    
          case 3:
               return "tres";     
          case 4:
               return "cuatro";     
           case 5:
               return "cinco";    
          case 6:
               return "seis";     
          case 7:
               return "siete";     
          case 8:
               return "ocho";     
          case 9:
               return "nueve";   
          default:
              return "";
             
       }
          
    } 
   public String decenaTex(int decena){
     
    
     switch (decena){
	case 1:
		return "diez";
	case 2:
		return "veinte";
	case 3:
		return "treinta";
	case 4:
		return "cuarenta";
	case 5:
		return "cincuenta";
	case 6:
		return "sesenta";
	case 7:
		return "setenta";
	case 8:
		return "ochenta";
	case 9:
		return "noventa";		
	default:
		return "";
                
  }
 
   
}
   
   public  String decenas(int decena1){
       
  switch (decena1){
	case 11:
		return "once";
	case 12:
		return "doce";
	case 13:
		return "trece";
	case 14:
		return "catorce";
	case 15:
		return "quince";
	case 16:
		return "dieciseis";
	case 17:
		return "diecisiete";
	case 18:
		return "dieciocho";
	case 19:
		return "diecinueve";		
	default:
		return "";
  }
}
   
public  String centenatext(int centenas){
    
  switch (centenas){
	case 1:
		return "ciento";
	case 5:
		return "quinientos";
	case 9:
		return "novecientos";				
	default:
		return " ";
  }
}
}
