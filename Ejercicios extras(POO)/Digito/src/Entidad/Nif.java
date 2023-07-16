
package Entidad;


public class Nif {
    
    int Dni;
   char Letra;

    public Nif(int Dni, char Letra) {
        this.Dni = Dni;
        this.Letra = Letra;
    }

    public Nif() {
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return Letra;
    }

    public void setLetra(char Letra) {
        this.Letra = Letra;
    }

 
    
}
