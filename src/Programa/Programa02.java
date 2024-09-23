package Programa;
import java.util.Scanner;
public class Programa02 {
       public static void main(String[] args) {
          /* Declaracion de variables */
          String Resultado, Caracter, EspacioBlanco;
          int Contar, Tamaño ,TamañoBase, TamañoBaseIndividual ;
          /* Ingreso de datos */
          Scanner lectura = new Scanner(System.in);
          System.out.print("Ingrese tamano lado: ");
          Tamaño = lectura.nextInt();
          System.out.print("Ingrese caracter: ");
          Caracter = lectura.next();
          /* Calculo */          
          Contar=1;
          Resultado ="";
          EspacioBlanco = " ";
          TamañoBase = Tamaño + (Tamaño -1 );
          while(Contar<=Tamaño)
          {
              TamañoBaseIndividual = Contar+(Contar - 1);
              Resultado += EspacioBlanco.repeat((TamañoBase-TamañoBaseIndividual)/2) + 
                      Caracter.repeat(TamañoBaseIndividual)+ 
                      EspacioBlanco.repeat((TamañoBase - TamañoBaseIndividual)/2) + "\n";
              Contar++;
          }
          /*Mostrar Resultado*/
          System.out.println("El resultado es : \n" + Resultado);
      }
}
