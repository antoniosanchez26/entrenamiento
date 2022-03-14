package es.asdj;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int contador = 0;

        System.out.print("Escribe un texto: ");
        texto = entrada.nextLine();
        System.out.print("Intenta adivinar una letra del texto: ");
        char letra = entrada.nextLine().charAt(0);

        /*for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i)) {
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("La letra " + letra + " no está en el texto: " + texto);
        } else {
            System.out.println("La letra " + letra + "  está en el texto: " + texto + " y aparece " + contador + " veces");
        }*/

        for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.toLowerCase().charAt(i) || letra == texto.toUpperCase().charAt(i)) {
                System.out.print(texto.charAt(i));
            } else if  (texto.charAt(i) == ' '){
                System.out.print(" ");
            } else {
                System.out.print("_");
            }
        }
    }
}