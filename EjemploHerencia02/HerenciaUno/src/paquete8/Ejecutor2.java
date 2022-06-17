/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

public class Ejecutor2 {

    public static void main(String[] args) {

        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCreditos = 5;
        double costoCred = 50.5;
        EstudiantePresencial estPresencia = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCred);

        estPresencia.calcularMatriculaPresencial();
        System.out.println(estPresencia);
    }
}
