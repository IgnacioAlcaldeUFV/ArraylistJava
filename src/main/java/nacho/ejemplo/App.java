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
            insertarValor();
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
    System.out.println("Valor a modificar");
    valor = teclado.nextDouble();
    indice = listaNumeros.indexOf(valor);
    if (indice != -1){
        System.out.println("Nuevo valor: ");
        nuevoValor = teclado.nextDouble();
        listaNumeros.set(indice, nuevoValor);
    } else {
        System.out.println("Dato no se encuentra");
    }
}

public void eliminarValor(){
    Scanner entrada = new Scanner(System.in);
    double valor;
    int indice;
    System.out.println("Valor a eliminar: ");
    valor = entrada.nextDouble();
    indice = listaNumeros.indexOf(valor);
    if (indice != -1){
        listaNumeros.remove(indice);
        System.out.println("Dato eliminado");
    } else {
        System.out.println("Dato no se encuentra");
    }
}

public void insertarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a insertar");
        valor = teclado.nextDouble();
        System.out.println("Posicion donde desea insertar");
        indice = teclado.nextInt();
        listaNumeros.add(indice, valor); //Poner en la posicion indice el valor
    }

public void mostrarLista(){
        if(!listaNumeros.isEmpty()){
            System.out.println("Elementos de la lista: ");
            for(int i = 0; i < listaNumeros.size(); i++){
                System.out.println(listaNumeros.get(i)); //Muestra el contenido de la posición del array
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }

}

