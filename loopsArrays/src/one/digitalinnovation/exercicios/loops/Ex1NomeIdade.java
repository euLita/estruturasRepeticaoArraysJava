package one.digitalinnovation.exercicios.loops;
import java.util.Scanner;
/**
 *  Faça um programa que leia conjuntos de dois valores,
 *  o 1º representando o nome do aluno e o 2º representando a sua idade.
 *  Para o programa inserindo o valor 0 (zero) no campo nome;
 */
public class Ex1NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // class Scanner lê através do teclado;
        String nome;
        int idade;
        while (true) {
            System.out.println(" Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println(" Idade: ");
            idade = scan.nextInt();
        }
        System.out.println(" Continua aqui..." );
    }
}
