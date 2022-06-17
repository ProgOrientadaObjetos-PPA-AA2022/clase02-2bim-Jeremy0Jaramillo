/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<EstudiantePresencial> listaPresencial = new ArrayList<>();
        
        EstudiantePresencial e1 = new EstudiantePresencial("Julio", "Miller", "210231",
                20, 3, 100.2);
        EstudiantePresencial e2 = new EstudiantePresencial("Walter", "White", "210232",
                19, 5, 100.2); 
        EstudiantePresencial e3 = new EstudiantePresencial("Karol", "Erreyes", "210233",
                21, 2, 100.2);
        
        listaPresencial.add(e1);
        listaPresencial.add(e2);
        listaPresencial.add(e3);
        
        for (int i = 0; i < listaPresencial.size(); i++) {
            listaPresencial.get(i).calcularMatriculaPresencial();
        }
        
        ReportePresencial rd = new ReportePresencial("Reporte Presencial", 
                "Bioquímica", "Octavo");
        rd.establecerLista(listaPresencial);
        rd.establecerTotalMatriculasPresencial();
        
        System.out.println("----------------------");
        System.out.println(rd);
        
    }
}
