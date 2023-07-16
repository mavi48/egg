package ejerc.aprendizaje;



import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int cont1 = 0;
        String codigo = " ";
       
        do
        
        {
            System.out.println("Ingrese una secuencia: ");
            codigo = leer.next().toLowerCase();
            int tamaño = codigo.length();
            String letra1 = codigo.substring(0,1);
            String letra2 = codigo.substring(tamaño-1);
            //System.out.println("La primera letras es "+letra1+" y la ultima es "+letra2);
if( codigo.equals("&&&&&")  )
            {
                break;
            }    
               
            if (tamaño <= 5 && letra1.equals("x") && letra2.equals("o")) 
            {
                System.out.println("--------------------------------------");
                System.out.println("La secuencia "+codigo+" es correcta");
                System.out.println("--------------------------------------");
                cont++;
            }
            else
            {
                System.out.println("--------------------------------------");
                System.out.println("La secuencia "+codigo+" es incorrecta");
                System.out.println("--------------------------------------");
                cont1++;
            }
}while(true);
                
        System.out.println("--------------------------------------");
        System.out.println("Numero de secuencias correctas: "+cont);
        System.out.println("--------------------------------------");
        System.out.println("Numero de secuencias incorrectas: "+cont1);
         System.out.println("--------------------------------------");

    }
    }
