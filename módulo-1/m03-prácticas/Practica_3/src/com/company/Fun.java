package com.company;

import org.jetbrains.annotations.NotNull;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Fun {//clase de funciones  que implementan la lectura, de datos, impresión de arreglos de datos y el método
    //de ordenamiento "burbuja"
    public static String Leer(){// funcion que retorna una valor String para leer los datos provenientes del teclado del
        //usuario
        Scanner scn=new Scanner(System.in);/*se crea un objeto scanner para poder caputurar los datos que dese ingresar
        el usuario*/
        String dato=scn.nextLine();/*con la variable String datos se almacenan el/los datos introduciodos por el usuario*/
        return dato;// se regresa el valor capturado para poder hacer uso de el en otras partes del programa.
    }
    public static int[] LeerLista(int n){/*función la cual lee n-1 datos introduciodos por el usurio y retorna una lista
    de tamaño n*/
        int[] lst=new int[n];//creación de la lista con capacidad para n elementos
        System.out.println("Ingrese los valores de la lista:");
        for(int i=0; i<n; i++)//ciclo for para asignar las n-1 posiciones con los datos que desee introduccir el usuario
        {
            System.out.print("lst["+i+"]: ");// impresion de la posicion en la lista que va almacenar el dato
            lst[i]=Integer.parseInt(Leer());//parsing de los datos introducidos por el usuario a entero y asignación en
            //el espacion de memoria correspondiente.
        }
        return lst;//retorno de la lista creada por el usuario

    }
    public static void Imp(int[] lst){/*funcion para imprimir todos los elementos que se encuentren en un arreglo
    tipo entero*/
        if(lst== null){//verificación que la lista no este vacia
            System.out.println("La lista que quiere imprimir esta vacia");
        }
        else{
            for(int elemt: lst)/*ciclo for que itera sobre todos los elementos de la lista para imprirlos*/
            {
                System.out.println(elemt);
            }
        }
    }
    public static void Burbuja(int[] lst,int n){/*función para la implementacion del metodo de ordenamiento burbuja
    el cual toma como parametros un arreglo de enteror un un entero que termina la cantidad de datos que debe almacenar
    el arrego*/
        int opc=0;//variable para el almacenamiento de un dato de manera temporal
        for(int i=0; i<n; i++)/*ciclo for para iterar sobre cada elemento del arrego*/
        {
            for(int j=0; j<n; j++)/*ciclo for anidado para la iteración de cada elemento del arreglo*/
            {
                if(lst[j]>=lst[i])/*sentencia condicional para verificar que el valor actual del arreglo sea mayor o
                menor del valor actual en la lista, en caso de que se cumpla la condición se realizará lo siguiente:*/
                {
                    opc=lst[j];//el siguiente valor de la lista es guardado en la variable temporal
                    lst[j]=lst[i];//el valor actual se le asigna a la siguiente direccion de memoria
                    lst[i]=opc;//la dirección de memoria actual se le accina el valor guardado en la variable temporal
                }
            }//for 2
        }//for 1
    }

}
