/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

public class Codigo {

    String marca;
    int precio;
    String modelo;
    int memoriaRam;
    int almacenamiento;
    int codigo1;
    int estudiante;
    
    public Codigo(String marca, int precio, String modelo, int memoriaRam, int almacenamiento, int codigo1) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo1 = codigo1;
    }

    public Codigo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(int codigo1) {
        this.codigo1 = codigo1;
    }

    @Override
    public String toString() {
        return "Codigo{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo1=" + codigo1 + '}';
    }

}
