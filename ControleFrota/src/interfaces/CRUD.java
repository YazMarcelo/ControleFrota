package interfaces;

import classededados.Cliente;
import classededados.Devolucao;
import classededados.Locacao;
import classededados.Marca;
import classededados.Modelo;
import classededados.Veiculo;
import java.util.ArrayList;

public interface CRUD {
    void incluirMarca(Object objeto)throws Exception;
    void excluirMarca(String id)throws Exception;
    void alterarMarca(Object objeto, String id)throws Exception;
    void alterarModelo(Object objeto, String id)throws Exception;
    void alterarCliente(Object objeto, String cnh)throws Exception;
    void alterarVeiculo(Object objeto, String placa)throws Exception;
    void excluirVeiculo(String placa)throws Exception;
    void excluirModelo(String id)throws Exception;
    void excluirCliente(String cnh)throws Exception;
    void incluirModelo(Object objeto)throws Exception;
    void incluirVeiculo(Object objeto)throws Exception;
    void incluirCliente(Object objeto)throws Exception;
    void incluirLocacao(Object objeto)throws Exception;
    public ArrayList<Marca> recuperarMarca()throws Exception;
    public ArrayList<Modelo> recuperarModelo()throws Exception;
    public ArrayList<Cliente> recuperarCliente()throws Exception;
    public ArrayList<Veiculo> recuperarVeiculo()throws Exception;
    public ArrayList<Locacao> recuperarLocacao()throws Exception;
    void excluirLocacao(String placa)throws Exception;
    public ArrayList<Devolucao> recuperarDevolucao()throws Exception;
    void incluirDevolucao(Object objeto)throws Exception;


}
