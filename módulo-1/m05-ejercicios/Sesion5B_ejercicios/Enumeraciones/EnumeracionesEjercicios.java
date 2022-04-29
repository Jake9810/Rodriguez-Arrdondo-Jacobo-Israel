package Enumeraciones;
import java.util.*;
import java.util.Scanner;
public class EnumeracionesEjercicios {
    public static void Ej1()
    {
        Cartas[] FullDeck=new Cartas[4];
        FullDeck[0]=Cartas.CartasNegras("trebol");
        FullDeck[1]=Cartas.CartasNegras("picas");
        FullDeck[2]=Cartas.CartasRojas("diamantes");
        FullDeck[3]=Cartas.CartasRojas("corazones");
        System.out.println("Deck completo de cartas");
        for(int i=0; i<4; i++)
        {
            System.out.println("tipo: "+FullDeck[i].tipoCarta+", Color: "+FullDeck[i].Color+"\nMano:\n");
            for(int j=0; j<FullDeck[i].mano.size(); j++)
            {
                System.out.printf("carta[%d]: "+FullDeck[i].mano.get(j)+", ",j+1);
            }
        }
    }
    public static void Ej2(){
        Scanner scn=new Scanner(System.in);
        String[] parameters=new String[3];
        List<String> inst=Arrays.asList("tipo: ","color: ","numero de carta: ");
        System.out.println("ingrese los siguientes dato: ");
        for(int i=0; i<3; i++)
        {
            System.out.print(inst.get(i));
            parameters[i]=scn.nextLine();
        }
        System.out.println(Cartas.CartaPosible(parameters[0],parameters[1],parameters[2]));
    }
}
