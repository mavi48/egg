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
public class asterisco {
    private int base;
    private int altura;

    public asterisco(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public asterisco() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int superficie(){
        return base * altura;
    }
      public int Perimetro() {

        return (2*base) + (2*altura);

    }public void dibujar(){
     for (int i = 0;i<altura; i++) {
         for (int j = 0;j<base;j++) {       //centro 
                System.out.print("*");
            }
            System.out.println("");
        }
    
    }   
      
 }   

      

