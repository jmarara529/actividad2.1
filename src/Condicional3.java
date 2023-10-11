import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero:");
        float num1 = entrada.nextFloat();

        System.out.println("introduce otro numero:");
        float num2 = entrada.nextFloat();

        entrada.close();

        if (num2 != 0){
            float resultado = num1 / num2;
            System.out.println(num1 + " / " + num2 + "= " + resultado);
        } else {
            System.out.println("como quieres repartir "+ num1 +" galleta/s entre 0 amigos, no se puede.");
        }

    }

}
