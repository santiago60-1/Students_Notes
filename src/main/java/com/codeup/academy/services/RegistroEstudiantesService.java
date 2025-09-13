package com.codeup.academy.services;

import com.codeup.academy.domain.Estudiante;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class RegistroEstudiantesService {
    

    private final List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }
    
    public List<Estudiante> listarEstudiantes() {
        return new ArrayList<>(estudiantes);
    }
    
    public double calcularPromedioGeneral() {
        if (estudiantes.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedio();
        }
        return suma / estudiantes.size();
    }
    
    public Optional<Estudiante> mejorEstudiante(){
        Estudiante bestStudent = estudiantes.get(0);
        for (Estudiante e : estudiantes){
            if (e.calcularPromedio() > bestStudent.calcularPromedio()){
                bestStudent = e;
            }
        }
        return Optional.of(bestStudent);
    }
    
    public long contarAprobados(){
        long contador = 0;
        for (Estudiante e : estudiantes){
            if (e.estaAprobado()){
                contador++;
            }
        }
        return contador;
    }
    
    public long contarReprobador(){
        long contador = 0;
        for (Estudiante e: estudiantes){
            if(!e.estaAprobado()){
                contador++;
            }
        }
        return contador;
    }
}