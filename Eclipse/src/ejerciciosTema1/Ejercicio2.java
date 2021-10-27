/*En el método main de una clase Java llamada Conversor escribe un programa
en Java que convierta de euros a dólares. El dato de entrada será un número
decimal correspondiente a la cantidad en euros, y el dato de salida será un
número decimal que representará la cantidad correspondiente en dólares con
una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.*/



package ejerciciosTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserte la cantidad de euros que desee convertir a dolares: ");
        String euros = reader.readLine();

        double eurosDouble = Double.parseDouble(euros);
        double conversion;
        conversion = eurosDouble/0.8613;

        DecimalFormat df = new DecimalFormat("#.00"); //las comillas son importantes, si no te dice que el construct is undefined


        System.out.println(euros + " euros20 son " + (df.format(conversion)) + " dólares." );
        
    }
    
}

