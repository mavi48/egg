/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.servicios;

import Entidad.Frase;

import java.util.Scanner;

public class ServicioCadena {

   Frase frase;

    public ServicioCadena() {
        this.frase = new Frase();
    }

    public ServicioCadena(String letra) {
        this.frase = new frase(letra);
    }

    public void setFrase(String letra) {
        frase.setFrase(letra);
        frase.setLongitud(letra.length());
    }

    public String getFrase() {
        return frase.getFrase();
    }

    public int getLongitud() {
        return frase.getLongitud();
    }

    public int mostrarvocales(Frase frase) {
        String letra = frase.getFrase();
        int contador = 0;
        for (int i = 0; i < letra.length(); i++) {
            char vocal = letra.charAt(i);
            if ((vocal == 'a') || (vocal == 'e') || (vocal == 'i') || (vocal == 'o') || (vocal == 'u')) {
                contador++;
            }

        }
        return contador;
    }

    public String invertirFrase(Frase frase) {
        String cadena = frase.getFrase();
        String fraseAlReves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            fraseAlReves += cadena.charAt(i);
        }
        return fraseAlReves;
    }

    public int vecesRepetido(String caracter,Frase frase) {
        String letra = frase.getFrase();
        char letrita = caracter.charAt(0);
        int contador = 0;
        for (int i = 0; i < letra.length(); i++) {
            if( letra.charAt(i) == letrita){
            
               contador++;
            }
        }
        return contador;
    }
    
       public void compararLongitud(String nuevafrase,Frase frase){
         String letra = frase.getFrase();
         int nuevaLongitud = nuevafrase.length();
         if(frase.getLongitud() == nuevaLongitud){
             System.out.println("la longitud de las dos frases son iguales");
         }else{
             System.out.println("La longitud de las dos frases no son iguales");
         }
       }
     public void unirFrase(String nuevafrase,Frase frase){
         String letra = frase.getFrase();
         String total = letra + " " + nuevafrase;
         System.out.println(total);
     }
    public void reemplazo(String caracter,Frase frase){
        String letra = frase.getFrase();
        String reemplazar = "@";
        String total = letra.replace(caracter, reemplazar);
        System.out.println(total);
    }
    public boolean contiene(String caracter,Frase frase){
       String letra = frase.getFrase();
       return letra.contains(caracter);
       
    }
}
