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
public class Carro {
    Scanner leer = new Scanner(System.in);
    private String idcarro;
    private String Modelo;
    private String color;
    private String marca;
    
    
    public void mostrarDatos (){
    System.out.println("El id del carro es" + idcarro);
    System.out.println("El modelo es" + Modelo);
    System.out.println("El color es" + color);
    System.out.println("la marca es" + marca);
   
} 
public void idCarro() {
     System.out.println("Ingresar el id del carro");
     idcarro= leer.nextLine(); 
}
public void  modelo (){
     System.out.println("Ingresar el modelo");
     Modelo= leer.nextLine();       
  }
public void  color (){
     System.out.println("Ingresar el color desado");
     color= leer.nextLine();      
  }
public void  marca (){
     System.out.println("Ingresar la marca");
     marca= leer.nextLine();     
  }
}
