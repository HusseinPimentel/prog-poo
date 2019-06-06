package com.company;
import java.util.Scanner;

public class Problema6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre;
        double tiempo1, tiempo2, tiempo3, tiempo4, tiempo5;
        double total=0;
        double promedio=0;
        System.out.println("Ingrese Nombre: ");
        System.out.println("Ingrese Tiempo1: ");
        System.out.println("Ingrese Tiempo2: ");
        System.out.println("Ingrese Tiempo3: ");
        System.out.println("Ingrese Tiempo4: ");
        System.out.println("Ingrese Tiempo5: ");
        // Captura de Información
        Nombre = teclado.next();
        tiempo1 = teclado.nextDouble();
        tiempo2 = teclado.nextDouble();
        tiempo3 = teclado.nextDouble();
        tiempo4 = teclado.nextDouble();
        tiempo5 = teclado.nextDouble();
        total = tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5;
        promedio = total / 5;
        //Impresion
        System.out.println("Su Nombre es: " + Nombre);
        System.out.println("Su Tiempo promedio es: " + promedio);
    }
}
