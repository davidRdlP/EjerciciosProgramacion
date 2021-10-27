/*En el método main de una clase Java llamada Division escribe un programa
que muestre en la consola la división de 1234 entre 532 siendo ambos números
reales. El formato de salida será un número que ocupará un mínimo de 15
caracteres en pantalla, de los cuales dos se utilizarán para la parte decimal.*/


package ejerciciosTema1;


public class Ejercicio1 {
    public static void main(String[] args) {
        double numero1 = 1234;
        double numero2 = 532;
        double resultado;
        resultado = numero1/numero2;

        System.out.println(resultado);  //Si pones esto detras del printf no funciona bien
        
        System.out.printf("Resultado: %.2f", resultado);

        
    }
    
}
