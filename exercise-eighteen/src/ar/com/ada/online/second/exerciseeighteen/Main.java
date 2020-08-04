package ar.com.ada.online.second.exerciseeighteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 18: Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el\n" +
                "diagrama N/S que permitan determinar la cantidad del bono navideño que recibirá un\n" +
                "empleado de una tienda, considerando que si su antigüedad es mayor a cuatro años o\n" +
                "su sueldo es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso\n" +
                "contrario sólo le corresponderá 20 % de éste\n");

        //Se definen las variables
        int seniority;
        double salary;
        double benefit;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese su antiguedad: ");
        seniority = keyboard.nextInt();

        System.out.print("Ingrese su salario: ");
        salary = keyboard.nextDouble();

        //Se determina el valor del bono
        if ((seniority > 4) || (salary <2000)) {
            benefit = salary * 1.25;
        } else {
            benefit = salary * 1.20;
        }

        //Se muestra el resultado
        System.out.println("Su bono navideño sera de $" + benefit);
    }
}
