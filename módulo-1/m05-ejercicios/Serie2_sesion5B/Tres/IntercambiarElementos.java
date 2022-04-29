package Tres;

import Fun.Funciones;
import java.util.ArrayList;
import java.util.*;

public class IntercambiarElementos {
    public static void Cambiar(){
        Scanner scn=new Scanner(System.in);
        int n,opc1,opc2;
        double opc;
        System.out.printf("Ingrese la cantidad de elementos que contendra la lista: ");
        n=scn.nextInt();
        ArrayList<Double>lst=Funciones.LeerListDouble(n);
        int[] v=new int[2];
        System.out.println("Ingrese los indices de los valores que quiere intercambiar");
        System.out.print("indice 1: ");
        opc1= scn.nextInt()-1;
        System.out.print("indice 2: ");
        opc2= scn.nextInt()-1;
        opc=lst.get(opc1);
        lst.set(opc1,lst.get(opc2));
        lst.set(opc2,opc);
        System.out.println("lista despues de cambiar los valores:");
        Funciones.ImpLista(lst);
    }
}
