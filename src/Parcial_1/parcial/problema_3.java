package parcial;
import java.util.Scanner;

public class problema_3 {
    Scanner teclado = new Scanner(System.in);
    double precio = 100;
    double total;
    double porcentaje;
    int cantidad;

    public void trajes() {
        System.out.println("Cuantos trajes desea llevar: ");
        cantidad = teclado.nextInt();

        if (cantidad == 1) {
            porcentaje = precio * 0.50;
            total = precio - porcentaje;
            System.out.println("Por la compra de " + cantidad + " trajes su descuento es de 50% y su total a pagar seria de " + total);
        } else if (cantidad == 2) {
            porcentaje = precio * 0.55;
            total = precio - porcentaje;
            System.out.println("Por la compra de " + cantidad + " trajes su descuento es de 55% y su total a pagar seria de " + total);
        }
        else if (cantidad == 3) {
            porcentaje = precio * 0.65;
            total = precio - porcentaje;
            System.out.println("Por la compra de " + cantidad + " trajes su descuento es de 65% y su total a pagar seria de " + total);
        }


    }
}