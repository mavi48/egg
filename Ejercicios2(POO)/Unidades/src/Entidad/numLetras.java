
package Entidad;


public class numLetras {
    
  String[] unidades= {null,"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
  String[] Decenas={"diez", "once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
  String[] decena ={null,null, "veinti","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
  String[] centenas={null,"cien","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
   
  public String cambiar(int numero){
        
    if(numero < 10){
        return unidades[numero];
    }else if(numero < 20){
       return Decenas [numero%10];
    }else if(numero < 100){
        return decena [numero / 10]+((numero % 10 > 0)? " y " + cambiar(numero % 10):"");
    }else if(numero<1000){
     return centenas[numero / 100]+""+((numero % 100 > 0)? " " + cambiar(numero % 100):"");
    }
    return cambiar(numero);
    }
      
      
  }

    

