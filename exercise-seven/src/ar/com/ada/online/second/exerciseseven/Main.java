package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 7: El presidente de la república ha decidido estimular a todos los estudiantes de una\n" +
                "universidad mediante la asignación de becas mensuales, para esto se tomarán en\n" +
                "consideración los siguientes criterios:\n" +
                "\nPara alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de\n" +
                "$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores\n" +
                "de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de\n" +
                "invitación incitándolos a que estudien más en el próximo ciclo escolar.\n" +
                "\nA los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a\n" +
                "9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;\n" +
                "para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará\n" +
                "$100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de\n" +
                "invitación.\n");

        //Se definen las variables
        int studentAge;
        double gpa;
        int scholarship = 0;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su edad: ");
        studentAge = keyboard.nextInt();

        System.out.print("Ingrese su promedio: ");
        gpa = keyboard.nextDouble();

        //Se define cual va a ser la beca

        if (studentAge > 18) {
            if (gpa >= 9) {
                scholarship = 2000;
            } else if (gpa >= 7.5) {
                scholarship = 1000;
            } else if (gpa >= 6) {
                scholarship = 500;
            } else {
                System.out.println("Recibira una carta incentivando a que se estudie mas");
            }
        } else if (gpa >= 9) {
            scholarship = 3000;
        } else if (gpa >= 8) {
            scholarship = 2000;
        } else if (gpa >= 6) {
            scholarship = 100;
        } else {
            System.out.println("Recibira una carta incentivando a que se estudie mas");
        }
        //Se muestra el resultado
        System.out.println("Recibira una beca de: "+ scholarship);
    }
}
