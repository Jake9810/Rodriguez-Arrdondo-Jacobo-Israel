package While;
import java.util.*;
import java.lang.Math.*;
import Funciones.Fun;
public class WHILE_Ej {
    public static void tres(){
        Random rnd=new Random();
        double n =rnd.nextDouble(10000),opc=0;// 0<=n<100
        int i=0;
        System.out.printf("while n: %f > 1\n",n);
        while(n>=1)
        {
            opc=Math.pow(2,i);
            n=n/opc;
            i++;
            System.out.printf("ciclo: %d | n: %f | opc: %f\n",i,n,opc);
        }

    }
}
