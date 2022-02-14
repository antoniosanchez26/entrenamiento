package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero,suma = 0;
        Scanner entrada = new Scanner(System.in);

	    do  {
            System.out.print("Dame un número (negativo para terminar): ");
            numero = entrada.nextInt();
            if (numero >= 0){
                suma = suma + numero;
            }
        } while (numero >= 0 );
        System.out.print(suma);
    }
}
