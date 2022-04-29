
package Variables;
import java.util.Scanner; 
public class variables {
    public static void EJ1(){
        
        
        System.out.println("ingrese un numero entero");
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        System.out.printf("\nLa variable ingresada es: %d y el es: %d\n",x,x*2);       
  
    }// ejercicio 1
    public static void EJ2(){
        
        System.out.println("ingrese un número decimal: ");
        Scanner scn=new Scanner(System.in);
        float x=scn.nextFloat();
        System.out.println("ingrese otro número decimal: ");
        float y=scn.nextFloat();
        System.out.printf("La suma de %f y %f es: %f",x,y,x+y);
    }
    public static void EJ3(){
        
        System.out.println("ingrese un número decimal: ");
        Scanner scn=new Scanner(System.in);
        float a=scn.nextFloat();
        System.out.println("ingrese otro número decimal: ");
        float b=scn.nextFloat();
        System.out.printf("los número ingresados son: %f, y %f y la operación a^b= %f",a,b,Math.pow(a, b));
    }
}
