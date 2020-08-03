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
        int youngestAge;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese nombre y edad: ");
        firstName = keyboard.nextLine();
        firstAge = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Ingrese nombre y edad: ");
        secondName = keyboard.nextLine();
        secondAge = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Ingrese nombre y edad: ");
        thirdName = keyboard.nextLine();
        thirdAge = keyboard.nextInt();
        keyboard.nextLine();

        //Se determina quien es el mas chico

        if (firstAge < secondAge) {
            if (firstAge < thirdAge) {
                youngestName = firstName;
                youngestAge = firstAge;
            } else {
                youngestName = thirdName;
                youngestAge = thirdAge;
            }
        } else if (secondAge < thirdAge) {
            youngestName = secondName;
            youngestAge = secondAge;
        } else {
            youngestName = thirdName;
            youngestAge = thirdAge;
        }

        //Se muestra el resultado
        System.out.println("La persona mas joven es: " + youngestName + " " + youngestAge);

    }
}
