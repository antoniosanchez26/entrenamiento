package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número (0 para terminar): ");
        numero = entrada.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
            System.out.print("Dame otro número: ");
            numero = entrada.nextInt();
        }
    }
}
