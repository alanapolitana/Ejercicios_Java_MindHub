/*        2. Realizar un pequeño programa que permita ingresar 3 números
        e imprimir por consola cuál es el mayor.*/
package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public Ejercicio2() {
    }

    public void calcularMayor() {
        Scanner scanner = new Scanner(System.in);

        // Leer un número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Encontrar el número mayor
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        // Imprimir el resultado
        System.out.println("El número mayor es: " + mayor);


    }
}
