package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0 ; i < numeros.length; i ++) {
            System.out.print("Número "+ (i + 1 )+ ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Estos son los números que me has dado: ");
        for (int i = 0 ; i < numeros.length; i ++) {
            if (i < numeros.length - 1){
                System.out.print(numeros[i] + ", " );
            } else if (i == numeros.length - 1) {
                System.out.print("y " + numeros[i] );
            } else {
                System.out.print(numeros[i] );
            }
        }
        entrada.close();
    }
}
