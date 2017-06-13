/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Marca;
import classededados.Modelo;
import classededados.Veiculo;
import classededados.Cliente;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Pedro
 */
public class ClasseDAO implements CRUD{
    private String m = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String t = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String d = "";
    
    private String arquivoMarca = t+"\\Marca.csv";
    private String arquivoModelo = t+"\\Modelo.csv";
    private String arquivoVeiculo = t+"\\Veiculos.csv";
    private String arquivoCliente = t+"\\Cliente.csv";
    
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
            Veiculo objVeiculo = (Veiculo) (objeto);
            
            FileWriter fileVeiculo = null;
            BufferedWriter bufferVeiculo = null;
            
            try {
            fileVeiculo = new FileWriter(arquivoVeiculo, true);
            bufferVeiculo = new BufferedWriter(fileVeiculo);
            
            Marca marca = new Marca();
            Modelo modelo = new Modelo();
            
            String aux = objVeiculo.getId()+";"+objVeiculo.getMarca(marca.toString())+";"+objVeiculo.getModelo(modelo.toString())+"\n";
            bufferVeiculo.write(aux);
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null , e.getMessage());
        }finally{
                if(bufferVeiculo != null) bufferVeiculo.close();
            }
    }

    @Override
    public void incluirCliente(Object objeto) throws Exception {
            Cliente objCliente = (Cliente) (objeto);
            
            FileWriter fileCliente = null;
            BufferedWriter bufferCliente = null;
            
            try {
            fileCliente = new FileWriter(arquivoCliente, true);
            bufferCliente = new BufferedWriter(fileCliente);
            
            String aux = objCliente.getNome()+";"+objCliente.getCnh()+"\n";
            bufferCliente.write(aux);
            
        } catch (Exception e) {
            throw e;
        }finally{
                if(bufferCliente != null) bufferCliente.close();
            }
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
