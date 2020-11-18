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

public void ingresarValor(){
    Scanner teclado = new Scanner(System.in);
    double valor = 0;
    System.out.println("Ingrese un valor: ");
    valor = teclado.nextDouble();
    listaNumeros.add(valor); //El elemento add permite añadir un elemento al Arraylist
}

public void buscarValor(){
    Scanner teclado = new Scanner(System.in);
    double valor = 0;
    int indice = 0;
    System.out.println("Valor a buscar: ");
    valor = teclado.nextDouble();
    indice = listaNumeros.indexOf(valor); //El metodo indexOf muestra la posición en que se encuentra el valor en el Arraylist
    if (indice != -1){
        System.out.println("Dato se encuentra en posición: " + indice);
    } else {
        System.out.println("Dato no se encuentra");
    }
}

public void modificarValor(){
    Scanner teclado = new Scanner(System.in);
    double valor, nuevoValor;
    int indice;
    System.out.println("");

}



}

