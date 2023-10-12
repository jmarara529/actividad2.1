import java.util.Scanner;

public class Condicional6 {

    public static void main(String[] args) {
        int minutos;
        char diasem;
        char turno;
        double impuesto = 0;
        double precio = 0;
        double preciominuto;
        double preciofinal = 0;

        Scanner entra = new Scanner(System.in);

        System.out.println("introduce la duración de la llamada en minutos: ");
        minutos = entra.nextInt();

        System.out.println("introduce la inicial del dia de la semana");
        diasem = entra.next().charAt(0);


        if (minutos > 10 ){
            precio = 0.50;
        } else if (minutos > 8) {
            precio = 0.70;
        } else if (minutos > 5) {
            precio = 0.80;
        } else if (minutos > 0) {
            precio = 1;
        } else if (minutos <= 0) {
            System.out.println("error al introducir el tiempo de llamada.\nreinicie el programa e introduzca los datos correctamente");
            System.exit(1);
        }

        preciominuto = precio * minutos;

        //establece el impuesto por la llamada
        if (diasem == 'd' || diasem == 'D'){

            impuesto = preciominuto * 0.03;

        }else {

            System.out.println("introduce el turno, mañana (m) o tarde (t): ");
            turno = entra.next().charAt(0);

            if (turno == 'm' || turno == 'M') {

                impuesto =  preciominuto * 0.15;

            } else if (turno == 't' || turno == 'T') {

                impuesto = preciominuto * 0.10;

            } else {
                System.out.println("error al introducir los datos.\nreinicie el programa e introduzca los datos correctamente");
                System.exit(1);
            }
        }

        preciofinal = preciominuto + impuesto;

        System.out.println("por " + minutos + " minutos de llamada se aplica un precio de " + precio + " por minuto." +
                "\n\nprecio sin IVA= " + preciominuto +
                "\n\nimpuesto aplicable " + impuesto +
                "\n\nprecio con IVA= " + preciofinal);

    }

}
