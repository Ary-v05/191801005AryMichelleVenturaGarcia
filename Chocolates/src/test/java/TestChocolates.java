
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
public class TestChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Introduce los datos");
        System.out.println("Nombre del Chocolate: ");
        String nombre = scanner.nextLine ();
        System.out.println("Ingredientes: ");
        String ingredientes = scanner.nextLine ();
        System.out.println("Cantidad de Gramos: ");
        int cantidad = scanner.nextInt ();
        System.out.println("Precio: ");
        int precio = scanner.nextInt ();
        
        
        Chocolates carlosV = new Chocolates ("Carlos V","Leche, chocolate", 500 , 7.50);
        Chocolates chocolates = new Chocolates (nombre, ingredientes, cantidad, precio);
        scanner.nextLine();
        System.out.println(carlosV + "\n"  + chocolates);
    }
}
