package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Realice un algoritmo para determinar si una persona puede votar con base en su edad\n" +
                "en las próximas elecciones.\n ");

        //Defino las variables
        int personAge;
        String result;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su edad: ");
        personAge = keyboard.nextInt();

        //Se determina si la persona puede o no votar
        if (personAge >= 16) {
            result = "puede votar";
        } else {
            result = "no puede votar";
        }

        //Se muestra el resultado
        System.out.println("Usted " + result);
    }
}
