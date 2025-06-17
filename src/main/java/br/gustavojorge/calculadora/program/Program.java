package br.gustavojorge.calculadora.program;

import java.util.Locale;
import java.util.Scanner;

import br.gustavojorge.calculadora.entities.Calculadora;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            Calculadora calc = new Calculadora();

            System.out.println("Iniciando Calculadora!\n");

            char resp = 0;
            do {
                System.out.println("Operações disponíveis:");
                System.out.println("1 - Soma");
                System.out.println("2 - Divisão");
                System.out.println("3 - Subtração");
                System.out.println("4 - Multiplicação\n");

                System.out.print("Digite a operação desejada (1-4): \n");
                int num = sc.nextInt();
                System.out.println();

                System.out.print("Digite o primeiro número: \nnº ");
                double num1 = sc.nextDouble();

                double num2 = 0;

                if (num == 2) {
                    boolean valido = false;
                    while (!valido) {
                        System.out.print("Digite o segundo número: \nnº ");
                        num2 = sc.nextDouble();
                        try {
                            calc.setTotal(calc.divisao(num1, num2));
                            valido = true;
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Por favor, insira um número diferente de zero.\n");
                        }
                    }
                } else {
                    System.out.print("Digite o segundo número: \nnº ");
                    num2 = sc.nextDouble();

                    switch (num) {
                        case 1:
                            calc.setTotal(calc.soma(num1, num2));
                            break;
                        case 3:
                            calc.setTotal(calc.subtracao(num1, num2));
                            break;
                        case 4:
                            calc.setTotal(calc.multiplicacao(num1, num2));
                            break;
                        default:
                            System.out.println("Operação inválida!");
                            continue; // volta ao início do loop
                    }
                }

                System.out.println("\n" + calc);
                System.out.print("\nDeseja realizar outra operação? (s/n): \n");
                resp = sc.next().charAt(0);

            } while (resp != 'n' && resp != 'N');
        }
    }
}