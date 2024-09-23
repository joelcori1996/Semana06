package Programa;
import java.util.Scanner;
public class Programa01 {
      public static void main(String[] args) {
        /* Declaracion de variables */
          String Resultado;
          int Contar, Cantidad ;
          /* Ingreso de datos */
          Scanner lectura = new Scanner(System.in);
          System.out.print("Ingrese cantidad de numeros: ");
          Cantidad = lectura.nextInt();
          /* Calculo */          
          Contar=0;
          Resultado ="";
          while(Contar<Cantidad)
          {
              if(Contar%2==0)Resultado +=Contar + " ";
              Contar++;
          }
          /*Mostrar Resultado*/
          System.out.println("El resultado es : " + Resultado.trim().replace(" ","-"));
      }
}
