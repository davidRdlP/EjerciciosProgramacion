/* En el método main de una clase Java llamada Cronometro escribe un programa
que pida al usuario que introduzca mediante el teclado su nombre y a
continuación muestre en la consola un mensaje que incluya un número real que
represente los segundos y milisegundos que ha tardado en contestar, con un
formato de salida que emplee exactamente 3 dígitos en la parte decimal.
Realiza el ejercicio sin utilizar la clase Scanner. */


package ejerciciosTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ejercicio3 { public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Dime tu nombre: ");

    long startTime = System.nanoTime();
    String nombre = reader.readLine();
    long endTime = System.nanoTime();

    DecimalFormat df = new DecimalFormat("#.000");


    System.out.println("Hola " + nombre+ " has tardado " + (df.format((endTime-startTime)/1e9)) + " segundos en escribir tu nombre." );


}
    
}
