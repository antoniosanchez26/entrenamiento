package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        int n;

        Scanner entrada = new Scanner(System.in);
        System.out.print( "Dame un número: ");
        n = entrada.nextInt();

        for (int i = 0; i < n ; i++) {
            suma += i + 1 ;
        }
        System.out.println( "Suma = " + suma);
    }
}
