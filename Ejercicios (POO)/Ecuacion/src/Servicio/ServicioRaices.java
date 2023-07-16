/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Raices.raices;



public class ServicioRaices {
        
  public Double getDiscriminante(raices raices){
    
        return Math.pow(raices.getB(),2) - (4*raices.getA()*raices.getC());
}  
  
  public boolean tieneRaices(raices raices){
      return getDiscriminante(raices)>=0;
  }
  public boolean tieneRaiz(raices raices){
       return getDiscriminante(raices) == 0;
  }
  public void obtenerRaices(raices raices){
      //double a ;
      //double b = 0;
      double a1 = (-raices.getB() + Math.sqrt( getDiscriminante(raices))) / (2*raices.getA());
      double a2 = (-raices.getB()-Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
      
      System.out.println("resultado a1:");
      System.out.println(a1);
      System.out.println("rsultado a2:");
      System.out.println(a2);
  }
  public void obtenerSolucion(raices raices){
     // double b = 0;
     //int a = 0;
     
    
      double a3=(raices.getB())/(2*raices.getA());
      
      System.out.println("unica solucion");
      System.out.println(a3);
  }
  public void calcular(raices raices){
      
      if(tieneRaices(raices)){
          obtenerRaices(raices);
      }else if(tieneRaiz(raices)){
          obtenerSolucion(raices);
      }else{
          System.out.println("no tiene raiz");
      }
}

  

}