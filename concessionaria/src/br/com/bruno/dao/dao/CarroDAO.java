package br.com.bruno.dao.dao;

import java.util.List;

public interface CarroDAO {

    void salvar(Carro carro);
    void alterar(Carro carro);
    void excluir(Carro carro);
    void buscarPorId(Carro carro);
    public List<Carro> listarTodos();
}
