
package EntidadPais;



public class Pais {
    
   String pais;
   String nombre;

    public Pais(String pais) {
        this.pais = pais;
    }


  

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + getPais() + '}';
    }

 

  


}
