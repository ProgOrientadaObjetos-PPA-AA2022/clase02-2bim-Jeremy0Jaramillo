/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author fabri
 */

    
    public class EstudiantePresencial extends Estudiante{
    
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaPresencial;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCred, double costoCred){
        super( iden, e); 
        establecerNombresEstudiante(n);
        establecerApellidoEstudiante(ap);
        numeroCreditos = numCred;
        costoCredito = costoCred;
    }
    
    @Override
   public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape.toLowerCase();
    }
    
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    public void establecerCostoCreditos(double valor){
        costoCredito = valor;
    }

    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    public double obtenerCostoCredito(){
        return costoCredito;
    }

    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }

}
    

