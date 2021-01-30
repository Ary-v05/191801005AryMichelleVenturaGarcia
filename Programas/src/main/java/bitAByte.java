
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
public class bitAByte {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\tEste es un programa para cambiar de bit a byte \n\n");
        System.out.println("Ingresa los bits: ");
        double bit=scanner.nextDouble();
        System.out.println(bit/8);
        System.out.println("bytes");
    
    }
}
