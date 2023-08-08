/* 5. Realizar un pequeño programa que permita el ingreso de
   números, almacenarlos en una colección hasta ingresar un 0.*/
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public Ejercicio5() {
    }

    public void almacenarNumeros() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> coleccion = new ArrayList<>();
        int valor;

        System.out.println("Ingrese números para almacenar en la colección (0 para salir):");

        do {
            System.out.print("Ingrese un valor: ");
            valor = scanner.nextInt();

            if (valor != 0) {
                coleccion.add(valor);
            }

        } while (valor != 0);

        System.out.println("Números ingresados: " + coleccion.toString());
    }
}
