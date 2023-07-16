/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

/**
 *
 * @author user
 */
public class estudiantes {

 
    

    String nombreCurso;
    int cantidadHorasPorDia;
    int cantidadDiasPorSemana;
    String turno;
    int precioPorHora;
    int cantidadAlumnos;
  
  

    public estudiantes(String nombreCurso, String turno, int cantidadAlumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public estudiantes(int cantidadHorasPorDia, int cantidadDiasPorSemana, int precioPorHora) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }
    

  public estudiantes() {
    }

    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

  
    int ganancia;

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    @Override
    public String toString() {
        return "estudiantes{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", cantidadAlumnos=" + cantidadAlumnos + '}';
    }

 
    
    
    
  
    
    
    
}
