import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random r = new Random();
        int adivinar = r.nextInt(100);
        int i = 0;
        int apuesta = input("Adivina el número secreto entre 0 y 100. ¿Que número es?");
        while (adivinar != apuesta) {
            i++;
            if (adivinar > apuesta) {
                apuesta = input("El número es más grande. \n Intenta otra vez");
            } else {
                apuesta = input("El número es más pequeño. \n Intenta otra vez");
            }
        }
        System.out.println("Has acertado el número con " + i + " intentos fallidos");
    }

    private static int input(String text) {
        return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
}
