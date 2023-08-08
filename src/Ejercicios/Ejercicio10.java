/*
10. Crear una función que reciba una colección de números e
        imprima los números pares y la suma de los números primos.
*/
package Ejercicios;

import java.util.ArrayList;

public class Ejercicio10 {

    public Ejercicio10() {
    }

    public void imprimirParesYSumaPrimos() {
        ArrayList<Integer> coleccionNumeros = new ArrayList<>();
        coleccionNumeros.add(7);
        coleccionNumeros.add(1);
        coleccionNumeros.add(18);
        coleccionNumeros.add(7);
        coleccionNumeros.add(2);
        coleccionNumeros.add(5);
        coleccionNumeros.add(3);

        imprimirPares(coleccionNumeros);
        int sumaPrimos = sumaPrimos(coleccionNumeros);
        System.out.println("La suma de los números primos es: " + sumaPrimos);
    }

    public static void imprimirPares(ArrayList<Integer> numeros) {
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumaPrimos(ArrayList<Integer> numeros) {
        int total = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                total += numero;
            }
        }
        return total;
    }
}
