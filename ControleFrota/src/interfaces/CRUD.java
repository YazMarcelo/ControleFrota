package interfaces;

import classededados.Marca;
import java.util.ArrayList;

public interface CRUD {
    void incluirMarca(Object objeto)throws Exception;
    void incluirModelo(Object objeto)throws Exception;
    void incluirVeiculo(Object objeto)throws Exception;
    void incluirCliente(Object objeto)throws Exception;
    public ArrayList<Marca> recuperarMarca()throws Exception;

}
