/*13. Crear el algoritmo necesario para poder gestionar el ingreso
        a un boliche. El mismo deberá contar con un pequeño menú con
        las siguientes opciones:
        ● Ingreso de datos.
        ● Capacidad disponible.
        ● Dinero recaudado.
        ● Salir del sistema.
        Crear las variables correspondientes para controlar la capacidad
        y el dinero recaudado. Siendo la capacidad máxima de 500
        personas y la entrada costar 1500 por persona y 2000 la
        entrada vip. La primera opción del menú deberá tomar los datos
        personales del ingresante (nombre, edad, DNI y pase). El
        algoritmo deberá detectar si la persona está apta para el
        ingreso, ya que solo se dejará pasar a los mayores de 21 años.
        Verificar antes de cobrar la entrada si posee pase vip con el cual
        ingresará gratis o si posee pase con descuento el cual le
        permitirá solo abonar la mitad del valor de la entrada. Al
        momento de hacer el cobro se deberá preguntar si quiere
        comprar la entrada normal o vip y finalmente darle la bienvenida
        en caso de que todo haya salido bien, volviendo al menú
        principal. Las variables correspondientes tendrán que reflejar el
        ingreso tanto de personas como de dinero*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public Ejercicio13() {
    }

    public void gestionarIngresoBoliche() {
        Scanner scanner = new Scanner(System.in);
        int capacidadMaxima = 500;
        int capacidadActual = 0;
        int dineroRecaudado = 0;

        int opcion;
        do {
            System.out.println("********** GESTIÓN DE BOLICHE **********");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("4. Salir del sistema");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingreso de datos:");
                    System.out.print("Nombre: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("DNI: ");
                    int dni = scanner.nextInt();
                    System.out.print("Pase (1: Normal, 2: VIP, 3: Descuento): ");
                    int pase = scanner.nextInt();

                    if (edad >= 21) {
                        int costoEntrada = 0;
                        if (pase == 1) {
                            costoEntrada = 1500;
                        } else if (pase == 2) {
                            costoEntrada = 2000;
                        } else if (pase == 3) {
                            costoEntrada = 750; // Descuento del 50%
                        }

                        System.out.println("Monto a pagar: " + costoEntrada);
                        System.out.print("¿Desea confirmar? (1: Sí, 2: No): ");
                        int confirmar = scanner.nextInt();
                        if (confirmar == 1) {
                            if (capacidadActual < capacidadMaxima) {
                                capacidadActual++;
                                dineroRecaudado += costoEntrada;
                                System.out.println("¡Bienvenido(a) " + nombre + "!");
                            } else {
                                System.out.println("Lo sentimos, el boliche está lleno.");
                            }
                        }
                    } else {
                        System.out.println("Lo sentimos, solo se permite el ingreso a mayores de 21 años.");
                    }
                    break;

                case 2:
                    System.out.println("Capacidad disponible: " + (capacidadMaxima - capacidadActual));
                    break;

                case 3:
                    System.out.println("Dinero recaudado: $" + dineroRecaudado);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        ejercicio13.gestionarIngresoBoliche();
    }
}
