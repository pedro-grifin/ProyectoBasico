/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicospedro_guzman;

/**
 *
 * @author Usuario
 */
public class BasicosPedro_Guzman {

    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static boolean logicos() {

       
        boolean tienesDudas;
       
        //Ejemplos de asignación de valores a las variables de tipo booleano
        tienesDudas = true;
        
        //Mostrar en pantalla el contendido de las variables de tipo booleano mediante operadores logicos. 
        return tienesDudas;
    }
    public static void main(String[] args) {
        System.out.println("si tienes dudas: ");
       if (logicos()==true){
           System.out.println("envía un mensaje al foro.");
           
       }else{System.out.println("puedes comenzar.");}
        
    }
    
}
