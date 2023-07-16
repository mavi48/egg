/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numLetra;

/**
 *
 * @author user
 */
public class numLetra {
     int numeros;
     int decena;
     int centena;

    public numLetra(int numeros, int decena, int centena) {
        this.numeros = numeros;
        this.decena = decena;
        this.centena = centena;
    }



    public numLetra() {
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public int getDecena() {
        return decena;
    }

    public void setDecena(int decena) {
        this.decena = decena;
    }

    public int getCentena() {
        return centena;
    }

    public void setCentena(int centena) {
        this.centena = centena;
    }

    
}
