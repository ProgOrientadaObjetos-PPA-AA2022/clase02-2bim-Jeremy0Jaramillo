/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        // Creación de un objeto de tipo EstudianteDistancia
        System.out.println("Ingrese su nombre:");
        String nombre = entry.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = entry.nextLine();
        System.out.println("Ingrese su identificación:");
        String identificacion = entry.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = entry.nextInt();
        System.out.println("Ingreses el número de créditos:");
        int numCreditos = entry.nextInt();
        System.out.println("Ingrese el costo por crédito:");
        double costoCred = entry.nextDouble();
        
                
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCred);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
