package Programa;
import java.util.Scanner;
public class Programa03 {
      public static void main(String[] args) {
          /* Declaracion de variables */
          String Resultado, Palabras;
          String Opcion ;  
          /* Ingreso de datos */
          Scanner lectura = new Scanner(System.in);
          System.out.println("Ingrese las palabras para formar la oracion, ingrese SI para mostrar la oracion : ");
          /* Calculo */   
          Resultado ="";
          Opcion ="NO";
          while(!Opcion.equals("SI"))
          {  
              Palabras = lectura.next();
              Opcion = Palabras;
              if(!Opcion.equals("SI"))  Resultado += Palabras + " ";    
          }
          /*Mostrar Resultado*/
          System.out.println("La Oracion es : \n" + Resultado);
      }
}
 