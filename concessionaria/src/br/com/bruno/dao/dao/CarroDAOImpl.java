package br.com.bruno.dao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CarroDAOImpl implements CarroDAO {

    Connection conexao;

    public CarroDAOImpl(Connection conexao) {
        this.conexao = conexao;
    }


    @Override
    public void salvar(Carro carro) {
        String insert = "INSERT INTO carro (ID, MODELO, MARCA, ANO, PRECO) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(insert);
            stmt.setString(1, carro.getId());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getMarca());
            stmt.setInt(4, carro.getAno());
            stmt.setDouble(5, carro.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Carro carro) {

    }

    @Override
    public void excluir(Carro carro) {

    }

    @Override
    public void buscarPorId(Carro carro) {

    }

    @Override
    public List<Carro> listarTodos() {
        return List.of();
    }
}
