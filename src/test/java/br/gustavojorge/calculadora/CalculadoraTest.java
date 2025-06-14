package br.gustavojorge.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import br.gustavojorge.calculadora.entities.Calculadora;

// Esse código é um conjunto de testes automatizados para a classe Calculadora, usando o JUnit 5.
// Ele testa as funções da calculadora: soma, subtração, multiplicação e divisão: 
// E também verifica se a divisão por zero causa o erro esperado (ArithmeticException).
class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(2, -2));
        assertEquals(-5, calc.somar(-2, -3));
    }

    @Test
    void testSubtracao() {
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(4, calc.subtrair(2, -2));
        assertEquals(-1, calc.subtrair(-3, -2));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(2, 0));
        assertEquals(-6, calc.multiplicar(2, -3));
    }

    @Test
    void testDivisao() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(6, -3));
        assertEquals(0, calc.dividir(0, 5));
    }

    @Test
    void testDivisaoPorZero() {
        // Verifica se uma exceção do tipo ArithmeticException é lançada ao tentar dividir por zero
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);   // Tentando dividir por 0, o que deve lançar a exceção
        });
        assertEquals("Divisão por zero não é permitida!", exception.getMessage());
    }
}
