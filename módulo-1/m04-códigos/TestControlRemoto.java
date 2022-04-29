package TestControlRemoto;
import ControlRemoto.ControlRemoto;
import java.util.Scanner;
public class TestControlRemoto {
    static void ImpInst(){
        System.out.print("1) encender control\n");
        System.out.print("2) apagar control\n");
        System.out.print("3) subir volumen\n");
        System.out.print("4) bajar volumen\n");
        System.out.print("5) siguiente canal\n");
        System.out.print("6) canal canal anterior\n");
    }
    public static void main(String[] args){
        
        ControlRemoto control_1=new ControlRemoto();
        Scanner s=new Scanner(System.in);
        System.out.printf("ingrese la opción que desea escoger\n");
        ImpInst();
        String opc=s.nextLine();
        //String opc1;
        while(opc!="x")
        {
            
            
            opc=s.nextLine();
            switch(opc)
            {
                case "1": control_1.encender(); break;
                case "2": control_1.apagar(); break;
                case "3": control_1.SubirVolumen(); break;
                case "4": control_1.BajarVolumen(); break;
                case "5": control_1.SigCanal(); break;
                case "6": control_1.RegCanal(); break;
                case "x": opc="x"; break;
                default: System.out.printf("Opcion no valida\n");
            }
            //opc=s.nextLine();
           
        }
        System.out.printf("Adios\n");
        
    }
}
