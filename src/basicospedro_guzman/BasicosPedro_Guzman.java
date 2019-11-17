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
    public static void numericos() {

       
        boolean tienesDudas;
       
        //Ejemplos de asignación de valores a las variables de tipo booleano
        tienesDudas = true;
        //otros tipos necesarios para ponerlo en practica.
        String cadena= "envía un mensaje al foro.";
        String cadena2= "puedes comenzar.";
        //Mostrar en pantalla el contendido de las variables de tipo booleano mediante operadores logicos.
        System.err.println("Valor tienesDudas");
        System.out.println(tienesDudas);
        if (tienesDudas){System.out.println(cadena);}
        else{System.out.println(cadena2);}
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
