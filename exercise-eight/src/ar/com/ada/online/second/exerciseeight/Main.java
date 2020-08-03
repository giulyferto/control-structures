package ar.com.ada.online.second.exerciseeight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 8: Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por\n" +
                "su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente forma:\n" +
                "\nCuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;\n" +
                "cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es\n" +
                "menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a\n" +
                "$3500, se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo\n" +
                "correspondiente para calcular los dos tipos de bono, asignando el mayor\n");
        //Se definen las variables
        int seniority;
        double salary;
        double benefit;
        double seniorityBenefit;
        double salaryPlusBenefit;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la antiguedad que tiene en el trabajo: ");
        seniority = keyboard.nextInt();

        System.out.print("Ingrese el monto de su sueldo: ");
        salary = keyboard.nextDouble();

        //Se determina se cuanto va a ser el bono a recibir
        if (salary < 1000) {
            benefit = salary * 0.25;
        } else  if (salary <= 3500) {
            benefit = salary * 0.15;
        } else  {
            benefit = salary * 0.10;
        }

        //Se determina el bono por antiguedad
        if (seniority <2) {
            seniorityBenefit = 0;
        } else  if (seniority <5) {
            seniorityBenefit = salary * 0.20;
        } else {
            seniorityBenefit = salary * 0.30;
        }

        //Se determina cual de los dos bonos es mas grande
        if (benefit > seniorityBenefit) {
            salaryPlusBenefit = salary + benefit;
        } else  {
            salaryPlusBenefit = salary + seniorityBenefit;
        }

        //Se imprime el resultado
        System.out.println("Su sueldo va a ser de: "+ salaryPlusBenefit);
    }
}
