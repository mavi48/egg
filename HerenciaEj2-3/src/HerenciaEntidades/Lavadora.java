
package HerenciaEntidades;




public class Lavadora extends Electrodomestico {
    
    protected Double carga;

    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
  


    public Double getCarga() {
        return carga;
    }

    public void setCarga( Double  carga) {
        this.carga = carga;
    }

  
    public double precioFinal(){
     
    double precios= super.precioFinal();
    
     if(carga>=30){
         precios= + 500;
     }   
     
     return precio;
     
 }
 
    
   
}
