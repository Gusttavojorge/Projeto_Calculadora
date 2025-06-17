package br.gustavojorge.calculadora.entities;

// Classe Calculadora
public class Calculadora {

    private double total = 0;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }

    @Override
    public String toString() {
        if (total % 1 == 0) {
            return String.format("Resultado: %.1f", total);
        } else {
            return String.format("Resultado: %.2f", total);
        }
    }
}
