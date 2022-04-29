import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI
 */
public class suma_lista_enteros {
    public static void main(String[] args){
        /* //ejercicio 2b.E2
        int[] lsta= new int[5];
        
        lsta[0]=2;
        lsta[1]=6;
        lsta[2]=5;
        lsta[3]=3;
        lsta[4]=1;
        
        int opc=0;
        
        for(int i=0; i<5; i++)
        {
            opc+=lsta[i];
        }
        
        
            System.out.println(opc);*/
        

        // ejercicio 2b.E3
        // Determinar si x está en el intervalo de [1, 5) o de (10, 15]
        /*int x;
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("ingrese el valor que desea evaluar: ");
        x=scanner.nextInt();
        if(x>=1 && x<=5)
        {
            System.out.println("el valor introducido esta en el rago 5>=x>=1");
        }
        else if(x>=10 && x<=15)
        {
                System.out.println("el valor introducido esta en el rago 15>=x>=10");
        }
        else
        {
                System.out.printf("el valor introducido no esta en los rangos disponibles, valor: %d",x);
        }
        */
        
        //Ejercicio 2b.E4 - Calcular primeros N números de Fibonacci
        int n,a,b,c;
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("ingrese el valor que desea: ");
        n=scanner.nextInt();
        b=a=1;
        System.out.printf("C: %d\nC: %d\n",a,b);
        for(int i=3; i<=n; i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.printf("C: %d\n",c);
        }
        
        
    
    }

        
}
