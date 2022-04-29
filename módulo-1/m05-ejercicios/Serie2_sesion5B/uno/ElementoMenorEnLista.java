package uno;
import Fun.Funciones;
import java.util.ArrayList;
import java.util.*;
public class ElementoMenorEnLista {
    public static void MinimoEnLista()
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.printf("Ingrese la cantidad de elementos que contendra la lista: ");
        n=scn.nextInt();
        ArrayList<Double>lst= Funciones.LeerListDouble(n);
        int index=0;
        double min=lst.get(0);
        for(int i=1; i<lst.size(); i++)
        {
            if(lst.get(i)<min)
            {
                min=lst.get(i);
                index=i+1;
            }
        }
        System.out.printf("valor menor en la lista: %f tiene index: %d\n",min,index);
    }
}
