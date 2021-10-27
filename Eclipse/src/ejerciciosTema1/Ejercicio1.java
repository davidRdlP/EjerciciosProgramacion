package ejerciciosTema1;
import java.text.DecimalFormat;
public class Ejercicio1 {

	public static void main(String[] args) {
		double numero1 = 2.268;
		double numero2 = 4.51654;
		double resultado;

		DecimalFormat df = new DecimalFormat("#.00");

		resultado = numero1*numero2;
		System.out.println(df.format(resultado));

		

	}

}
