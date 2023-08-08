/*8. Crear una función que reciba un número y devuelva si el mismo
        es primo o no.*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public Ejercicio8() {
    }

    public void primo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int valor = scanner.nextInt();
        System.out.println(primo(valor));
    }

    public String primo(int numeroprimo) {
        if (numeroprimo <= 1) {
            return "El numero " + numeroprimo + " no es Primo.";
        }

        for (int i = 2; i <= Math.sqrt(numeroprimo); i++) {
            if (numeroprimo % i == 0) {
                return "El numero " + numeroprimo + " no es Primo.";
            }
        }

        return "El numero " + numeroprimo + " es Primo.";
    }


}

