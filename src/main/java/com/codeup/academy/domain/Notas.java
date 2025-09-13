/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.academy.domain;

/**
 *
 * @author Santiago Ortega
 */
public class Notas {
    
    private final double valor;
    
    public Notas(double valor){
        
        if (valor <0.0 || valor > 5){
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
        
        this. valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
}