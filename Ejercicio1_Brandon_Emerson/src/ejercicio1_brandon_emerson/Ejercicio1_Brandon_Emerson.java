/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_brandon_emerson;

/**
 *
 * @author brand
 */
import java.util.Scanner;

public class Ejercicio1_Brandon_Emerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        String nombreCompleto = nombre + " " + apellidoPaterno + " " + apellidoMaterno;

        System.out.println(nombreCompleto);

        scanner.close();
    }
}
