package ar.com.ada.online.second.exercisefourteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 14: Realice un algoritmo que, con base en una calificación proporcionada (0-10), indique con\n" +
                "letra la calificación que le corresponde: 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5\n" +
                "a 0 son “F”. Represente el diagrama de flujo y el pseudocódigo.\n");

        //Se definen las variables
        int grade;
        char letter;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese una calificacion del 1 al 10: ");
        grade = keyboard.nextInt();

        //Se define cual es la letra de la calificacion
        switch (grade) {
            case 0:
                System.out.println("F");
                break;
            case 1:
                System.out.println("F");
                break;
            case 2:
                System.out.println("F");
                break;
            case 3:
                System.out.println("F");
                break;
            case 4:
                System.out.println("F");
                break;
            case 5:
                System.out.println("F");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("D");
                break;
            case 8:
                System.out.println("C");
                break;
            case 9:
                System.out.println("B");
                break;
            case 10:
                System.out.println("A");
                break;
            default:
                System.out.println("Numero no valido, ingrese otro numero");


        }
    }
}
