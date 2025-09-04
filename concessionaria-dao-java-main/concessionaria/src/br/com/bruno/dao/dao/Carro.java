package br.com.bruno.dao.dao;

import java.util.List;

public class Carro extends Veiculo{
    private String id;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private CarroDAO carroDAO;

    public Carro(String id, String marca, String modelo, int ano, double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        carroDAO = new CarroDAOImpl();
    }

    public Carro() {

    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void imprimir() {
        System.out.println("isso é um carro");
    }
}
