package CiclosCondicionales;
import java.lang.Math.*;
public class CCEjercicios {
    public static void EJ1(){
        double x=Math.random()*100;
        System.out.printf("Valor inicial de x=%f \n",x);
        int ciclo=0;
        while(x>1)
        {
            x/=1.1;
            ciclo+=1;
            System.out.printf("ciclo: %d | x=%f\n",ciclo,x);
        }
        System.out.printf("La variable x fue dividadia por %d cliclos\n",ciclo);
    }
    public static void EJ2(){
        float mi=4600, interes=0;
        int mes=1, ti=2;
        while(interes!=mi)
        {
            interes+=(ti*mi)/100;
            mes+=1;
            System.out.printf("meses: %d | interés: %f\n",mes,interes);
        }
        System.out.printf("van a pasar %d meses para que el interes sea %f",mes,interes);

    }
}
