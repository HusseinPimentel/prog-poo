package com.company;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre;
        int year;
        int edad=0;
        System.out.println("Ingrese su Nombre: ");
        System.out.println("Ingrese su Año de Nacimiento: ");
        // Captura de Información
        Nombre = teclado.next();
        year = teclado.nextInt();
        edad = 2019 - year;
        //Impresion
        System.out.println("Su Nombre es: " + Nombre);
        System.out.println("Su Edad es: " + edad);
    }
}
