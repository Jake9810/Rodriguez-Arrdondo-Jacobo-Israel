package IteradoresDeLista;
import java.util.Scanner;
import java.util.*;
public class EjerciciosITDL {
    public static void EJ1(){
        System.out.print("¿cuantos elementos desea leer?: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),opc=0;
        List<Integer> lst=new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            System.out.printf("lista[%d]: ",i+1);
            lst.add(scn.nextInt());
        }

        for(int elements:lst)
        {
            opc+=elements;
        }
        System.out.printf("la suma de los elementos en la lista es: %d",opc);
    }
}
