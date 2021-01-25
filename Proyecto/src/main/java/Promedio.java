
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
public class Promedio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero doble");
        double calificacion=scanner.nextDouble();
        System.out.println("Ingresa un otro doble");
        double calificacionDos=scanner.nextDouble();
        System.out.println("Ingresa un otro doble");
        double calificacionTres=scanner.nextDouble();
        scanner.nextLine();
        System.out.println((calificacion+calificacionDos+calificacionTres)/3);
    }
    
}
