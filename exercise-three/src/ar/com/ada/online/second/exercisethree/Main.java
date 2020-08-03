package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3: El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia\n" +
                "en ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que\n" +
                "tiene son las siguientes:\n" +
                "\nTarjeta $10.00 o menos\n" +
                "Chocolates $11.00 a $100.00\n" +
                "Flores $101.00 a $250.00\n" +
                "Anillo Más de $251.00\n");

        //Se definen las variables
        double budget;
        String present;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el monto que quiere gastar: ");
        budget = keyboard.nextDouble();

        //Se define que regalo se puede comprar
        if (budget <= 10){
            present = " una tarjeta";
        } else if (budget <=100){
            present = "chocolate";
        } else if (budget<=250) {
            present = "flores";
        } else {
            present = "un anillo";
        }

        //Se lee el resultado
        System.out.println("Con ese dinero puede comprar " + present);
    }
}
