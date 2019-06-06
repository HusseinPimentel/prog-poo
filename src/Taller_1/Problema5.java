package com.company;
import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Codigo;
        String Descripcion;
        double costo;
        double porciento=0;
        double total=0;
        System.out.println("Ingrese Codigo: ");
        System.out.println("Ingrese Descripcion: ");
        System.out.println("Ingrese Costo: ");
        // Captura de Información
        Codigo = teclado.next();
        Descripcion = teclado.next();
        costo = teclado.nextInt();
        porciento = costo * 0.30;
        total = costo + porciento;
        //Impresion
        System.out.println("Su Codigo es: " + Codigo);
        System.out.println("Su Descripcion es: " + Descripcion);
        System.out.println("Su Total es: " + total);
    }
}
