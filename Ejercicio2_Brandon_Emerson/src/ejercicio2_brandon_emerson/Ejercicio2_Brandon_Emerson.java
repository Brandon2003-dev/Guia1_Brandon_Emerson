/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_brandon_emerson;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class Ejercicio2_Brandon_Emerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer valor: ");
        double valor3 = scanner.nextDouble();

        double suma = valor1 + valor2 + valor3;
        double resta = valor1 - valor2 - valor3;
        double multiplicacion = valor1 * valor2 * valor3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}

