package Dos;
import Fun.Funciones;
import java.util.ArrayList;
import java.util.*;

public class BuscarYEliminar {
    public static void ByE(){
        Scanner scn=new Scanner(System.in);
        int n,index=0;
        Double x;
        System.out.printf("Ingrese la cantidad de elementos de la lista:");
        n=scn.nextInt();
        ArrayList<Double>lst=Funciones.LeerListDouble(n);
        System.out.printf("Ingrese el valor que desea eleiminar: ");
        x=scn.nextDouble();
        if(Funciones.BuscarE(lst,x))
        {
            index=0;
            for(Double elemt:lst)
            {
                if(elemt.equals(x))
                {
                    System.out.printf("el index del elemento a borrar es: %d\n",index+1);
                    break;
                }
                index++;
            }
            lst.remove(index);
            System.out.printf("La lista despues de que %f fue eliminado: \n",x);
            Funciones.ImpLista(lst);
        }
        else
        {
            System.out.println("el elemento que ingreso no existe en la lista");
        }
    }
}
