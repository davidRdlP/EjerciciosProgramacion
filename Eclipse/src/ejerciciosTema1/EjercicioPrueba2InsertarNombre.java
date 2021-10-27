/*En el método main de una clase Java llamada Conversor escribe un programa
en Java que convierta de euros a dólares. El dato de entrada será un número
decimal correspondiente a la cantidad en euros, y el dato de salida será un
número decimal que representará la cantidad correspondiente en dólares con
una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.*/



package ejerciciosTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioPrueba2InsertarNombre {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba su nombre: ");  //print me deja escribir en la misma linea en la consola de comandos
        String name = reader.readLine();

        System.out.println("Escriba su apellido: "); // print ln me hace escribir justo una linea debajo del output
        String surname = reader.readLine();

        System.out.println("Su nombre es " + name+ " " + surname);
        
    }
    
}
