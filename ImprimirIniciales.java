/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimiriniciales;

/**
 *
 * @author tracher
 */
import java.util.Scanner;

public class ImprimirIniciales {
    public void Iniciales(Scanner scanner, String nombre, String apellido) {
        System.out.println("Sus iniciales son " + nombre.charAt(1) + apellido.charAt(2) + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduzca su apellido: ");
        String apellido = scanner.nextLine();

        ImprimirIniciales letras = new ImprimirIniciales();
        letras.Iniciales(scanner, nombre, apellido);
    }
}






