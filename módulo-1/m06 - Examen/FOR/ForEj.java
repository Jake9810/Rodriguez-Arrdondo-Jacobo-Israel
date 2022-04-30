package FOR;
import java.util.*;
import Funciones.Fun;
public class ForEj {
    public static void ej(){
        Random rnd=new Random();
        ArrayList<Double>lst=new ArrayList<Double>();//creación de lista para las calificaciones de alumnos
        int n =rnd.nextInt(100);// 0<=n<100
        double opc=0;
        System.out.printf("Cantidad de elementos: %d\n",n);
        for(int i=0; i<n; i++)
        {
            lst.add(rnd.nextDouble());// llenado de la lista con numero al azar
        }
        System.out.println("lista antes de ser ordenada");
        Fun.ImpArrayDouble(lst);// funcion que utiliza un for por elementos para imprimir cada valor de la lista
        // solo funciona con ArrayList<Double>
        for(int i=0; i<lst.size(); i++)// uso de for anidado par arealizar ordenamineto burbuja
        {
            for(int j=0; j<lst.size(); j++)
            {
                if(lst.get(i)< lst.get(j))
                {
                    opc=lst.get(j);
                    lst.set(j,lst.get(i));
                    lst.set(i,opc);
                }
            }
        }
        System.out.println("lista depués de ser ordenada");
        Fun.ImpArrayDouble(lst);
    }
}
