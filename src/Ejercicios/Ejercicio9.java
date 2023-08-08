/*9. Crear una función que reciba una colección de números y
        devuelva la suma de los números impares.*/
package Ejercicios;

import java.util.ArrayList;

public class Ejercicio9 {

    public Ejercicio9() {
    }

    public void sumaImpares() {
        ArrayList<Integer> coleccionNumeros = new ArrayList<>();
        coleccionNumeros.add(7);
        coleccionNumeros.add(1);
        coleccionNumeros.add(18);
        coleccionNumeros.add(7);
        coleccionNumeros.add(2);
        coleccionNumeros.add(5);
        coleccionNumeros.add(3);

        int resultado = suma(coleccionNumeros);
        System.out.println("La suma de los números impares es: " + resultado);
    }

    public static int suma(ArrayList<Integer> numeros) {
        int total = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                total += numero;
            }
        }
        return total;
    }
}
