package br.gustavojorge.calculadora.program;

import java.util.Locale;
import java.util.Scanner;

import br.gustavojorge.calculadora.entities.Calculadora;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Iniciando Calculadora!");
        System.out.println("");

        char resp;
        do {
            System.out.println("Operações disponiveis:");
            System.out.println("1 - Soma");
            System.out.println("2 - Divisão");
            System.out.println("3 - Subtração");
            System.out.println("4 - Multiplicação");
            System.out.println("");

            System.out.println("Digite a operação desejada (1-4):");
            System.out.print("nº ");
            int num = sc.nextInt();
            System.out.println("");

            System.out.println("Digite o primeiro número: ");
            double num1 = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            double num2 = sc.nextInt();
            System.out.println("");

            switch (num) {
                case 1:
                    calc.setTotal(calc.soma(num1, num2));
                    break;
                case 2:
                    calc.setTotal(calc.divisao(num1, num2));
                    break;
                case 3:
                    calc.setTotal(calc.subtracao(num1, num2));
                    break;
                case 4:
                    calc.setTotal(calc.multiplicacao(num1, num2));
                    break;
            }

            System.out.println(calc);
            System.out.println("");

            System.out.println("Deseja realizar outra operação: (s/n)");
            resp = sc.next().charAt(0);

        } while (resp != 'n' && resp != 'N');

        sc.close();
    }
}

// Comentário de teste feito na branch feature/calculadora
