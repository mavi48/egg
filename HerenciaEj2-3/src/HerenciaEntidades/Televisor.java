
package HerenciaEntidades;



public class Televisor extends Electrodomestico{
    
    
    protected double resolucion;
    protected boolean sintonizadorTDT;

 

    public Televisor(double resolucion,boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /*public Televisor(Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
     */


  
      public double precioFinal() {
        double precios = super.precioFinal();

        if (resolucion > 40) {
            precios += precio * 30;

        }if(sintonizadorTDT ) {
            precios += 500;
        }
        return precios;

    }
      
 }
