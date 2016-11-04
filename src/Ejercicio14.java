import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 46995932D on 03/11/2016.
 */
public class Ejercicio14 {
    public static void main(String[] args) throws IOException {

        int numero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        numero = scanner.nextInt();

        int positivos = 0;
        int contador = 0;
        int total = 0 ;


        while (true) {


            if (numero < 0) {
                break;
            }

            total = total + numero;
            contador++;


            if (numero >= 0) {
                positivos++;

            }
            System.out.println("introduce un numero");
            numero = scanner.nextInt();

        }
        double media = total / contador;
        System.out.println("La media de los numeros es " + media + " .");

    }

}

