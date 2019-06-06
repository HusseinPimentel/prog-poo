package com.company;
import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Nombre;
        double compra;
        double porciento=0;
        double total=0;
        System.out.println("Ingrese su Nombre: ");
        System.out.println("Ingrese su Compra: ");
        // Captura de Información
        Nombre = teclado.next();
        compra = teclado.nextInt();
        porciento = compra * 0.07;
        total = compra + porciento;
        //Impresion
        System.out.println("Su Nombre es: " + Nombre);
        System.out.println("Su Total es: " + total);
    }
}
