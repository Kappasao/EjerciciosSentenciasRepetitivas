import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Random r = new Random();
        int adivinar = r.nextInt(100);
        int apuesta = input("Adivina el número secreto entre 0 y 100. ¿Que número es?");
        int intentos = 0;
        while (adivinar != apuesta) {
            if (adivinar > apuesta) {
                apuesta = input("El número es más grande. \n Intenta otra vez");
            }
            else if (adivinar < apuesta){
                apuesta = input("El número es más pequeño. \n Intenta otra vez");
            }

            intentos++;
            if (intentos == 10){
                System.out.println("Has fallado 10 veces. Has perdido. Unlucky");
                System.out.println("Prueba suerte la proxima vez");
                break;
            }
            else if (intentos != 10){
                System.out.println("Tienes " + intentos + " de 10 intentos restantes. ");
            }

            if (adivinar == apuesta){
                System.out.println("Has acertado el numero y has ganado!");
            }


        }

        System.out.println("El numero era " + adivinar );

    }

    private static int input(String text) {
        return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
}