
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestMaterias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Introduce los datos");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine ();
        System.out.println("carrera: ");
        String carrera = scanner.nextLine ();
        System.out.println("creditos: ");
        int creditos = scanner.nextInt ();
        System.out.println("codigo: ");
        String codigo = scanner.nextLine ();
        System.out.println("cuatrimestre: ");
        int cuatrimestre = scanner.nextInt ();
        
        
        Materias matematicas = new Materias ("Matematicas", "Tecnologias", 7, "Mat12", 5);
        Materias programacion = new Materias ("Programacion", "Tecnologias", 8, "PRO112", 7);
        Materias espanol = new Materias ("Español", "Tecnologias", 9, "Esp52", 2);
        Materias materias = new Materias (nombre,carrera, creditos, codigo, cuatrimestre);
        System.out.println(matematicas +"\n"  +programacion +"\n" + espanol +"\n" + materias);
    }
}
