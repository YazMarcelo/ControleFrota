/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Marca;
import classededados.Modelo;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class ClasseDAO implements CRUD{
    private String arquivoMarca = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Marca.csv";
    private String arquivoModelo = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Modelo.csv";
    
    
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
        Modelo objModelo = (Modelo)(objeto);
        
        FileWriter fileModelo = null;
        BufferedWriter bufferModelo = null;
        
        try {
           fileModelo = new FileWriter(arquivoModelo, true);
           bufferModelo = new BufferedWriter(fileModelo);
           
           String aux = objModelo.getId()+";"+objModelo.getDescricao()+"\n";
           bufferModelo.write(aux);
           
        } catch (Exception e) {
            throw e;
        }finally{
            if (bufferModelo != null) bufferModelo.close();
        }
    }

    @Override
    public void incluirVeiculo(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incluirCliente(Object objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public ArrayList<Marca> recuperarMarca() throws Exception {
        
        ArrayList<Marca> listaDeMarca = new ArrayList<>();
        Marca objMarca = null;            
            
    FileReader frMarca = new FileReader(arquivoMarca);
    BufferedReader br = new BufferedReader(frMarca);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objMarca = new Marca();
        objMarca.setId(Integer.parseInt(vector[0]));
        objMarca.setDescricao(vector[1]);    
        
       listaDeMarca.add(objMarca);
    }
    br.close();
    return listaDeMarca;
    }

    
}
