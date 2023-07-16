/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Calculo {

 public double numero ;
 public double numero1;
 public double mayor;
 public double menor;

    public Calculo() {
    }
 
    

    public Calculo(double mayor, double menor) {
        this.mayor = mayor;
        this.menor = menor;
    }

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }
 

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

 public double devolverMayor(){
     
 return Math.max(numero1,numero);
 }
 
 
 public double devolverMenor(){
   return  Math.min(numero,numero1);
     }
     
 
    
 
    public double calcularpotencia(){
      
       return Math.pow(mayor, menor);
         
  }
    
   public double calcularRaiz() {
      
       
       return Math.sqrt(Math.round(menor));
    
    
 
}  
}
