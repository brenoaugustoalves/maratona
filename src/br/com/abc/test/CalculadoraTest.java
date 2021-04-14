package br.com.abc.test;

import br.com.abc.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.multiplicaDoisnumeros(5,5);
        System.out.println("Executando");
        calc.subtraiDoinumeros();

    }
}
