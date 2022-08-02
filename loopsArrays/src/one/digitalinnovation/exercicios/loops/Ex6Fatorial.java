package one.digitalinnovation.exercicios.loops;

import java.util.Scanner;

/**
 *  Faça um programa que calcule o fatorial de um número
 *  inteiro fornecido pelo usuário.
 *  Exemplo: 5! = 120 (5*4*3*2*1)
 */
public class Ex6Fatorial {
    public static void main(String[] args) {
        System.out.println(" Exercício Fatorial. ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicar = 1;

        System.out.println(fatorial + "!" + " = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicar = multiplicar * i;
        }
        System.out.println(multiplicar);
    }
}
