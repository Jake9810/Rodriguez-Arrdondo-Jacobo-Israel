/*
Autor Jacobo Rodriguez
*/
import java.util.Scanner;
public class Test1Robot2D {
  static public String nombre;
  static private int x,y;
  static private char orientacion='e';
    
  static public void Describir(Test1Robot2D robot){
      String n;
      System.out.printf("Ingrese el nombre del robor que desea describir: ");
      
      n=robot.nombre;
      System.out.printf("El nombre de su robot es: %s\n y esta en la posicion\nx: %d\ny=%d\norientación:%c",n,robot.x,robot.y,robot.orientacion);
  
  }
  
    
}
