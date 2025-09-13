/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.academy.domain;

import java.util.List;

/**
 *
 * @author Santiago Ortega
 */
public class Estudiante {

    private final String id;
    private String nombre;
    private int edad;
    private double note, note2, note3;
    private List<String> lista;

    //constructor
    public Estudiante(String id, String nombre, int edad,double note, double note2, double note3 ,List lista) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id requerido");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        


        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.note= note;
        this.note2 = note2;
        this.note3 = note3;
        this.lista = lista; 
    }
     public double calcularPromedio(){
            return (note+ note2+ note3) /3.0;
     }
     
     public String getId(){
         return id;
     }
     
     public String getNombre(){
         return nombre;
     }
     
     public int getEdad(){
         return edad;
     }
     
     public double getNote(){
         return note;
     }
     
     public double getNote2(){
         return note2;
     }
     
     public double getNote3(){
         return note3;
     }
     
     public List getList(){
         return lista;
     }
     
     public double notaMaxima(){
         return Math.max(note,Math.max(note2, note3));
     }
     
     public boolean estaAprobado(){
         return calcularPromedio() >= 3.0;
     }
}