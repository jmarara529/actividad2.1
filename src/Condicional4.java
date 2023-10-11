import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el numero base: ");
        double num = entrada.nextDouble();

        System.out.println("introduce numero exponente: ");
        double expo = entrada.nextDouble();

        entrada.close();

        if (expo > 0){

            double solu = Math.pow(num,expo);
            System.out.println("resultado: " + solu);

        } else if (expo == 0){

            System.out.println("cualquier numero elevado a 0 da 1.");
            System.out.println("Resultado: 1");

        } else if (expo < 0) {

            double expositivo = Math.abs(expo);
            double solu = 1 / (Math.pow(num,expositivo));
            System.out.println("Resultado: " + solu );

        }

    }

}
