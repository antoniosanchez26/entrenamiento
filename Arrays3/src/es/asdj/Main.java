package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int contador = 0;
        boolean sonIguales = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame 5 números:");

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }
        System.out.println("Dame otros 5 números:");

        //Mi solución
        for (int i = 0 ; i < array2.length; i ++) {
            System.out.print("Número " + (i + 1) + ": ");
            array2[i] = entrada.nextInt();
        }
        /*for (int i = 0 ; i < array1.length; i ++) {
           if (array2[i] == array1[i]) {
               contador++;
           }
        }
        if (contador < array1.length) {
            System.out.print("Los arrays son diferentes");
        } else {
            System.out.print("Los arrays son iguales");
        }*/
        //solución Román
        for (int i = 0; i < array2.length && sonIguales; i++) {
            sonIguales = (array2[i] == array1[i]);
        }
        if (sonIguales) {
            System.out.print("Los arrays son iguales");
        } else {
            System.out.print("Los no arrays son iguales");
        }
    }
}
