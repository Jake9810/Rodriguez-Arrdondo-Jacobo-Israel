package Nintendo;
import java.util.*;
import IF.IF_EJ;
import FOR.ForEj;
import While.WHILE_Ej;
public class Switch {
    public static void sw_ej(){
        System.out.printf("Seleccione una de las siguiente opciones:\n1) Ejercicio if\n2) Ejercicio for\n3) Ejericio while \n9) salir\nopción: ");
        Scanner scn=new Scanner(System.in);
        int n=0;
        while(n!=9)
        {
            n=scn.nextInt();
            switch (n)
            {
                case 1: IF_EJ.ejIF(); break;
                case 2: ForEj.ej(); break;
                case 3: WHILE_Ej.tres(); break;
                case 9: n=9; break;
                default: System.out.printf("opción no valida");
            }
            System.out.printf("Seleccione una de las siguiente opciones:\n1) Ejercicio if\n2) Ejercicio for\n3) Ejericio while \n9) salir\nopción: ");
        }

    }
}
