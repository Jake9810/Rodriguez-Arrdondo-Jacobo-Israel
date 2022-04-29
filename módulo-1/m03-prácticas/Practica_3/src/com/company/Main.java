package com.company;

import static com.company.Fun.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dame el tamaño de la lista ordenada: ");
        int n = Integer.parseInt(Leer());//implemetación de la función leer, el resultado regresado por la función se
        //convierte en intero para poder usar el dato como un número
        int[] lst=LeerLista(n);//implementación de la función leer lista para asignar los valores deseados por el usuario
        System.out.println("Lista antes de ordenar:");
        Imp(lst);// impresión de la lista sin ordernar
        Burbuja(lst,n);//implementación del método de ordenamiento burbuja
        System.out.println("Lista ordenada:");
        Imp(lst);// impresión de la lista ordenada

    }
}
