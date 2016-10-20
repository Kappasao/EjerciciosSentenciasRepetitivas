import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;
import java.io.*;

/**
 * Created by 46995932d on 20/10/2016.
 */
public class Ejercicio9 {
    public static void main (String[] args) throws IOException {

        int numero = 0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("introduce un numero");
        numero = scanner.nextInt();

        int max = numero;
        int minimo = numero;
        int total = 0;
        int contador = 0;



        while (true){


            if (numero==999){
                break;
            }

            total = total + numero;
            contador++;

            if (numero > max){
                max = numero;

            }

            if (numero < minimo){

                minimo = numero;

            }
            System.out.println("introduce un numero");
            numero = scanner.nextInt();
        }
        double media = total /contador;

        System.out.println("el numero maximo es " +max);
        System.out.println("El numero minimo es " +minimo);
        System.out.println("La media sera de " + media);

    }


}
