import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el numero de alumnos:");
        int alumnos = entrada.nextInt();

        entrada.close();

        int precio = 0;
        int precioalumno = 0;

        if (alumnos >= 100){
            precioalumno = 65;
            precio = alumnos * precioalumno;
        } else if (alumnos >= 50 && alumnos <= 99) {
            precioalumno = 70;
            precio = alumnos * precioalumno ;
        } else if (alumnos >= 30 && alumnos <= 49) {
            precioalumno = 95;
            precio = alumnos * precioalumno;
        } else if (alumnos < 30 && alumnos > 0) {
            precio = 400;
            precioalumno = precio / alumnos;
        } else if (alumnos <= 0) {
            System.out.println("no es logico que se vallan de excursion menos de una persona");
        }

        System.out.println("el precio a pagar a la compañia es de: " + precio);
        System.out.println("el precio a pagar por alumno es de: "+ precioalumno);

    }

}
