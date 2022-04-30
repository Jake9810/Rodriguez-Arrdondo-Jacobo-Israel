package IF;
import java.util.*;
//import java.lang.Math;
public class IF_EJ {
    public static void ejIF(){
        Random rnd=new Random();
        ArrayList<Double>calif=new ArrayList<Double>();//creación de lista para las calificaciones de alumnos
        int n =rnd.nextInt(10);// 0<=ALUMNOS<10
        System.out.printf("Cantidad de Alumnos: %d\n",n);
        for(int i=0; i<n; i++)
        {
            calif.add(rnd.nextDouble()*10);// llenado de calificaciones al azar
        }
        for(int i=0; i<calif.size(); i++)
        {
            if(calif.get(i)>5.9)
            {
                System.out.printf("El alumno %d paso con: %f\n",i+1,calif.get(i));
            }

            else
            {
                System.out.printf("El alumno %d no paso: %f\n",i+1,calif.get(i));
            }
        }
    }
}
