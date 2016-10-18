import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
/**
 * Created by 46995932D on 18/10/2016.
 */
public class Ejercicio5 {
    public static void main (String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime tu numero");
        String numeroStr = buffer.readLine();
        int numero= Integer.parseInt(numeroStr);
        boolean numeroprimo = true;

        for (int i= 2 ; i < numero; i++ ){

            if (numero % i==0){

                numeroprimo = false ;
                System.out.println("El numero " + numero + " es multiple de " + i );
            }


        }

        if (numeroprimo){

            System.out.println("El numero " + numero + " es primo");
        }

        else{

            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
