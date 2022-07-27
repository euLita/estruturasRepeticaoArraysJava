package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/**
 *  Faça um programa que peça N número inteiros, depois
 *  calcule e mostre a quantidade de números pares e
 *  a quantidade de números impares;
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNum;
        int num;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNum = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0) quantPares++; // Se num dividido por 2 e o resto for zero;
            else quantImpares++; // Senão é ímpar;

            count++; //count = count + 1;
        } while (count < quantNum);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}
