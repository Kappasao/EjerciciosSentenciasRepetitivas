import java.util.Scanner;

/**
 * Created by 46995932D on 03/11/2016.
 */
public class Ejercicio12 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int mon50 = 0;
        int mon20 = 0;
        int mon10 = 0;
        int mon5 = 0;
        int mon2 = 0;
        int mon1 = 0;

        System.out.println("Dime el dinero para que te de el cambio");
        int cant=scanner.nextInt();

        while ( cant != 0 ){

            if (cant - 50 >= 0){
                cant=cant-50;
                mon50++;
            }
            else if ( cant - 20 >= 0){
                cant=cant-20;
                mon20++;
            }
            else if (cant - 10 >= 0){
                cant=cant-10;
                mon10++;
            }
            else if (cant - 5 >= 0){
                cant=cant-5;
                mon5++;
            }
            else if (cant - 2 >= 0){
                cant=cant-2;
                mon2++;
            }
            else if (cant - 1 >= 0 ){
                cant=cant-1;
                mon1++;
            }

        }

        System.out.println("Hay " + mon50 + " monedas de 50 centimo/s");
        System.out.println("Hay " + mon20 + " monedas de 20 centimo/s");
        System.out.println("Hay " + mon10 + " monedas de 10 centimo/s");
        System.out.println("Hay " + mon5 + " monedas de 5 centimo/s");
        System.out.println("Hay " + mon2 + " monedas de 2 centimo/s");
        System.out.println("Hay " + mon1 + " monedas de 1 centimo/s");


    }
}
