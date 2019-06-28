package parcial;
import java.util.Scanner;

public class problema_4 {
    Scanner teclado = new Scanner(System.in);

    String Nombre;
    String Apellido;
    int dias;
    int tipo;
    double pago;
    double descuento;

    public void hotel() {
        System.out.println("Ingrese el Nombre: ");
        Nombre = teclado.next();
        System.out.println("Ingrese el Apellido: ");
        Nombre = teclado.next();
        System.out.println("Ingrese el tipo de habitacion que se hospedo: ");
        tipo = teclado.nextInt();
        System.out.println("Ingrese el numero de dias que se hospedo: ");
        dias = teclado.nextInt();

        switch (tipo) {

            case 1:
                if (dias >5 && dias<=10) {
                    descuento = 120 * 0.10;
                    pago = 120 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                } else if (dias >= 10 && dias<=14) {
                    descuento = 120 * 0.15;
                    pago = 120 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                    else if (dias >= 15) {
                    descuento = 120 * 0.20;
                    pago = 120 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                break;

                case 2:
                if (dias >5 && dias<=10) {
                    descuento = 155 * 0.10;
                    pago = 155 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 10 && dias<=14) {
                    descuento = 155 * 0.15;
                    pago = 155 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 15) {
                    descuento = 155 * 0.20;
                    pago = 155 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                break;

            case 3:
                if (dias >5 && dias<=10) {
                    descuento = 210 * 0.10;
                    pago = 210 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 10 && dias<=14) {
                    descuento = 210 * 0.15;
                    pago = 210 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 15) {
                    descuento = 210 * 0.20;
                    pago = 210 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
               break;

            case 4:
                if (dias >5 && dias<=10) {
                    descuento = 185 * 0.10;
                    pago = 185 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 10 && dias<=14) {
                    descuento = 185 * 0.15;
                    pago = 185 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 15) {
                    descuento = 185 * 0.20;
                    pago = 185 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                break;

            case 5:
                if (dias >5 && dias<=10) {
                    descuento = 400 * 0.10;
                    pago = 400 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 10 && dias<=14) {
                    descuento = 400 * 0.15;
                    pago = 400 - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                else if (dias >= 15) {
                    descuento = 400 * 0.20;
                    pago = 400  - descuento;
                    System.out.println(Nombre + " Su total a pagar por su hospedaje de " + dias + ",en la habitacion tipo " + tipo + " es de " + pago);

                }
                break;
                default: System.out.println("La opcion que escribio es incorrecta");
        }
    }
}