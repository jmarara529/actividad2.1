import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un año para saber si es o no bisiesto: ");
        int ano = entrada.nextInt();

        entrada.close();

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            System.out.println("el año "+ ano +" es bisiseto");
        } else {
            System.out.println("el año "+ ano +" no es bisiseto");
        }
    }
}
