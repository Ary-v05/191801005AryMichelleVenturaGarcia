
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
public class Tacos {
    public static void main(String[] args) {
        int tacos=17,refrescos=10;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa los tacos que comiste");
        int numeroDeTacos=scanner.nextInt();
        System.out.println("Ingresa los refrescos que comiste");
        int numeroDeRefrescos=scanner.nextInt();
        System.out.println("\t Total a pagar");
        System.out.println((numeroDeTacos*tacos)+(numeroDeRefrescos*refrescos));
        
    }
}
