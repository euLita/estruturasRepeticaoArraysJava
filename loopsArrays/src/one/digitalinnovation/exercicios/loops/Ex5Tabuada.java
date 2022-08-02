package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/**
 *  Desenvolva um gerador de tabuada,
 *  capaz de gerar a tabuada de qualquer número inreiro entre 1 a 10.
 *  O usuário deve informar de qual número ele deseja ver a tabuada.
 *  A saída deve ser conforme o exemplo abaixo:
 *
 *  Tabuada de 5:
 *  5 x 1 = 5
 *  5 x 2 = 10
 *  ...
 *  5 x 10 = 50
 */
public class Ex5Tabuada {
    public static void main(String[] args) {
        System.out.println(" Exercício tabuada. ");

        Scanner scan = new Scanner((System.in));
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de : " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
