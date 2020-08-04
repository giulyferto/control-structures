package ar.com.ada.online.second.exercisetwelve;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 12: Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con\n" +
                "base en las horas trabajadas y el pago por hora, considerando que a partir de la hora\n" +
                "número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y\n" +
                "que trabajar más de 50 horas no está permitido\n");

        //Se definen las variables
        double workedHours;
        double hourRate;
        double extraHours;
        double weeklySalary=0;
        double extraHoursWeekly;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de horas trabajadas semanalmente: ");
        workedHours = keyboard.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        hourRate = keyboard.nextDouble();

        //Se calcula el salario semanal si tiene horas extras
        if (workedHours >= 50) {
            System.out.println("No puede trabajar mas de 50 horas, comuniquese con un supervisor");
        } else if (workedHours > 40) {
            extraHours = (workedHours - 40) * 2;
            extraHoursWeekly = extraHours + 40;
            weeklySalary = extraHoursWeekly * hourRate;
        } else {
            weeklySalary = workedHours * hourRate;
        }

        //Se muestra el resultado
        System.out.println("El salario semanal sera de: " + weeklySalary);
    }
}
