package CondicionalesDeSeleccion;
import java.util.*;

import Enumeraciones.Cartas;
public class EjerciciosCS {
    public static void TipodeCarta(){
        Scanner scn=new Scanner(System.in);
        String c,t,n;
        System.out.print("ingrese el color de la carta que quiere: ");
        c=scn.nextLine();
        switch(c)
        {
            case "negro":
                            System.out.print("Ingrese el tipo de carta que quiere: ");
                            t=scn.nextLine();
                            switch(t)
                            {
                                case "trebol":
                                    Cartas trebol=Cartas.CartasNegras("trebol");
                                    System.out.print("Ingrese el número de carta que quiere: ");
                                    n=scn.nextLine();
                                    switch(n)
                                    {
                                        case "Az": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "2": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "3": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "4": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "5": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "6": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "7": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "8": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "9": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "10": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "Joker": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "Reina": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        case "Rey": System.out.println("aquí esta es su carta: "+trebol.getmano(n)); break;
                                        default: System.out.println("esa carta no existe en el set trebol");
                                    }
                                    break;
                                case "picas":
                                    Cartas picas =Cartas.CartasNegras("picas");
                                    System.out.print("Ingrese el número de carta que quiere: ");
                                    n=scn.nextLine();
                                    switch(n)
                                    {
                                        case "Az": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "2": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "3": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "4": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "5": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "6": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "7": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "8": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "9": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "10": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "Joker": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "Reina": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        case "Rey": System.out.println("aquí esta es su carta: "+picas.getmano(n)); break;
                                        default: System.out.println("esa carta no existe en el set picas");
                                    }
                                    break;
                            }
                break;
            case "rojo":
                            System.out.print("Ingrese el tipo de carta que quiere: ");
                            t=scn.nextLine();
                            switch(t)
                            {
                                case "diamantes":
                                    Cartas diamante=Cartas.CartasRojas("diamantes");
                                    System.out.print("Ingrese el número de carta que quiere: ");
                                    n=scn.nextLine();
                                    switch(n)
                                    {
                                        case "Az": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "2": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "3": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "4": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "5": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "6": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "7": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "8": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "9": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "10": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "Joker": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "Reina": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        case "Rey": System.out.println("aquí esta es su carta: "+diamante.getmano(n)); break;
                                        default: System.out.println("esa carta no existe en el set diamante");
                                    }
                                    break;
                                case "corazones":
                                    Cartas corazones =Cartas.CartasRojas("corazones");
                                    System.out.print("Ingrese el número de carta que quiere: ");
                                    n=scn.nextLine();
                                    switch(n)
                                    {
                                        case "Az": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "2": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "3": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "4": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "5": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "6": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "7": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "8": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "9": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "10": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "Joker": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "Reina": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        case "Rey": System.out.println("aquí esta es su carta: "+corazones.getmano(n)); break;
                                        default: System.out.println("esa carta no existe en el set corazones");
                                    }
                                    break;
                                default: System.out.println("no exite ese tipo de cartas "); break;
                            }
                            break;
            default:System.out.println("no exite ese color de cartas "); break;
        }
    }
}
