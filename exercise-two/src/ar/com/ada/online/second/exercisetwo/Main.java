package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 2: Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en\n" +
                "las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada\n" +
                "hora se considera como excedente y se paga el doble.\n ");

        //Se definen las variables
        double workedHours;
        double hourRate;
        double extraHours;
        double weeklySalary;
        double extraHoursWeekly;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de horas trabajadas semanalmente: ");
        workedHours = keyboard.nextDouble();

        System.out.print("Ingrese el pago por hora: ");
        hourRate = keyboard.nextDouble();

        //Se calcula el salario semanal si tiene horas extras
        if (workedHours > 40) {
            extraHours = (workedHours - 40) * 2;
            extraHoursWeekly = extraHours + workedHours;
            weeklySalary = extraHoursWeekly * hourRate;
        } else {
            weeklySalary = workedHours * hourRate;
        }

        //Se muestra el resultado
        System.out.println("El salario semanal sera de: "+ weeklySalary);




    }
}
