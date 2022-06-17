/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Carrera: %s \n"
                + "Ciclo: %s\n"
                + "----------------------\n",
                carrera,
                ciclo);
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s%d.)\n"
                    + "Estudiante: %s %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %d\n"
                    + "Costo Asignatura: %.2f\n"
                    + "Número de Asignaturas: %d\n"
                    + "Costo de Matrícula: %.2f\n"
                    + "----------------------\n",
                    cadena,
                    i+1,
                    lista.get(i).obtenerNombresEstudiante(),
                    lista.get(i).obtenerApellidoEstudiante(),
                    lista.get(i).obtenerIdentificacionEstudiante(),
                    lista.get(i).obtenerEdadEstudiante(),
                    lista.get(i).obtenerCostoAsignatura(),
                    lista.get(i).obtenerNumeroAsignaturas(),
                    lista.get(i).obtenerMatriculaDistancia());
        }
        cadena = String.format("%sTotal Matriculas a Distancia: %.2f",
                cadena, 
                obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
