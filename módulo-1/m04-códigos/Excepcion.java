/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
//import java.io.FileWriter
public class Excepcion {
    public static void main(String[] args){
     Scanner scn=new Scanner(System.in);
     System.out.println("Ingrese el nombre del archivo que quiere abrir: ");
     String name=scn.nextLine();
     try{
         File f=new File(name);
         File f1=new File("D:\\docs\\DIPLIMADOS\\JAVA\\MODULO 1\\copy.txt");
         BufferedReader br=new BufferedReader(new FileReader(f));
         FileOutputStream fout=new FileOutputStream(f1);
         int r=0;
         while((r=br.read())!=-1)
         {
             System.out.println((br.readLine()));
             
             fout.write(r);
         }
         fout.close();
         
     }
     catch(Exception e){
         System.out.println("se ha presentado un problema al momento de abrir el archivo: "+e.getMessage());
     }
    
         
    



    }//main
}//class

