package com.company;
        import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre;
        String Apellido;
        int year;
        int edad=0;
        System.out.println("Ingrese su Nombre: ");
        System.out.println("Ingrese su Apellido: ");
        System.out.println("Ingrese su Año de Nacimiento: ");
        // Captura de Información
        Nombre = teclado.next();
        Apellido = teclado.next();
        year = teclado.nextInt();
        edad = 2019 - year;
        //Impresion
        System.out.println("Su Nombre es: " + Nombre);
        System.out.println("Su Apellido es: " + Apellido);
        System.out.println("Su Edad es: " + edad);
    }
}
