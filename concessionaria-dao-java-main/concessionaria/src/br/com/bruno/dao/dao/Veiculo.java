package br.com.bruno.dao.dao;

public abstract class Veiculo {

    public abstract void imprimir();

    public static Veiculo criarVeiculo(String tipoVeiculo) {
        if ("carro".equalsIgnoreCase(tipoVeiculo)) {
            return new Carro();
        } else if ("barco".equalsIgnoreCase(tipoVeiculo)) {
            return new Barco();
        }
        return null;
    }
 }
