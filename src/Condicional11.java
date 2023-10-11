import java.util.Scanner;

public class Condicional11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero: ");
        int num = entrada.nextInt();

        entrada.close();

        double par = num % 2;

        if (par == 0) {
            System.out.println("el numero " + num + " es par.");
        } else {
            System.out.println("el numero " + num + " no es par");
        }
    }
}

