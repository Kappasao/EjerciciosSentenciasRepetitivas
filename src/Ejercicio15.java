import java.io.IOException;
import java.util.Scanner;
/**
 * Created by 46995932d on 04/11/2016.
 */
public class Ejercicio15 {
    public static void main(String[] args){

        int numero = 0 ;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Dime un numero entre 0 y 99999");
        numero = scanner.nextInt();
        while (true){

            if (numero >=10000){

                System.out.println("El numero tiene 5 cifras");
                break;
            }
            if (numero >=1000){

                System.out.println("El numero tiene 4 cifras");
                break;
            }
            if (numero >=100){

                System.out.println("El numero tiene 3 cifras");
                break;
            }
            if (numero >=10){

                System.out.println("El numero tiene 2 cifras");
                break;
            }
            if (numero >=1){

                System.out.println("El numero tiene 1 cifra");
                break;
            }

        }
    }
}
