
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
public class dolaresAPesosMexicanos {
    public static void main(String[] args) {
        double pesosMexicanos=20.59;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\tEste es un programa que convierte de dolares a pesos \n\n");
        System.out.println("Ingresa los dolares: ");
        double dolares=scanner.nextDouble();
        System.out.println(dolares*pesosMexicanos);
        System.out.println("Pesos Mexicanos");
    }
}
