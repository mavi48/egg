
package Entidad;


public class EdificioDeOficinas extends Edificio{
    
    protected int numOficinas;
    protected int cantPersonas;
    protected int numPisos;

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(double ancho, double alto, double largo) {
        super(ancho, alto, largo);
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
   @Override
    public double calcularSuperficie() {
    
        
      double superficie = alto * ancho * largo;
        return superficie;
       
    }

    @Override
    public double calcularVolumen() {
       
        double volumen = largo * ancho;
        return volumen;
        
    }
    
    public void calcularPersonas(){
        int total= numOficinas*cantPersonas*numPisos;
        System.out.println("el numero de personas por piso es: " + cantPersonas + "total de personas en el edificio" + total);
    }
}
