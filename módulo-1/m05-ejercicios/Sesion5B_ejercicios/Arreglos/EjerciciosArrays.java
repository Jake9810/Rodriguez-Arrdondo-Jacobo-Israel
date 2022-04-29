/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;
import java.util.Scanner;
public class EjerciciosArrays {
    public static void EJ1(){
        System.out.println("\nimprimir arreglo al derecho y al reves");
        int [] array={5,2,3,1,4};
        System.out.println("Hacía enfrente | Hacía atrás");
        String s1="Hacía enfrente | Hacía atrás";
        for(int i=0; i<s1.length(); i++){System.out.print("-");}
        for(int i=0; i<array.length; i++)
        {
            System.out.printf("\n%d | %d",array[i],array[4-i]);
        }

    }
    public static void EJ2(){
        System.out.println("Ingrese el tamaño del arreglo: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]= new int[n];
        int opc=0;
        System.out.println("ingrese los valores del arreglo\n");
        for(int i=0; i<n; i++)
        {
            System.out.printf("a[%d]: ",i+1);
            a[i]=scn.nextInt();
            opc+=a[i];
        }
        System.out.printf("la suma de todos lo valores del arreglo son: %d",opc);
    }
    public static void EJ3(){
        System.out.print("Ingrese el tamaño del arreglo: ");
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println("Ingrese los valores que desea: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.printf("a[%d]: ",i+1);
            a[i]= scn.nextInt();
        }
        System.out.println("La lista ingresada es: ");
        for(int elemtns:a)
        {
            System.out.println(elemtns);
        }
        System.out.println("Ingrese las posiciones que le gustaria intercambiar sus valores: ");
        int[] opc1=new int[2];
        for(int i=0; i<2; i++)
        {
            System.out.printf("\nPosición %d:",i+1);
            opc1[i]=scn.nextInt();
            opc1[i]-=1;
        }
        int opc2=0;
        opc2=a[opc1[0]];
        a[opc1[0]]=a[opc1[1]];
        a[opc1[1]]=opc2;
        System.out.printf("Lista después de intercambiar los valores de las posiciones %d y %d\n",opc1[0]+1,opc1[1]+1);
        for(int i=0; i<a.length; i++)
        {
            System.out.printf("a[%d]: %d\n",i+1,a[i]);
        }
    }
    
}
