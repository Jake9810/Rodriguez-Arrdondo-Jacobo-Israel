package Cuatro;
import Fun.Funciones;
import java.util.ArrayList;
import java.util.*;
public class OrdernarLista {
    public static ArrayList<Double> AlgoritmoOrdenamiento(ArrayList<Double>lst)
    {
        ArrayList<Double>ListaFinal=new ArrayList<Double>();
        Boolean opc=lst.isEmpty();
        int index=0;
        double min=lst.get(0);
        while(lst.size()>1)
        {

            for(int i=0; i<lst.size(); i++)
            {
                if(lst.get(i)<min)
                {
                    min=lst.get(i);
                    index=i;
                }
            }
            ListaFinal.add(min);
            lst.remove(index);
            min=lst.get(0);
        }
        ListaFinal.add(lst.get(0));
        lst.remove(0);
        return ListaFinal;
    }
    public static void Ordernar(){
        Scanner scn=new Scanner(System.in);
        int n,index=0;
        Double x;
        System.out.printf("Ingrese la cantidad de elementos de la lista:");
        n=scn.nextInt();
        ArrayList<Double>lst=Funciones.LeerListDouble(n);
        ArrayList<Double>nlst=AlgoritmoOrdenamiento(lst);
        System.out.println("La lista ordenada es:");
        Funciones.ImpLista(nlst);
    }
}
