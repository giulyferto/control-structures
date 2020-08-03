package ar.com.ada.online.second.exercisefifteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 15: Realice un algoritmo que, con base en un número proporcionado (1-7), indique el día de\n" +
                "la semana que le corresponde (L-D). Represente el diagrama de flujo y el pseudocódigo\n" +
                "correspondiente.\n");

        //Se definen las variables
        int dayOfTheWeek;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese un numero del 1 al 7: ");
        dayOfTheWeek = keyboard.nextInt();

        //Se define cual dia de la semana es dependiendo del numero
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
        }


    }
}
