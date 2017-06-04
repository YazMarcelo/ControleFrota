/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Marca;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Pedro
 */
public class VeiculoDAO implements CRUD{
    String arquivoMarca = "C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Marca.csv";
    

    @Override
    public void incluirMarca(Object objeto) throws Exception {
        Marca objMarca = (Marca)(objeto);
        
        FileWriter fileMarca = null;
        BufferedWriter bufferMarca = null;
        
        try {
           fileMarca = new FileWriter(arquivoMarca, true);
           bufferMarca = new BufferedWriter(fileMarca);
           
           String aux = objMarca.getId()+";"+objMarca.getDescricao()+"\n";
           bufferMarca.write(aux);
           
        } catch (Exception e) {
            throw e;
        }finally{
            if (bufferMarca != null) bufferMarca.close();
        }
    }

    @Override
    public void incluirModelo(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incluirVeiculo(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incluirCliente(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
