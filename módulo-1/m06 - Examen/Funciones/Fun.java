package Funciones;

import java.util.ArrayList;

public class Fun {
    public static void ImpArrayDouble(ArrayList<Double> lst)
    {
        int i=0;
        for(double element:lst)
        {
            System.out.printf("lst[%d]: %f\n",i+1,element);
            i++;
        }
    }
}
