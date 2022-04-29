package Listas;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class EjerciciosListas {
    public static void EJ1(){
        List<Integer> list=new ArrayList<Integer>();
        Scanner scn=new Scanner(System.in);
        int rnd=(int)(Math.random()*10);
        int n=0,opc=0,opc1=0,opc2=0;
        for(int i=0; i<rnd; i++)
        {
            list.add((int)(Math.random()*100));
            opc+=list.get(i);
        }
        System.out.println("los elementos iniciales de la lista son:");
        for(int elemts:list)
        {
            System.out.println(elemts);
        }
        System.out.printf("La suma de los primeros %d elementos es: %d\n",rnd,opc);
        System.out.print("cuantos elementos más desea agregar a la lista: ");
        opc1=list.size();
        n=scn.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.printf("\nlista[%d]: ",i+1);
            list.add(scn.nextInt());
            opc+=list.get(list.size()-1);
        }
        opc2=list.size();
        System.out.printf("La suma de todos los elementos en la lista es: %d\n",opc);
        System.out.printf("la diferencia de elementos entre la lista inicial y la lista con valores agregados por el usuario es: %d",opc2-opc1);
    }
}
