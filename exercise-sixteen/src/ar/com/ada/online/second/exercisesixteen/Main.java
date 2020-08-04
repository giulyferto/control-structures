package ar.com.ada.online.second.exercisesixteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("6. El secretario de educación ha decidido otorgar un bono por desempeño a todos los\n" +
                "profesores con base en la puntuación siguiente:\n" +
                "\n0 - 100 1 salario\n" +
                "101 - 150 2 salarios mínimos\n" +
                "151 - en adelante 3 salarios mínimos\n" +
                "\nRealice un algoritmo que permita determine el monto de bono que percibirá un profesor\n" +
                "(debe capturar el valor del salario mínimo y los puntos del profesor).");

        //Se definen las variables
        int points;
        double salary;
        double benefit;
        double finalSalary;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su puntuacion: ");
        points = keyboard.nextInt();

        /*//Se determina que tipo de bonificacion recibe
        System.out.println("Ingrese el monto de su salario: ");
        salary = keyboard.nextDouble();
*/
        //Se determina que tipo de bonificacion recibe
        if (points < 0) {
            System.out.println("Puntuacion no valida, ingrese otro numero");
        } else if (points<=100){
            System.out.println("Usted recibira el monto equivalente a un salario");
        } else if (points<=150) {
            System.out.println("Usted recibira el monto equivalente a dos salarios minimos");
        } else {
            System.out.println("Usted recibira el monto equivalente a tres salarios minimos");
        }
    }
}
