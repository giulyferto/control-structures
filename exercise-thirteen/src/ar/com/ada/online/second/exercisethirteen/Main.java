package ar.com.ada.online.second.exercisethirteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 13: Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren\n" +
                "determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son\n" +
                "las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,\n" +
                "$35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno. Realice el\n" +
                "algoritmo para determinar el costo del pasaje de cada alumno\n");

        //Se definen las variables
        int amountStudents;
        double ticketPrice;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese la cantidad de estudiantes: ");
        amountStudents = keyboard.nextInt();

        //Se define el pasaje del boleto
        if (amountStudents>100) {
            ticketPrice = 20;
        } else if (amountStudents>=50){
            ticketPrice = 35;
        } else if (amountStudents>=20) {
            ticketPrice = 40;
        } else  {
            ticketPrice = 70;
        }
        //Se define el precio del pasaje por estudiante
        System.out.println("El precio del pasaje por estudiante va a ser de $" + ticketPrice);
    }
}
