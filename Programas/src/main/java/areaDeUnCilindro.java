
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
public class areaDeUnCilindro {
    public static void main(String[] args) {
        double pi=3.1416;
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t Este es un programa para calcular el area de un cilindro\n\n");
        System.out.println("Ingresa el radio del cilindro: ");
        double radio=scanner.nextDouble();
        System.out.println("Ingresa la altura del cilindro: ");
        double altura=scanner.nextDouble();
        System.out.println((2*pi*radio*altura) + (2*pi*(radio*radio)));
    }
}
