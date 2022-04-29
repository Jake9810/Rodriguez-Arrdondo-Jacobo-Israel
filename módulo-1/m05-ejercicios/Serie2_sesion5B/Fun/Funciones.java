package Fun;

import org.jetbrains.annotations.NotNull;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
public class Funciones {
    public static @NotNull ArrayList LeerListDouble(int n){
        System.out.println("Ingrese los valores de la lista: ");
        Scanner scn=new Scanner(System.in);
        ArrayList<Double>lst=new ArrayList<Double>(n);
        for(int i=0; i<n; i++)
        {
            System.out.printf("lst[%d]: ",i+1);
            lst.add(scn.nextDouble());
            //System.out.print("\n");
        }
        return lst;
    }

    public static void ImpLista(ArrayList lst){
        int i=1;
        for(Object element:lst)
        {
            System.out.printf("lst[%d]: %f\n",i,element);
            i++;
        }
    }

    public static boolean BuscarE(ArrayList<Double> lst, Double v){
        Boolean state=null;
        for(Double elemt:lst)
        {
            if(elemt.equals(v))
            {
                state=true;
                break;
            }
            else
            {
                state=false;
            }
        }
        return state;
    }
}

