package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/**
 *  Faça um programa que leia 5 números e
 *  informe o maior número e a
 *  média desses números;
 */
public class Ex3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Programa que lê o número maior e a média: ");

//  Informar o laço que ele precisa repetir 5x;
        int num;
        int count = 0;
        int maior = 0;
//        int media;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            soma = soma + num;

            if (num > maior) maior = num;

            count = count + 1;
//            System.out.println(" Maior: " + maior);
        } while (count < 5);

        System.out.println("Número maior informado é: " + maior); // Mostra a variável maior quando encerrar o laço;
        System.out.println("Média: " + soma/5);

    }
}
