package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numero, contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("cargando números...");
        System.out.println();
        for (int i = 0 ; i < numeros.length; i++) {
          numeros[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.print("Dame un numero: ");
        numero = entrada.nextInt();

        for (int i = 0 ; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                contador++;
            }
        }

        System.out.println();
        System.out.println("El número " + numero + " está " + contador + " veces");
        System.out.println();
        for (int i = 0 ; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}