package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 6: Realice el diagrama de flujo y el pseudocódigo que muestren el algoritmo para\n" +
                "determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es\n" +
                "mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100\n" +
                "pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%\n");

        //Se definen las variables
        double productCost,discount, priceDiscounted;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el costo del producto: ");
        productCost = keyboard.nextDouble();

        //Se determina cual va a ser el descuento
        if (productCost>=200) {
            discount = productCost * 0.15;
        } else if (productCost >=100) {
            discount = productCost * 0.12;
        } else {
            discount = productCost *0.10;
        }

        //Se le resta el descuento al precio del producto
        priceDiscounted = productCost - discount;

        //Se muestra el resultado
        System.out.println("El precio final del producto es de: $" + priceDiscounted + " con un descuento de: $" + discount);
    }
}
