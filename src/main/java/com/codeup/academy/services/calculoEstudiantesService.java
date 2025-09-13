/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.academy.services;
import java.util.List;
import  com.codeup.academy.domain.Notas;


/**
 *
 * @author Santiago Ortega
 */
public class calculoEstudiantesService {
    
    
    public double promedio(List<Notas> notas){
        if (notas == null || notas.isEmpty()){
            return 0.0;
        }
        double suma =0;
        for (Notas n : notas){
            suma+= n.getValor();
        }
        return suma /notas.size();
    }
    
    public Notas notaMaxima(List<Notas> notas){
        
        if (notas == null || notas.isEmpty()){
            return null;
        }
        
        Notas maxNotas = notas.get(0);
        
        for (Notas n: notas){
            if (n.getValor() > maxNotas.getValor()){
                maxNotas = n;
            }
        }
        return maxNotas;
    }
    
    public boolean aprobado(double promedio, List<Notas> notas){
        
        return promedio >= 3.0;             
         }
}