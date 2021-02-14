
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
public class TestCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     
        // Una lista ligada puede ser de un tipo de variable o de una clase
        //ArrayList <Pelicula> peliculas = new ArrayList ();
        
        // Como agregar objetos a una lista ligada
        //peliculas.add(pelicula1);

        Cine cine = new Cine ("Cine", 9, 12);
        int checador;
        
        do{
            System.out.println("\t\t Menu de Opciones \n");
            System.out.println("Agregar pelicula: 1 \n Salir: 0 ");
            checador = scanner.nextInt();
            String bufer = scanner.nextLine();
            if(checador==1){
                System.out.println("Ingresa el nombre de la pelicula: ");
                String seriePeliculas = scanner.nextLine();
                Pelicula pelicula = new Pelicula (seriePeliculas);
                //peliculas.add(pelicula4);
                cine.agregarPelicula(pelicula);
            }
                 
        }while( checador!=0 && checador<2);
        
        System.out.println("Ingresa la hora");
        int hora = scanner.nextInt();
        if(hora >= cine.horaInicio && hora <= cine.horaFin ){
            System.out.println ("Abierto");
        }
        else {
            System.out.println ("Cerrado");
        }
   
        System.out.println (cine.menuCartelera());
        System.out.println("Cantidad de peliculas:" + cine.peliculas.size());
       
    }
    
}
