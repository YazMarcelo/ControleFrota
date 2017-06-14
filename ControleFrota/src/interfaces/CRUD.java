package interfaces;

import classededados.Cliente;
import classededados.Marca;
import classededados.Modelo;
import classededados.Veiculo;
import java.util.ArrayList;

public interface CRUD {
    void incluirMarca(Object objeto)throws Exception;
    void excluirMarca(String id)throws Exception;
    void excluirVeiculo(String placa)throws Exception;
    void excluirModelo(String id)throws Exception;
    void excluirCliente(String cnh)throws Exception;
    void incluirModelo(Object objeto)throws Exception;
    void incluirVeiculo(Object objeto)throws Exception;
    void incluirCliente(Object objeto)throws Exception;
    public ArrayList<Marca> recuperarMarca()throws Exception;
    public ArrayList<Modelo> recuperarModelo()throws Exception;
    public ArrayList<Cliente> recuperarCliente()throws Exception;
    public ArrayList<Veiculo> recuperarVeiculo()throws Exception;

}
