import java.util.Scanner;

public class Condicional7 {

    public static double AmericaN = 24.00;
    public static double AmericaC = 20.00;
    public static double AmericaS = 21.00;
    public static double Europa = 10.00;
    public static double Asia = 18.00;
    public static void main(String[] args) {

        double peso;
        int opcion = 0;
        double precio = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el peso del paquete(Kg): ");
        peso = entrada.nextDouble();

        if (peso <= 5) {
            System.out.println("intorduce un destinatario\n" +
                    "1.- America del Norte\n" +
                    "2.- America Central\n" +
                    "3.- America del Sur\n" +
                    "4.- Europa\n" +
                    "5.- Asia");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    precio = AmericaN * peso;
                    break;
                case 2:
                    precio = AmericaC * peso;
                    break;
                case 3:
                    precio = AmericaS * peso;
                    break;
                case 4:
                    precio = Europa * peso;
                    break;
                case 5:
                    precio = Asia * peso;
                    break;
                default:
                    System.out.println("La opción introducida no coincide con las opciones especificadas.");
                    System.exit(1);
            }

        } else {

            System.out.println("el peso indicado supera el maximo permitido por politicas de empresa");
            System.exit(0);

        }

        System.out.println("El envío al lugar seleccionado del paquete de " + peso + "Kg costará " + precio + "€");


    }

}
