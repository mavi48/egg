package javaapplication32;

import ServicioNL.ServicioNL;
import numLetra.numLetra;

public class JavaApplication32 {

    public static void main(String[] args) {

        ServicioNL snl = new ServicioNL();
        numLetra n = new numLetra();

        snl.crearUnidad(n);
        //snl.crearUnidad();
        //unidad
        snl.Unidadtext(n.getNumeros() / 10);
        System.out.println(snl.Unidadtext(n.getNumeros()));

        //decena
        snl.decenaTex(n.getDecena() / 10);
        //System.out.println(snl.decenaTex(n.getDecena()));

        //System.out.println(snl.Unidadtext(n.getNumeros())+ "y" +  snl.decenaTex(n.getDecena()));
        //System.out.println(snl.Unidadtext(n.getNumeros())+ "y" + snl.decenas(n.getDecena()));
        //System.out.println(snl.);
        if ((n.getNumeros() == 0) && (n.getDecena() > 0)) {
            System.out.println(snl.decenaTex(n.getDecena()));
        } else if (n.getDecena() == 1) {
            System.out.println(snl.decenas(10+n.getNumeros()));
        } else if (n.getDecena() > 1) {
            System.out.println(snl.decenaTex(n.getDecena()) + " y " + snl.Unidadtext(n.getNumeros()));
        }
        
        snl.centenatext(n.getCentena()/10);
        
        if ((n.getCentena()!= 1) && (n.getCentena() != 5) && (n.getCentena()!= 9) && (n.getCentena() != 0)) {
            System.out.println(snl.Unidadtext(n.getCentena()) + "cientos" + snl.Unidadtext(n.getNumeros()));
        } else if ((n.getCentena() == 1) || (n.getCentena() == 5) || (n.getCentena() == 9)) {
            System.out.println(snl.centenatext(n.getCentena()) + " " + snl.Unidadtext(n.getNumeros()));
        }
    }
}
