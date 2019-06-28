package parcial;

import java.util.Scanner;

public class problema_1 {

        Scanner teclado = new Scanner(System.in);

        float ancho;
        float largo;
        double precio=2.50;
        double metro;
        double costo;


        public void metro () {
            System.out.println("Ingrese el ancho");
            ancho = teclado.nextFloat();

            System.out.println("Ingrese el largo");
            largo = teclado.nextFloat();

            metro = ancho * largo;
            costo = metro * precio;

            System.out.println("el total es de:  " +metro+ "y su costo total seria de  "+costo);

        }

    }


