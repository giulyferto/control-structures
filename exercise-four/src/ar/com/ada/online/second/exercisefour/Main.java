package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 4: El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le\n" +
                "permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.\n" +
                "Las tarifas que se tienen son las siguientes:\n" +
                "\na. Las dos primeras horas a $5.00 c/u.\n" +
                "b. Las siguientes tres a $4.00 c/u.\n" +
                "c. Las cinco siguientes a $3.00 c/u.\n" +
                "d. Después de diez horas el costo por cada una es de dos pesos\n");

        //Se definen las variables
        double timeParked, finalCost;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el tiempo que estuvo estacionado: ");
        timeParked = keyboard.nextDouble();

        //Se determina el cobro por el tiempo estacionado
        if (timeParked<=2){
            finalCost = timeParked * 5;
        } else  if (timeParked<=5) {
            finalCost = (timeParked - 2) * 4 + 10;
        } else if (timeParked <=10) {
            finalCost = (timeParked - 5)*3 +20;
        } else {
            finalCost = (timeParked -10)*2 +30;
        }

        //Se imprime el resultado
        System.out.println("Su total es de: $" + finalCost);
    }
}
