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
    /**
     * Método para mostrar ejemplos de tipo String.
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }
    public static void cadenas() {

       String cadena;
       String cadena2;

        //Ejemplos de asignación de valores a las variables de tipo String
        cadena = "envía un mensaje al foro.";
        cadena2 = "puedes comenzar.";

        //Mostrar en pantalla el contendido de las variables de tipo String.
        System.out.println("Valor cadena");
        System.out.println(cadena);
        System.out.println("Valor cadena2");
        System.out.println(cadena2);
    }
    public static boolean logicos() {

        boolean tienesDudas;
       
        //Ejemplos de asignación de valores a las variables de tipo booleano
        tienesDudas = true;
        
        //Este metodo devuelve un valor booleano que utilizaremos con operadores logicos para elegir una opcion u otra.
        return tienesDudas;
    }
    public static void main(String[] args) {
       numericos();
       cadenas();
        System.out.println("si tienes dudas: ");
       if (logicos()==true){
           System.out.println("envía un mensaje al foro.");
           
       }else{System.out.println("puedes comenzar.");}
        
    }
    
}
