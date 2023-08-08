/*     7. Crear una función que reciba un número entero y devuelva si es
        par o impar en forma de texto.*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio7{

    public Ejercicio7() {
    }

    public void paridadString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();

        System.out.println(paridadStrings(valor));
    }
    public static String paridadStrings(int valor) {
        if (valor % 2 == 0) {
            return "El numero " + valor + " es un numero PAR.";
        } else {
            return "El numero " + valor + " es un numero IMPAR.";
        }
    }
}
