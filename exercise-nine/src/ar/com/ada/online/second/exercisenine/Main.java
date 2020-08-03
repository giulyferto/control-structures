package ar.com.ada.online.second.exercisenine;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 9: Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y\n" +
                "daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A\n" +
                "ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito\n" +
                "beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia\n" +
                "cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo\n" +
                "10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que\n" +
                "represente el algoritmo para determinar cuánto le cuesta a una persona contratar una\n" +
                "póliza.\n");

        //Se definen las variables
        char coverage;
        double tax;
        double finalPrice;
        String alcohol, glasses, disease, overAge;
        double taxAlcohol, taxGlasses, taxDisease, taxOverAge, taxOtherCase;

        //Se habilita el uso del teclado
        Scanner keyboard = new Scanner(System.in);

        //Se piden los datos del usuario
        System.out.print("Elija el tipo de cobertura \n [A] Cobertura ambplia $1200 \n [B] Daños a terceros $950");
        coverage = keyboard.next().charAt(0);

        System.out.print("Responda si o no: Usted bebe alcohol?: ");
        alcohol = keyboard.nextLine();

        System.out.print("Responda si o no: Usted utiliza lentes?: ");
        glasses = keyboard.nextLine();

        System.out.print("Responda si o no: Usted padece alguna enfermedad?: ");
        disease = keyboard.nextLine();

        System.out.println("Responda si o no: Usted tiene mas de 40 años?: ");
        overAge = keyboard.nextLine();

        //Se define de cuanto va a ser el impuesto
        if (alcohol == "si") {
            taxAlcohol = 0.10;
        }
        if (glasses == "si"){
            taxGlasses = 0.05;
        }
        if ()
    }
}
