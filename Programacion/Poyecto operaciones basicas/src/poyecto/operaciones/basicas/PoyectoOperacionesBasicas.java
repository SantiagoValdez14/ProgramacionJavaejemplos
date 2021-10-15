/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyecto.operaciones.basicas;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class PoyectoOperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        System.out.println("Santiago");
        System.out.println("--------");
        
        
        
       //sumaOperacion();
       //restaOperacion();
       //divOperacion();
       //multiOperation();
       //raizOperacion();
      // poOperacion();
      clasescannerOperation();
    }
    public static void sumaOperacion (){
        System.out.println("Esta es mi suma");
        int num = 5;
        int num2 = 5;
        int resp= num + num2;
        System.out.println(resp);
        System.out.println("La respuesta de la suma es:" + resp);
    }
    public static void restaOperacion (){
        int num = 5;
        int num2 = 5;
        int resp= num - num2;
        System.out.println(resp);
        System.out.println("La respuesta de la resta es:" + resp);
    }
    public static void multiOperation (){
        int num = 2;
        int num2 = 4;
        int resp= num * num2;
        System.out.println(resp);
        System.out.println("La respuesta de la multi es:" + resp);
    }
    public static void divOperacion (){
        int num = 100;
        int num2 = 5;
        int resp= num / num2;
        System.out.println(resp);
        System.out.println("La respuesta de la div es:" + resp);
    }
    public static void raizOperacion (){
        int num = 16;
        double resp= Math.sqrt(num);
        System.out.println(resp);
        System.out.println("La respuesta de la raiz es:" + resp);
    }
     public static void poOperacion (){
        double num = 2;
        double nump = 4;
        double resp;
        resp = Math.pow(num,nump);
        System.out.println(resp);
        System.out.println("La respuesta de la potencia es:" + resp);
    }
      public static void clasescannerOperation(){
          System.out.println("Ingresar el nombre del usuario");
          Scanner leer = new Scanner (System.in);
          var usuario= leer.nextLine();
          System.out.println("usuario"+usuario);
          
          
    }
      
}
