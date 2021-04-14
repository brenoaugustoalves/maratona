package br.com.abc.test;

import br.com.abc.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fiat";
        carro.placa =  "PAPA321";
        carro.velocidadeMaxima = 350f;


        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
