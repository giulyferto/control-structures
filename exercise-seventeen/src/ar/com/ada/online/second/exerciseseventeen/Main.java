package ar.com.ada.online.second.exerciseseventeen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Ejercicio 17: Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el\n" +
                "diagrama N/S que permitan determinar qué paquete se puede comprar una persona con\n" +
                "el dinero que recibirá en diciembre, considerando lo siguiente:\n" +
                "\n a. Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular, tres\n" +
                "pares de zapatos, cinco camisas y cinco pantalones.\n" +
                "\nb. Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se\n" +
                "comprará una grabadora, tres pares de zapatos, cinco camisas y cinco\n" +
                "pantalones.\n" +
                "\nc. Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se\n" +
                "comprará dos pares de zapatos, tres camisas y tres pantalones.\n" +
                "\nd. Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de\n" +
                "zapatos, dos camisas y dos pantalones\n");
        //Se definen las variables
        double money;
        String present;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Ingrese el monto de dinero recibido en diciembre: ");
        money = keyboard.nextDouble();

        //Se determina cual paquete se puede comprar
        if (money>=50000) {
            present = "paquete A";
        } else if (money>=20000) {
            present = "paquete B";
        } else  if (money >= 10000){
            present = "paquete C";
        } else {
            present = "paquete D";
        }

        //Se muestra el resultado
        System.out.println("Con el monto ingresado se puede comprar el " + present);
    }
}
