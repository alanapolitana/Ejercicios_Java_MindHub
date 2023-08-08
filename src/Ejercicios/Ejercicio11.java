/*11. Crear una función que imprima por consola un pequeño
        menú con las opciones básicas de una calculadora agregando
        la opción 0 para salir del mismo.*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public Ejercicio11() {
    }

    public void mostrarMenuCalculadora() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("********** CALCULADORA **********");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar a función de suma
                    break;
                case 2:
                    // Llamar a función de resta
                    break;
                case 3:
                    // Llamar a función de multiplicación
                    break;
                case 4:
                    // Llamar a función de división
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
