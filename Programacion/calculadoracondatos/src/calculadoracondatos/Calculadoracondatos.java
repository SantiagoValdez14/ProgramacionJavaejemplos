/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracondatos;
import java.util.Scanner;
/**
 *
 * @author HP USER
 */
public class Calculadoracondatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Ingresar el termino uno");
          Scanner leer = new Scanner (System.in);
          var num1= leer.nextLine();
          System.out.println("El termino uno es:"+num1);
          
      System.out.println("Ingresar el termino dos");
          var num2= leer.nextLine();
          System.out.println("El termino dos es:"+num2);
          
       System.out.println("Ingresar la potencia");
          var num3= leer.nextLine();
          System.out.println("La potencia es:"+num3);
          
          int a = Integer.parseInt(num1);
          int b = Integer.parseInt(num2);
          int c = Integer.parseInt(num3);
          int res = a + b;
          int res1 = a - b;
          int res2 = a * b;
          int res3 = a/b;
          double res4 = Math.sqrt(a);
          double res5 = Math.sqrt(b);
          double res6 = Math.pow(a,c);
          double res7 = Math.pow(b,c);
          System.out.println("La suma es:"+res);
          System.out.println("La resta es:"+res1);
          System.out.println("La multiplicacion es:"+res2);
          System.out.println("La divicion es:"+res3);
          System.out.println("La raiz del termino uno es:"+res4);
          System.out.println("La raiz del termino dos es:"+res5);
          System.out.println("La potencia del primer numero es:"+res6);
          System.out.println("La potencia del segundo numero es:"+res7);
          
    }
    
}
