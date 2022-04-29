package Enumeraciones;


import java.util.*;

public class Cartas {
    String tipoCarta;
    int numCartas=13;
    String Color;
    List<String> mano = Arrays.asList("Az","2","3","4","5","6","7","8","9","10","Joker","Reina","Rey");
    Cartas(String tp,String Colour)
    {
        tipoCarta=tp;
        Color=Colour;
    }
    public String getmano(String n)
    {
        String elm="null";
        int opc = 0;
        for(int i=0; i<13; i++)
        {//System.out.printf("en el for %d:"+mano.get(i)+"\n",i);
            if(n.equals(mano.get(i)))
            {
                //System.out.printf("i: %d\n",i);
                opc=i;
                break;
            }
        }
        elm=mano.get(opc);
        return elm;
    }


    public static Cartas CartasNegras(String tip){
        if(tip=="trebol" || tip=="picas")
        {
            Cartas ManoNegra =new Cartas(tip,"Negro");
            return ManoNegra;
        }

        else
        {
            System.out.println("este color no coresponde al tipo de mano que describe");
            return null;
        }
    }

    public static Cartas CartasRojas(String tip){
        if(tip=="diamantes" || tip=="corazones")
        {
            Cartas ManoRoja =new Cartas(tip,"Rojo");
            return ManoRoja;
        }

        else
        {
            System.out.println("este color no coresponde al tipo de mano que describe");
            return null;
        }
    }
    public static boolean CartaPosible(String tp, String C, String nm){
        Boolean posible=null;
        if(C=="rojo")
        {
            Cartas DeckRojo=CartasRojas(tp);
            if(DeckRojo!=null)
            {
                System.out.print("Si es posible generar una carta "+C+" para "+tp+": ");
                posible=true;
                return posible;
            }
            else
            {
                System.out.print("No es posible generar una carta "+C+" para "+tp+": ");
                posible=false;
            }
        }
        else if(C=="negro")
        {
            Cartas DeckNegro=CartasNegras(tp);
            if(DeckNegro!=null)
            {
                System.out.print("Si es posible generar una carta "+C+" para "+tp+": ");
                posible=true;

            }
            else
            {
                System.out.print("No es posible generar una carta "+C+" para "+tp+": ");
                posible=false;
            }
        }
        else
        {
            System.out.print("No es posible generar una carta "+C+" para "+tp+": ");
            posible=false;
        }
        return posible;

    }
}
