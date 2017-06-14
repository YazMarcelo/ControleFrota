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
    private String mc = "C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String mt = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String t = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String d = "";
    
    private String arquivoMarca = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Marca.csv";
    private String arquivoModelo = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Modelo.csv";
    private String arquivoVeiculo = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Veiculos.csv";
    private String arquivoCliente = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Cliente.csv";
    
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
           
           String aux = objModelo.getId()+";"+objModelo.getDescricao()+";"+objModelo.getMarca()+";"+objModelo.getTipo()+"\n";
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
            
            String aux = objVeiculo.getPlaca()+";"+objVeiculo.getMarca()+";"+objVeiculo.getModelo()+";"+objVeiculo.getAno()+";"+objVeiculo.getCor()+";"+objVeiculo.getSituacao()+"\n";
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
            
            String aux = objCliente.getNome()+";"+objCliente.getCnh()+";"+objCliente.getEmail()+";"+objCliente.getTelefone()+"\n";
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

    @Override
    public ArrayList<Modelo> recuperarModelo() throws Exception {
        ArrayList<Modelo> listaDeModelo = new ArrayList<>();
        Modelo objModelo = null;            
            
    FileReader frModelo = new FileReader(arquivoModelo);
    BufferedReader br = new BufferedReader(frModelo);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objModelo = new Modelo();
        objModelo.setId(Integer.parseInt(vector[0]));
        objModelo.setDescricao(vector[1]);    
        objModelo.setMarca(vector[2]);    
        objModelo.setTipo(vector[3]);    
        
       listaDeModelo.add(objModelo);
    }
    br.close();
    return listaDeModelo;
    }

    @Override
    public ArrayList<Cliente> recuperarCliente() throws Exception {
        ArrayList<Cliente> listaDeCliente = new ArrayList<>();
        Cliente objCliente = null;            
            
    FileReader frModelo = new FileReader(arquivoCliente);
    BufferedReader br = new BufferedReader(frModelo);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objCliente = new Cliente();
        objCliente.setNome(vector[0]);
        objCliente.setCnh(vector[1]);
        objCliente.setEmail(vector[2]);
        objCliente.setTelefone(vector[3]);   
        
       listaDeCliente.add(objCliente);
    }
    br.close();
    return listaDeCliente;
    }

    @Override
    public ArrayList<Veiculo> recuperarVeiculo() throws Exception {
        ArrayList<Veiculo> listaDeVeiculo = new ArrayList<>();
        Veiculo objVeiculo = null;            
            
    FileReader frModelo = new FileReader(arquivoVeiculo);
    BufferedReader br = new BufferedReader(frModelo);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objVeiculo = new Veiculo();
        objVeiculo.setPlaca(vector[0]);
        objVeiculo.setMarca(vector[1]);
        objVeiculo.setModelo(vector[2]);
        objVeiculo.setAno(Integer.parseInt(vector[3]));
        objVeiculo.setCor(vector[4]);       
        objVeiculo.setSituacao(vector[5]);    
        
       listaDeVeiculo.add(objVeiculo);
    }
    br.close();
    return listaDeVeiculo;
    }
    @Override
    public void excluirMarca(String id) throws Exception {
        Marca objMarca;
        try {
           ArrayList<Marca> listaDeMarcas = this.recuperarMarca();
           FileWriter fw = new FileWriter(arquivoMarca);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int pos=0; pos<listaDeMarcas.size();pos++){
               Marca aux = listaDeMarcas.get(pos);
               if((Integer.parseInt(id) != aux.getId())){
                   bw.write(aux.getId()+";"+aux.getDescricao()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
        

    }

    @Override
    public void excluirVeiculo(String placa) throws Exception {
        try {
           ArrayList<Veiculo> listaDeVeiculos = this.recuperarVeiculo();
           FileWriter fw = new FileWriter(arquivoVeiculo);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int pos=0; pos<listaDeVeiculos.size();pos++){
               Veiculo aux = listaDeVeiculos.get(pos);
               if(!(aux.getPlaca().equals(placa))){
                   bw.write(aux.getPlaca()+";"+aux.getMarca()+";"+aux.getModelo()+";"+aux.getAno()+";"+aux.getCor()+";"+aux.getSituacao()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void excluirModelo(String id) throws Exception {
        try {
           ArrayList<Modelo> listaDeModelos = this.recuperarModelo();
           FileWriter fw = new FileWriter(arquivoModelo);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int pos=0; pos<listaDeModelos.size();pos++){
               Modelo aux = listaDeModelos.get(pos);
               if((Integer.parseInt(id) != aux.getId())){
                   bw.write(aux.getId()+";"+aux.getDescricao()+";"+aux.getMarca()+";"+aux.getTipo()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void excluirCliente(String cnh) throws Exception {
        try {
           ArrayList<Cliente> listaDeClientes = this.recuperarCliente();
           FileWriter fw = new FileWriter(arquivoCliente);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int pos=0; pos<listaDeClientes.size();pos++){
               Cliente aux = listaDeClientes.get(pos);
               if(!(aux.getCnh().equals(cnh))){
                   bw.write(aux.getNome()+";"+aux.getCnh()+";"+aux.getEmail()+";"+aux.getTelefone()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
