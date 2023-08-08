  /* 1. Crear las variables correspondientes para leer tu nombre,
        apellido y edad e imprimirlos por consola en una oración.*/

package Ejercicios;

import java.util.Scanner;

  public class Ejercicio1 {
      public Ejercicio1() {
      }

      public void calcular(){
          Scanner scanner = new Scanner(System.in);

          // Leer nombre
          System.out.print("Ingresa tu nombre: ");
          String nombre = scanner.next();

          // Leer apellido
          System.out.print("Ingresa tu apellido: ");
          String apellido = scanner.next();

          // Leer edad
          System.out.print("Ingresa tu edad: ");
          int edad = scanner.nextInt();


          // Imprimir los datos en una oración
          System.out.println("Hola, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años.");


      }
  }
