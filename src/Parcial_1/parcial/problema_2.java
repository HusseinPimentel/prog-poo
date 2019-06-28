package parcial;
import java.util.Scanner;

public class problema_2 {
    Scanner teclado = new Scanner(System.in);
    String Nombre;
    float nota1, nota2, nota3, nota4;
    float promedio;

    public void calificacion () {
        System.out.println("Ingrese el nombre del estudiante: ");
        Nombre = teclado.next();

        System.out.println("Ingrese la Nota1: ");
        nota1 = teclado.nextFloat();

        System.out.println("Ingrese la Nota2: ");
        nota2 = teclado.nextFloat();

        System.out.println("Ingrese la Nota3: ");
        nota3 = teclado.nextFloat();

        System.out.println("Ingrese la Nota4: ");
        nota4 = teclado.nextFloat();


        promedio = (nota1+nota2+nota3+nota4)/4;

       if(promedio >=71){
       System.out.println("El estudiante "+Nombre+ " con promedio de "+promedio+" Aprobo");

    }
       else{
           System.out.println("El estudiante "+Nombre+ " con promedio de "+promedio+" Reprobo");
        }
        }

}
