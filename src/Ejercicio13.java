import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 46995932D on 03/11/2016.
 */
public class Ejercicio13 {
    public static void main(String[] args) throws IOException {

        int numero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        numero = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;

        while (true) {


            if (numero == 0) {
                break;
            }


            if (numero > 0) {
                positivos++;

            }

            if (numero < 0) {

                negativos++;

            }
            System.out.println("introduce un numero");
            numero = scanner.nextInt();
        }

        System.out.println("Hay " + positivos + " numeros positivos");
        System.out.println("hay " + negativos + " numeros negativos");
    }
}
