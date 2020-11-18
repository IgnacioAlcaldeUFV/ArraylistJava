package nacho.ejemplo;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un programa que use ArrayList de números reales.
 * El programa debe tener un menú de opciones,
 * donde se pueda agregar un número,
 * buscar un número determinado, poder modificar un número,
 * eliminar un número e insertar un número en una posición dada
 */

public class App 
{
    ArrayList<Double> listaNumeros;


public static void main(String[] args){

    App miLista = new App(); //Con miLista vamos a poder invocar a los métodos que pertenezcan a la clase App.
    miLista.listaNumeros = new ArrayList(); //Se instancia la clase ArrayList
    miLista.leerOpcion();

}

public void leerOpcion(){

    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
    do{
        System.out.println("\nLista de números");
        System.out.println("\n[1] Agregar");
        System.out.println("\n[2] Buscar");
        System.out.println("\n[3] Modificar elemento");
        System.out.println("\n[4] Eliminar elemento");
        System.out.println("\n[5] Insertar elemento");
        System.out.println("\n[6] Mostrar elementos");
        System.out.println("\n[7] Salir\n");
        System.out.println("\nIngrese opcion (1-7): ");
        opcion = teclado.nextInt();
        switch (opcion){
            case1:
            ingresarValor();
            break;
            case2:
            buscarValor();
            break;
            case3:
            modificarValor();
            break;
            case4:
            eliminarValor();
            break;
            case5:
            eliminarValor();
            break;
            case6:
            mostrarLista();
            break;
        }




    }while (opcion != 7);


}



}

