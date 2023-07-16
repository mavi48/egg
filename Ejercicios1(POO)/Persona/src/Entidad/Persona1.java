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
public class Persona1 {

    //ATRIBUTOS,CONSTRUCTOR
    public String nombre;
    public int edad;
    public char sexo;
    public double peso;
    public double altura;
    public double IMC;
    public String esMayorDeEdad;
    public double calcularIMC;
    public double calcularPorcentaje;
    public String saberSexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setSaberSexo(String saberSexo) {
        this.saberSexo = saberSexo;
    }

    public String getSaberSexo() {
        return saberSexo;
    }

    public String getEsMayorDeEdad() {
        return esMayorDeEdad;
    }

    public void setEsMayorDeEdad(String esMayorDeEdad) {
        this.esMayorDeEdad = esMayorDeEdad;
    }

    public double getCalcularIMC() {
        return calcularIMC;
    }

    public void setCalcularIMC(double calcularIMC) {
        this.calcularIMC = calcularIMC;
    }

    public Persona1(double IMC) {
        this.IMC = IMC;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public Persona1(int IMC) {
        this.IMC = IMC;
    }

    public Persona1(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona1() {
    }

    public double IMC() {
        IMC = peso / (altura * altura);
        return IMC;
    }

    public void calcularIMC() {
        //Calculamos el peso de la persona

        //Segun el peso, devuelve un codigo
        if (IMC >= 20 && IMC <= 25) {

            System.out.println("TIENE PESO_IDEAL");

        } else if (IMC < 20) {
            System.out.println("TIENE BAJO DE PESO");
        } else {
            System.out.println("TIENE SOBREPESO");
        }

    }

    public void esMayorDeEdad() {

        if (edad <= 18) {

            System.out.print("La persona es menor de edad");
        } else if (edad > 18) {
            System.out.print("La persona es mayor de edad");
        }
    }

    public void saberSexo(String sexo) {

        if (this.sexo == 'H') {
            System.out.print("eres hombre");
        } else if (this.sexo == 'M') {
            System.out.print("eres mujer");
        } else if (this.sexo == 'O') {
            System.out.println("eres otro");
        }
    }

}

//public void comprobarSexo() {
//Si el sexo no es una H o una M, por defecto es H
// if (sexo != 'H' && sexo != 'M') {
//  this.sexo = SEXO_DEF;

