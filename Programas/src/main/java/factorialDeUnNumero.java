
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
public class factorialDeUnNumero {
    public static void main(String[] args) {
        int factorial=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el numero del factorial que quieras: ");
        double numero=scanner.nextDouble();
        while(numero != 0){
            factorial=(int) (factorial*numero);
            numero--;
        }
        System.out.println(factorial);
    }
}
