package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        numero = entrada.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println(i + 1);
        }
    }
}
