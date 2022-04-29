
package IteradoresTradicionales;

public class EjerciciosIT {
    public static void EJ1(){
        int opc=0;
        for(int i=0; i<=100; i++)
        {
            opc+=i;
        }
        System.out.printf("\nLa suma de los  primeros 100 números naturales es: %d\n",opc);
    }
    
    public static void EJ2(){
        System.out.println("Lista de los primeros 100 números naturales poniendo el número y su complemento a 100\n");
        for(int i=0; i<=100; i++)
        {
            System.out.printf("%d - %d \n",i,100-i);
        }
    }
    public static void EJ3(){
        System.out.println("Sumar los números del 1 al 100 pero sólo si son múltiplos de 3 o 7\n");
        int opc3=0;
        int opc7=0;
        for(int i=1; i<=100; i++)
        {
            if(i%3==0)
            {
                opc3+=i;
                //System.out.printf("%d es multiplo de 3\n",i);
            }
            else if(i%7==0)
            {
                opc7+=i;
                //System.out.printf("%d es multiplo de 7\n",i);
            }
            else
            {
                //System.out.println("");
            }
        }//for
        System.out.printf("la suma de los números del 1 al 100 que son multiplos de 3: %d\n",opc3);
        System.out.printf("la suma de los números del 1 al 100 que son multiplos de 7: %d\n",opc7);
    }
}
