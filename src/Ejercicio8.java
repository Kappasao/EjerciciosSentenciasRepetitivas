import java.io.*;

/**
 * Created by 46995932d on 20/10/2016.
 */
public class Ejercicio8 {
    public static void main (String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime tu numero");
        String numeroStr = buffer.readLine();
        int numero = Integer.parseInt(numeroStr);
        boolean numerosimpar = true;

        for (int i=0 ; i <= numero; i++ ){

            if (i % 2==0){



            }

            else if ( i % 2 != 0){

                numerosimpar = false;

                System.out.println("El numero "+ i +" es impar");
            }


        }






    }

}
