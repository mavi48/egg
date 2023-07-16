/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioNotas;

import EntidadAlumno.Alumno;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import java.util.Scanner;

public class ServicioNotas {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<Integer> Nota;
    public List<Alumno> listaAlumnos;

    public ServicioNotas() {
        this.Nota = new ArrayList();
        this.listaAlumnos = new ArrayList();
    }

    public void crearAlumno() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre :");
        String nombre = leer.next();

        List<Integer> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("nota:" + (i + 1) + ":");
            int nota = leer.nextInt();
            notas.add(nota);
        }

        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);

        System.out.println("quiere ingresar otro Alumno?(si/no)");
        String respuesta = leer.next();

        if (respuesta.equalsIgnoreCase("si")) {
            crearAlumno();
        }
        System.out.println(alumno.toString());

    }

    public void notaFinal() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno para calcular la nota final:");
        String nombre = leer.nextLine();

        Iterator<Alumno> iterador = listaAlumnos.iterator();

        while (iterador.hasNext()) {
            Alumno alumno = iterador.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                List<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int i = 0; i < notas.size(); i++) {
                    suma = suma + notas.get(i);

                }
                double promedio = suma / notas.size();
                System.out.println("promedio:" + promedio);
                break;
            }
        }
    }
}

/*public void mostrar(Alumno estudiante) {

        HashMap<Integer, String> nombres = new HashMap();

        nombres.put(estudiante.getNotas(), estudiante.getNombre());
        nombres.put(estudiante.getNotas(), estudiante.getNombre());

        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            System.out.println("key" + key + value);
        }*/
