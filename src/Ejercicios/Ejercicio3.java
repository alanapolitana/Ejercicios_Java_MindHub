/*
        3. Realizar un pequeño programa que permita el ingreso de un
        número e imprimir por consola su paridad.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public Ejercicio3() {
    }

    public void Paridad(){
        Scanner scanner = new Scanner(System.in);

        // Leer un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Determinar la paridad e imprimir el resultado
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }


    }
}
