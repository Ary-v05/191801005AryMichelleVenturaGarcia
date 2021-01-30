
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
public class terabytesAMegabytes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\tEste es un programa para cambiar de terabytes a megabytes \n\n");
        System.out.println("Ingresa los terabytes: ");
        double terabytes=scanner.nextDouble();
        System.out.println(1000000*terabytes);
        System.out.println("megabytes");
    
    }
}
