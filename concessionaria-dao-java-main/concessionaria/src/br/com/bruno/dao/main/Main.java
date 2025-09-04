package br.com.bruno.dao.main;

import br.com.bruno.dao.dao.Veiculo;

public class Main {
    public static void main(String[] args) {
        try {
            Veiculo veiculoCarro = Veiculo.criarVeiculo("barco");
            veiculoCarro.imprimir();
        } catch (Exception e) {
            System.out.println("meu pau");
        }

    }
}