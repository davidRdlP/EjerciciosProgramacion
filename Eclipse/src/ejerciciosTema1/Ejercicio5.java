/*En el método main de una clase Java llamada Sueldo escribe un programa que
resuelva el problema siguiente: un vendedor recibe un sueldo base más un 10%
extra por comisión de sus ventas; el vendedor desea saber cuánto dinero
obtendrá por concepto de comisiones, por las tres ventas que realiza en el mes
y el total que recibirá en el mes, teniendo en cuenta su sueldo base y las
comisiones. Se utilizará el teclado para la entrada de datos y la consola para la
salida. Para resolver este problema está permitido utilizar la clase Scanner.*/

package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Bienvenido a la calculadora de salario. Escriba su sueldo base: ");
    Double sueldoBase = sc.nextDouble();

    System.out.print("Escriba la cantidad recibida por su primera venta: ");
    Double primeraVenta = sc.nextDouble();

    System.out.print("Escriba la cantidad recibida por su segunda venta: ");
    Double segundaVenta = sc.nextDouble();

    System.out.print("Escriba la cantidad recibida por su tercera venta: ");
    Double terceraVenta = sc.nextDouble();
    sc.close();

    Double comisiones;
    Double salarioFinal;

    comisiones = (primeraVenta*0.1) + (segundaVenta*0.1) + (terceraVenta*0.1);
    salarioFinal = sueldoBase + comisiones;

    System.out.println("Este mes recibirá " + comisiones + "euros en comisiones");
    System.out.println("Su salario final sera de " + salarioFinal + " euros.");


}
   
    
}
