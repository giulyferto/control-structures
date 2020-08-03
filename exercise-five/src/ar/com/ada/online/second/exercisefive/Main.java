package ar.com.ada.online.second.exercisefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la\n" +
                "persona de menor edad. \n");

        //Se definen las variables
        String firstName, secondName, thirdName;
        int firstAge, secondAge, thirdAge;
        String youngestName;
        int youngerAge;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese nombre y edad: ");
        firstName = keyboard.nextLine();
        firstAge = keyboard.nextInt();

        System.out.print("Ingrese nombre y edad: ");
        secondName = keyboard.nextLine();
        secondAge = keyboard.nextInt();

        System.out.println("Ingrese nombre y edad: ");
        thirdName = keyboard.nextLine();
        thirdAge = keyboard.nextInt();

        //Se determina quien es el mas chico

        if (firstAge > secondAge) {
            youngestName = firstName;
            youngerAge = firstAge;
        } else  if (secondAge > thirdAge) {
            youngestName = secondName;
            youngerAge = secondAge;
        } else {
            youngestName = thirdName;
            youngerAge = thirdAge;
        }

        //Se muestra el resultado
        System.out.println("La persona mas joven es: " + youngestName + " "+ youngerAge);

    }
}
