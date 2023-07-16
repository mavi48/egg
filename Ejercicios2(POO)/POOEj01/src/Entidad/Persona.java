/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author user
 */
public class Persona {
    //atributos

    public String nombre;
    public String apellido;
    public String edad;
    public Date nacimiento;
    //constructor

    public Persona(String nombre, String apellido, String edad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }

    public static void main(String[] args) {

        //instaciacion con constructor por parametro
        Persona primeraPersona = new Persona("Maria", "Gomez", "48", "1 de junio");
        Persona segundaPersona = new Persona();   //creo persona vacia
        primeraPersona.setNombre("Maria");

        System.out.println("el nombre es:" + primeraPersona.getNombre());
        System.out.println("el apellido es:" + primeraPersona.getApellido());
        System.out.println("la edad es:" + primeraPersona.getEdad());
        System.out.println("-------------");

        //cargar datos para el constructor vacio
        segundaPersona.setNombre("Juan");
        segundaPersona.setApellido("Garcia");
        segundaPersona.setEdad("50");

        System.out.println("el nombre es:" + segundaPersona.getNombre());
        System.out.println("el apellido es:" + segundaPersona.getApellido());
        System.out.println("la edad es:" + segundaPersona.getEdad());
        //aca cambio de valor la edad(seteo)
        System.out.println("-------------");
        segundaPersona.setEdad("38");
        System.out.println("el nombre es:" + segundaPersona.getNombre());
        System.out.println("el apellido es:" + segundaPersona.getApellido());
        System.out.println("la edad es:" + segundaPersona.getEdad());
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
//constructores
    //metodos propios.
