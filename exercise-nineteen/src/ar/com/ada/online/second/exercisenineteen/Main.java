package ar.com.ada.online.second.exercisenineteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" La secretaria de salud requiere un diagrama de flujo que le represente el algoritmo que\n" +
                "permita determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona,\n" +
                "considerando que si es mayor de 70 años, sin importar el sexo, se le aplica la tipo C; si\n" +
                "tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si es hombre, la A; si es menor de\n" +
                "16 años, se le aplica la tipo A, sin importar el sexo\n");

        //Se definen las variables
        int age;
        char vaccineType;
        char gender;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su edad: ");
        age = keyboard.nextInt();

        System.out.print("Ingrese su genero (M o F): ");
        gender = keyboard.next().charAt(0);

        //Se determina el tipo de vacuna
        if (age > 70) {
            vaccineType = 'C';
        } else if (age >= 16) {
            if (gender == 'F') {
                vaccineType = 'B';
            } else {
                vaccineType = 'A';
            }
        } else {
            vaccineType = 'A';
        }

        //Se lee el resultado
        System.out.println("Se debe aplicar la vacuna de tipo " + vaccineType);
    }
}
