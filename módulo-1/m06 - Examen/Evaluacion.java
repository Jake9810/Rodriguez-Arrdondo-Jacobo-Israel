import IF.IF_EJ;
import FOR.ForEj;
import While.WHILE_Ej;
import Nintendo.Switch;
import java.util.*;

import EJ5.conteo;
public class Evaluacion {
    public static void main(String[] args){
        //Ejericio de if
        System.out.println("Ejericio de if");
        IF_EJ.ejIF();

        //Ejericio de for
        //System.out.println("Ejericio de for");
        //ForEj.ej();

        //Ejericio de while
        //System.out.println("Ejericio de while");
        //WHILE_Ej.tres();

        //Ejericio de switch
        //System.out.println("Ejericio de switch");
        //Switch.sw_ej();

        //Ejercicio Clase
        /*System.out.println("Ejericio de clase conteo");
        Random rnd=new Random();//inicialización de objeto random
        int i =rnd.nextInt(100), j=rnd.nextInt(100), opc=0;// i y j son variables para determinar el valor
        //inicial de el c1 y c2 respectivamente, opc es la cantidad de cilcos que se va a repetir las opereaciones
        conteo c1=new conteo(i,"c1"); //contador 1
        conteo c2=new conteo(j,"c2"); // contador 2
        System.out.printf("inicio ---> %s conteo: %d | %s conteo: %d \n",c1.getNombre(),c1.getConteo(),c2.getNombre(),c2.getConteo());
        while(opc!=100)// mientras opc<100
        {
            i =rnd.nextInt(10);// se reutilizasn las variables para deteminar si son pares o impares
            j=rnd.nextInt(10);
            if(opc%2==0)// cada vez que opc sea un multiplo de 100 se imprimiria el ciclo y los vaolres que tienen los contadores en ese ciclo
            {
                System.out.printf("cilco: %d | %s conteo: %d | %s conteo: %d \n",opc+1,c1.getNombre(),c1.getConteo(),c2.getNombre(),c2.getConteo());
            }
            else if(i%2==0 && j%2==0)//si i y j son pares se incrementan sus conteos
            {
                c1.incrementar();
                c2.incrementar();
            }
            else if(i%2!=0 && j%2!=0)//si i y j son impares se decrementan sus conteos
            {
                c1.decrementar();
                c2.decrementar();
            }
            else if(i%2==0 && j%2!=0)//si i es par se incrementa el conteo de c1 y se decrementa el conteo de c2
            {
                c1.incrementar();
                c2.decrementar();
            }
            else if(i%2!=0 && j%2==0)//si j es par se incrementa el conteo de c2 y se decrementa el conteo de c1
            {
                c1.decrementar();
                c2.incrementar();
            }
            else //caso especial donde no se cumplen las condiciones se imprime el ciclo y los valores de cada contador
            {
                System.out.printf("[x]cilco: %d | %s conteo: %d | %s conteo: %d \n",opc,c1.getNombre(),c1.getConteo(),c2.getNombre(),c2.getConteo());
            }
                opc++;
        }*/


    }
}
