package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 1, n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número: ");
        n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            num = num * i ;
        }
        System.out.println(num);
    }
}
