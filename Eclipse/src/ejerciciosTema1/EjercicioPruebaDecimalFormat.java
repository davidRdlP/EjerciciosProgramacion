/*En el método main de una clase Java llamada Division escribe un programa
que muestre en la consola la división de 1234 entre 532 siendo ambos números
reales. El formato de salida será un número que ocupará un mínimo de 15
caracteres en pantalla, de los cuales dos se utilizarán para la parte decimal.*/


package ejerciciosTema1;
import java.text.DecimalFormat;
public class EjercicioPruebaDecimalFormat {

	public static void main(String[] args) {
		double numero1 = 2.268;
		double numero2 = 4.51654;
		double resultado;

		DecimalFormat df = new DecimalFormat("#.00");

	
		resultado = numero1*numero2;

		System.out.println(df.format(resultado));

	
		System.out.printf("resultado: %.15f", resultado);
		

	}

}
