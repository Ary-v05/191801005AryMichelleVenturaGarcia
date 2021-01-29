
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
public class Opciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dame el primer numero");
        int numero1=scanner.nextInt();
        System.out.println("Dame el segundo numero");
        int numero2=scanner.nextInt();
        System.out.println("Opcion 1:Suma opcion 2:Resta");
        int opcion=scanner.nextInt();
        switch(opcion){
            case 1:
                System.out.println(numero1+numero2);
            break;
            case 2:
                System.out.println(numero1-numero2);
            break;
            default:
                System.out.println("no existe esta opcion");
            break;
        }
            
    }
}
