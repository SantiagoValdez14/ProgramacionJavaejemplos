/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class Formulario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("Ingresar los dos nombres porfavor");
          Scanner leer = new Scanner (System.in);
          var usuario= leer.nextLine();
          System.out.println("Nombres:"+usuario);
          
          System.out.println("Ingresar sus dos apellidos porfavor");
          var apellido= leer.nextLine();
          System.out.println("apellidos:"+apellido);
          
          System.out.println("Ingresar su fecha de nacimiento porfavor");
          var fecha= leer.nextLine();
          System.out.println("Fecha:"+fecha);
          
          System.out.println("Ingresar sus genero porfavor");
          var gen= leer.nextLine();
          System.out.println("Genero:"+gen);
          
          System.out.println("Ingresar su telefono porfavor");
          var num= leer.nextLine();
          System.out.println("Telefono:"+num);
          
          System.out.println("Ingresar sucorreo porfavor");
          var co= leer.nextLine();
          System.out.println("Correo:"+co);
          
          
         
    }
    
}
