/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "Yo";
        String apellido = "Hola";
        String identificacion = "10010001";
        int edad = 20;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(120);
        estPresencial.establecerNumeroCreditos(12);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
