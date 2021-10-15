/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto5santiagovaldez;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    
    private String idPersona;
    private String nombre;
    private String cedula;
    private String numTelefono;
    private String direccion;
    private String edad;
    
public void mostrarDatos (){
    System.out.println("El id ingresado es" + idPersona);
    System.out.println("El nombre ingresado es" + nombre);
    System.out.println("La cedula ingresada es" + cedula);
    System.out.println("El numero de telefono ingresado es" + numTelefono);
    System.out.println("La direccion ingresada es" + direccion);
    System.out.println("La edad ingresada es"+ edad);
   
} 
public void ingresarDatos() {
     System.out.println("Ingresar su ID");
     idPersona= leer.nextLine();
     System.out.println("Ingresar su nombre");
     nombre= leer.nextLine();
     System.out.println("Ingresar su cedula");
     cedula= leer.nextLine();
     System.out.println("Ingresar su numero de telefono");
     numTelefono= leer.nextLine();
     System.out.println("Ingresar su direccion");
     direccion= leer.nextLine();
     System.out.println("Ingresar su edad");
     edad= leer.nextLine();
  
}
 
}
