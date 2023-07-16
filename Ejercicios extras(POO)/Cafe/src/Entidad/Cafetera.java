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
public class Cafetera {

    public int capacidadMaxima;
    public int cantidadActual;
    public int adicion;
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }
    
    public Cafetera(int adicion) {
        this.adicion = adicion;
    }
    public int getAdicion() {
        return adicion;
    }

    public void setAdicion(int adicion) {
        this.adicion = adicion;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int llenarCafetera() {
        return cantidadActual = capacidadMaxima;
    }
  public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual = cantidadActual - tamanoTaza;
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No se ha llenado la taza. La taza Quedó con " + cantidadActual + " ml de café.");
            cantidadActual = 0;
        }
    }

    public int vaciarCafetera() {
        return 0;
    }

    public int agregarCafe() {
        
        if (cantidadActual > capacidadMaxima) {
          
            return cantidadActual = capacidadMaxima;
          
        }else{
            return cantidadActual + adicion;
        }
            
    }
}
