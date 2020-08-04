package ar.com.ada.online.second.exerciseeleven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 11: Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se\n" +
                "les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que\n" +
                "tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el\n" +
                "diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un trabajador\n");

        //Se definen las variables
        int seniority;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //se piden los datos del usuario
        System.out.print("Ingrese su antiguedad: ");
        seniority = keyboard.nextInt();

        //Se determina el valor del bono
        switch (seniority) {
            case 1:
                System.out.println("Usted recibira un bono de $100");
                break;
            case 2:
                System.out.println("Usted recibira un bono de $200");
                break;
            case 3:
                System.out.println("Usted recibira un bono de $300");
                break;
            case 4:
                System.out.println("Usted recibira un bono de $400");
                break;
            case 5:
                System.out.println("Usted recibira un bono de $500");
                break;
            default:
                System.out.println("Usted recibira un bono de $1000");
        }
    }
}
