/*
12. Crear otra función que ocupe la del punto anterior para poder
        crear una pequeña calculadora usando switch. Tener en cuenta
        el caso de la división por 0.
*/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public Ejercicio12() {
    }

    public void calculadoraConSwitch() {
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
                    realizarOperacion("+");
                    break;
                case 2:
                    realizarOperacion("-");
                    break;
                case 3:
                    realizarOperacion("*");
                    break;
                case 4:
                    realizarOperacion("/");
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private void realizarOperacion(String operador) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0;

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por 0.");
                    return;
                }
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}
