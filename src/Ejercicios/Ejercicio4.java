/*
4. Crear el código correspondiente que permita ingresar 2 cadenas
   de caracteres e imprima por consola si son iguales o no.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio4{

    public Ejercicio4() {
    }
    public void compararCadena(){
        Scanner scanner = new Scanner(System.in);

        String cadena1, cadena2;
        System.out.print("Ingrese la cadena de texto 1 : ");
        cadena1 = scanner.next();
        System.out.print("Ingrese la cadena de texto 2 : ");
        cadena2 = scanner.next();

        if (cadena1.equals(cadena2) ){
            System.out.println("Cadenas son iguales");
        }
        else {
            System.out.println("Cadenas no son iguales");
        }
    }

}
