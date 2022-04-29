
package CondicionalesTradicionales;

import java.util.Scanner;
import java.lang.Math;
public class Ejercicios {
    
    public static void EJ1(){
        System.out.println("Ingrese un número entero: ");
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        if(x%2==0)
        {
            System.out.printf("la variable %d es entera",x);
        }
        else
        {
           System.out.printf("la variable %d no es entera",x); 
        }
    }
    
    public static void EJ2(){
        System.out.println("Ingrese un número entero: ");
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        if(x%5==0)
        {
            System.out.printf("la variable %d es multiplo de 5",x);
        }
        else if(x%7==0)
        {
            System.out.printf("la variable %d es multiplo de 7",x);
        }
        else
        {
            System.out.printf("la variable %d no es multiplo de 5 o 7",x);
        }
    }
    
    public static void EJ3(){
        System.out.println("Ingrese un número decimal: ");
        Scanner scn= new Scanner(System.in);
        float x=scn.nextFloat();
        float opc=Math.round(x);
        if(opc>x)
        {
            System.out.println("el decimal del numero ingresado son mayores a 0.5");
        }
        else
        {
            System.out.println("el decimal del numero ingresado no son mayores a 0.5");
        }
    }
    
}
