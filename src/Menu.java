import Ejercicios.*;


import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public void opciones() {
        Scanner scanner = new Scanner(System.in);
        byte opcion;


        do{
            System.out.println("**********EJERCICIOS**********");

            System.out.println("1 -Cargar Datos Personales");

            System.out.println("2 -Calcular el numero mayor");

            System.out.println("3 -Par o impar");

            System.out.println("4 -Comparar cadenas de texto");

            System.out.println("5 -Ingreso y almacenamiento de numeros");

            System.out.println("6 -Dar mensaje de bienvenida");

            System.out.println("7 -Dar si es par o impar en cadena de texto");

            System.out.println("8 -Dar si es primo o no");

            System.out.println("9 -Dar la suma de los numeros impares de una coleccion. ");

            System.out.println("10 -Dar la suma de numeros pares y primos");

            System.out.println("11 -Dar menu de calculadora");

            System.out.println("12 -Usar calculadora");

            System.out.println("13 -Gestionar Ingreso a Boliche");



            System.out.println("Ingrese 0 para salir del programa");

            System.out.print("Ingrese una opcion: ");
            opcion=scanner.nextByte();

            switch (opcion){
                case 0:
                    System.out.println("programaFinalizar");
                    break;
                case 1:
             new Ejercicio1().calcular();
                    break;

                case 2:
                    new Ejercicio2().calcularMayor();
                    break;

                case 3:
                    new Ejercicio3().Paridad();
                    break;
                case 4:
                    new Ejercicio4().compararCadena();
                    break;
                case 5:
                    new Ejercicio5().almacenarNumeros();
                    break;
                case 6:
                    new Ejercicio6().welcome();
                    break;
                case 7:
                    new Ejercicio7().paridadString();
                    break;
                case 8:
                    new Ejercicio8().primo();
                    break;
                case 9:
                    new Ejercicio9().sumaImpares();
                    break;

                case 10:
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.imprimirParesYSumaPrimos();
                    break;


                case 11:
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.mostrarMenuCalculadora();
                    break;
                case 12:
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.calculadoraConSwitch();
                    break;

                case 13:
                    gestionarIngresoBoliche();
                    break;
                default:
                    System.out.println("Usted ingreso una opcion incorrecta- Seleccione una opcion correcta");
                    break;
            }

        }
        while (opcion!=0);
    }

    public void gestionarIngresoBoliche() {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        ejercicio13.gestionarIngresoBoliche();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.opciones();
    }
}
