package ar.com.ada.online.second.exerciseten;

import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 10: Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para\n" +
                "determinar a qué lugar podrá ir de vacaciones una persona, considerando que la línea de\n" +
                "autobuses “La tortuga” cobra por kilómetro recorrido. Se debe considerar el costo del\n" +
                "pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:\n" +
                "México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe\n" +
                "considerar la posibilidad de tener que quedarse en casa.\n");

        //Se definen las variables
        double travelBudget;
        double kilometerPrice;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su presupuesto para el viaje: ");
        travelBudget = keyboard.nextDouble();

        System.out.print("Ingrese el costo por kilometro: ");
        kilometerPrice = keyboard.nextDouble();

        //Se determina el destino
        if (travelBudget >= (1800 * 2 * kilometerPrice)) {
            System.out.println("Puede ir a Cancun");
        } else if (travelBudget >= (1200 * 2 * kilometerPrice)) {
            System.out.println("Puede ir a Acapulco");
        } else if (travelBudget >= (kilometerPrice * 800 * 2)) {
            System.out.println("Puede ir a Puerto Vallarta");
        } else if (travelBudget >= (750 * 2 * kilometerPrice)) {
            System.out.println("Puede ir a Mexico");
        } else {
            System.out.println("Su presupuesto no es suficiente para realizar el viaje");
        }
    }
}
