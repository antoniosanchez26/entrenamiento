package es.asdj;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int numero,suma = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        numero = entrada.nextInt();

        while ( numero >= 0) {
            System.out.print("Dame otro numero: ");
            suma = suma + numero;
            numero = entrada.nextInt();
        }
        System.out.print("SUMA = " + suma);
    }
}
