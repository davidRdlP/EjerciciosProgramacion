/* En el método main de una clase Java llamada Calificaciones escribe un
programa que resuelva el problema siguiente: un estudiante desea saber cuál
será su promedio general en las tres materias que cursa y cuál será el promedio
que obtendrá en cada una de ellas. Los criterios de calificación se establecen en
la tabla siguiente: 
Matematicas: Ex90 TA10 x3TA
Fisica: Ex80 TA20 x2TA
Quimica: Ex85 TA 15% x3 TA
Los datos de entrada (calificación del examen y calificaciones de cada una de
las tareas realizadas) se introducirán por teclado y los datos de salida (los
promedios de cada asignatura y el promedio de las tres) se mostrarán en la
consola con una precisión de dos decimales. Resolver el problema sin utilizar la
clase Scanner.
*/


package ejerciciosTema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ejercicio4 { public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("#.00");

    //Matematicas Matematicas: Ex90 TA10 x3TA
    System.out.print("Bienvenido a la calculadora del promedio general. Escriba su nota en el examen de matemáticas: ");
    String examenMatematicas = reader.readLine();
    System.out.print("Escriba su nota en la tarea 1 de matemáticas: ");
    String tarea1Matematicas = reader.readLine();
    System.out.print("Escriba su nota en la tarea 2 de matemáticas: ");
    String tarea2Matematicas = reader.readLine();
    System.out.print("Escriba su nota en la tarea 3 de matemáticas: ");
    String tarea3Matematicas = reader.readLine();

    double examenMatematicasDouble = Double.parseDouble(examenMatematicas);
    double tarea1MatematicasDouble = Double.parseDouble(tarea1Matematicas);
    double tarea2MatematicasDouble = Double.parseDouble(tarea2Matematicas);
    double tarea3MatematicasDouble = Double.parseDouble(tarea3Matematicas);


    double promedioMatematicas;

    promedioMatematicas = (examenMatematicasDouble*0.9)+(((tarea1MatematicasDouble+tarea2MatematicasDouble+tarea3MatematicasDouble)/3)*0.1);

    System.out.println("Su promedio en matematicas es: " + df.format(promedioMatematicas));

    //(examen*0.9)+(((TA1+TA2+TA3)/3)*0.10)  tareas= TA1 + TA2 + TA3
    
    
    //Fisica: Ex80 TA20 x2TA

    System.out.print("Escriba su nota en el examen de física: ");
    String examenFisica = reader.readLine();
    System.out.print("Escriba su nota en la tarea 1 de fisica: ");
    String tarea1Fisica = reader.readLine();
    System.out.print("Escriba su nota en la tarea 2 de fisica: ");
    String tarea2Fisica = reader.readLine();
    

    double examenFisicaDouble = Double.parseDouble(examenFisica);
    double tarea1FisicaDouble = Double.parseDouble(tarea1Fisica);
    double tarea2FisicaDouble = Double.parseDouble(tarea2Fisica);
    
    double promedioFisica;

    promedioFisica = (examenFisicaDouble*0.8)+(((tarea1FisicaDouble+tarea2FisicaDouble)/2)*0.2);

    System.out.println("Su promedio en física es: " + df.format(promedioFisica));
    //Quimica: Ex85 TA 15% x3 TA

    System.out.print("Escriba su nota en el examen de química: ");
    String examenQuimica = reader.readLine();
    System.out.print("Escriba su nota en la tarea 1 de química: ");
    String tarea1Quimica = reader.readLine();
    System.out.print("Escriba su nota en la tarea 2 de química: ");
    String tarea2Quimica = reader.readLine();
    System.out.print("Escriba su nota en la tarea 3 de química: ");
    String tarea3Quimica = reader.readLine();

    double examenQuimicaDouble = Double.parseDouble(examenQuimica);
    double tarea1QuimicaDouble = Double.parseDouble(tarea1Quimica);
    double tarea2QuimicaDouble = Double.parseDouble(tarea2Quimica);
    double tarea3QuimicaDouble = Double.parseDouble(tarea3Quimica);


    double promedioQuimica;

    promedioQuimica = (examenQuimicaDouble*0.85)+(((tarea1QuimicaDouble+tarea2QuimicaDouble+tarea3QuimicaDouble)/3)*0.15);

    System.out.println("Su promedio en Quimica es: " + df.format(promedioQuimica));

    double promedioGeneral;
    promedioGeneral = (promedioMatematicas+promedioFisica+promedioQuimica)/3;
    System.out.println("Su promedio general es: "+ df.format(promedioGeneral));

    



    
}
    
}
