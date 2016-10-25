import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Random r = new Random();
        int adivinar = r.nextInt(100);
        int i = 0;
        int apuesta = input("Adivina el número secreto entre 0 y 100. ¿Que número es?");
        int intentos = 0;
        while (adivinar != apuesta) {
            i++;
            if (adivinar > apuesta) {
                apuesta = input("El número es más grande. \n Intenta otra vez");
            }
            else if (adivinar < apuesta){
                apuesta = input("El número es más pequeño. \n Intenta otra vez");
            }

            intentos++;
            if (intentos == 10){
                System.out.println("Has fallado 10 veces. Unlucky");
                break;
            }
            else if (intentos != 10){
                System.out.println("Tienes " + intentos + " de 10 restantes. ");
            }

        }

    }

    private static int input(String text) {
        return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
}