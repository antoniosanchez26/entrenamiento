package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

	    do  {
            System.out.print("Dame un número positivo: ");
            numero = entrada.nextInt();
        } while (numero <= 0 );

    }
}
