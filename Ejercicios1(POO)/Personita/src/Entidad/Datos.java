/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;
import java.util.Date;

public class Datos {

    String nombre;
    int anio;
    int mes;
    int dia;
    Date Fecha;
    int difAnios;

    public Datos() {
    }
    

    Date fechaActual = new Date();

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Datos(int difAnios) {
        this.difAnios = difAnios;
    }

    public int getDifAnios() {
        return difAnios;
    }

    public void setDifAnios(int difAnios) {
        this.difAnios = difAnios;
    }

    public Datos(String nombre) {
        this.nombre = nombre;
    }

    public Datos(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Datos(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getAnio(int anio) {
        return anio;
    }

    public int getMes(int mes) {
        return mes;
    }

    public int getDia(int dia) {
        return dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFecha(Date Fecha) {
        return Fecha;
    }

    @Override
    public String toString() {
        return "Datos{" + "nombre=" + this.nombre + '}';
    }

   

  

  
    

}
