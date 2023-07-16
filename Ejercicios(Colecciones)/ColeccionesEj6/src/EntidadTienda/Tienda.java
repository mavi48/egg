
package EntidadTienda;


public class Tienda {
    
    String nombreProducto;
   
    double valorPrecio;

    public Tienda(String nombreProducto, double valorPrecio) {
        this.nombreProducto = nombreProducto;
        this.valorPrecio = valorPrecio;
    }

    public Tienda() {
        
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getValorPrecio() {
        return valorPrecio;
    }

    public void setValorPrecio(double valorPrecio) {
        this.valorPrecio = valorPrecio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombreProducto=" + nombreProducto + ", valorPrecio=" + valorPrecio + '}';
    }

   


    
}
