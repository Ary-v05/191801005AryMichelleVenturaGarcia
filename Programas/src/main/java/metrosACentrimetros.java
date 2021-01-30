
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
public class metrosACentrimetros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t Este es un programa para cambiar de metros a centrimetros \n\n");
        System.out.println("Ingresa los metros: ");
        double metros=scanner.nextDouble();
        System.out.println(metros*100);
        System.out.println("Centimetros");
        
    }
}
