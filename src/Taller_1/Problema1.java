package Taller_1;
import java.util.Scanner;

public class Problema1 {
        String nombre;

        Scanner teclado = new Scanner(System.in);

        public void  mostrar()    {
        System.out.println("Bienvenido a mi Taller#1");
        System.out.print("Ingrese su Nombre: ");

        // Captura de Información
        nombre = teclado.next();

        System.out.println("Su Nombre es: " + nombre);
    }
}
