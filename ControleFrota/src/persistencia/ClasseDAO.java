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
import classededados.Devolucao;
import classededados.Locacao;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
    private String arquivoMarca = mc+"\\Marca.csv";
    private String arquivoModelo = mc+"\\Modelo.csv";
    private String arquivoVeiculo = mc+"\\Veiculos.csv";
    private String arquivoCliente = mc+"\\Cliente.csv";
    private String arquivoLocacao = mc+"\\Locacao.csv";
    private String arquivoDevolucao = mc+"\\Devolucao.csv";
    
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
           
           String aux = objModelo.getId()+";"+objModelo.getDescricao()+";"+objModelo.getIdMarca()+";"+objModelo.getTipo()+"\n";
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
            
            String aux = objVeiculo.getPlaca()+";"+objVeiculo.getIdMarca()+";"
            +objVeiculo.getIdModelo()+";"+objVeiculo.getAno()+";"+objVeiculo.getCor()+";"
            +objVeiculo.getValor()+";"+objVeiculo.getCaucao()+";"+objVeiculo.getSituacao()+";"+objVeiculo.getDiaria()+"\n";
            
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
            
            String aux = objCliente.getNome()+";"+objCliente.getCnh()+";"
            +objCliente.getEmail()+";"+objCliente.getTipoTel1()+";"
            +objCliente.getTelefone1()+";"+objCliente.getTipoTel2()+";"+objCliente.getTelefone2()+"\n";
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
        Collections.sort(listaDeMarca, new Comparator<Marca>() {
                @Override
                public int compare(Marca o1, Marca o2) {
                    return String.valueOf(o1.getId()).compareTo(String.valueOf(o2.getId()));
                }
            });

                
    
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
        objModelo.setIdMarca(Integer.parseInt(vector[2]));    
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
        objCliente.setTipoTel1(vector[3]);   
        objCliente.setTelefone1(vector[4]);   
        objCliente.setTipoTel2(vector[5]);   
        objCliente.setTelefone2(vector[6]);   
        
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
        objVeiculo.setIdMarca(Integer.parseInt(vector[1]));
        objVeiculo.setIdModelo(Integer.parseInt(vector[2]));
        objVeiculo.setAno(Integer.parseInt(vector[3]));
        objVeiculo.setCor(vector[4]);
        objVeiculo.setValor(Double.parseDouble(vector[5]));
        objVeiculo.setCaucao(Double.parseDouble(vector[6]));    
        objVeiculo.setSituacao(vector[7]);    
        objVeiculo.setDiaria(Double.parseDouble(vector[8]));   
        
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
                   bw.write(aux.getPlaca()+";"+aux.getIdMarca()+";"
            +aux.getIdModelo()+";"+aux.getAno()+";"+aux.getCor()+";"
            +aux.getValor()+";"+aux.getCaucao()+";"+aux.getSituacao()+";"+aux.getDiaria()+"\n");
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
                   bw.write(aux.getId()+";"+aux.getDescricao()+";"+aux.getIdMarca()+";"+aux.getTipo()+"\n");
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
                   bw.write(aux.getNome()+";"+aux.getCnh()+";"
            +aux.getEmail()+";"+aux.getTipoTel1()+";"
            +aux.getTelefone1()+";"+aux.getTipoTel2()+";"+aux.getTelefone2()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterarMarca(Object objeto, String id) throws Exception {
        excluirMarca(id);
        incluirMarca(objeto);
    }

    @Override
    public void alterarModelo(Object objeto, String id) throws Exception {
        excluirModelo(id);
        incluirModelo(objeto);
    }

    @Override
    public void alterarCliente(Object objeto, String cnh) throws Exception {
        excluirCliente(cnh);
        incluirCliente(objeto);
    }

    @Override
    public void alterarVeiculo(Object objeto, String placa) throws Exception {
        excluirVeiculo(placa);
        incluirVeiculo(objeto);
    }

    @Override
    public void incluirLocacao(Object objeto) throws Exception {
         Locacao objLocacao = (Locacao)(objeto);
        
        FileWriter fileLocacao = null;
        BufferedWriter bufferLocacao = null;
        
        try {
           fileLocacao = new FileWriter(arquivoLocacao, true);
           bufferLocacao = new BufferedWriter(fileLocacao);
           
           String aux = objLocacao.getId()+";"+objLocacao.getCnhCliente()+";"+objLocacao.getPlacaVeiculo()+
                   ";"+objLocacao.getValor()+";"+objLocacao.getDataLoc()+";"+objLocacao.getDataDev()+"\n";
           bufferLocacao.write(aux);
           
        } catch (Exception e) {
            throw e;
        }finally{
            if (bufferLocacao != null) bufferLocacao.close();
        }
    }

    @Override
    public ArrayList<Locacao> recuperarLocacao() throws Exception {
        ArrayList<Locacao> listaDeLocacao = new ArrayList<>();
        Locacao objLocacao = null;            
            
    FileReader frLocacao = new FileReader(arquivoLocacao);
    BufferedReader br = new BufferedReader(frLocacao);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objLocacao = new Locacao();
        objLocacao.setId(Integer.parseInt(vector[0]));
        objLocacao.setCnhCliente(vector[1]);
        objLocacao.setPlacaVeiculo(vector[2]);
        objLocacao.setValor(Double.parseDouble(vector[3]));
        objLocacao.setDataLoc(vector[4]);
        objLocacao.setDataDev(vector[5]);   
        
       listaDeLocacao.add(objLocacao);
    }
    br.close();
    return listaDeLocacao;
    }

    @Override
    public ArrayList<Devolucao> recuperarDevolucao() throws Exception {
        
        ArrayList<Devolucao> listaDev = new ArrayList<>();
        Devolucao objDev = null;            
            
    FileReader frDev = new FileReader(arquivoDevolucao);
    BufferedReader br = new BufferedReader(frDev);
    String linha = "";
    
    while((linha=br.readLine())!= null){
        String vector[] = linha.split(";");
        
        objDev = new Devolucao();
        objDev.setPlaca(vector[0]);
        objDev.setSituação(vector[1]);
        objDev.setObservacao(vector[2]);   
        objDev.setDataDev(vector[3]);   
        
       listaDev.add(objDev);
    }
    return listaDev;
    }

    @Override
    public void incluirDevolucao(Object objeto) throws Exception {
        Devolucao objDevolucao = (Devolucao)(objeto);
        
        FileWriter fileDev = null;
        BufferedWriter bufferDev = null;
        
        try {
           fileDev = new FileWriter(arquivoDevolucao, true);
           bufferDev = new BufferedWriter(fileDev);
           
           String aux = objDevolucao.getPlaca()+";"+objDevolucao.getSituação()+";"+objDevolucao.getObservacao()+";"+objDevolucao.getDataDev()+"\n";
           bufferDev.write(aux);
           
        } catch (Exception e) {
            throw e;
        }finally{
            if (bufferDev != null) bufferDev.close();
        }
    }

    @Override
    public void excluirLocacao(String placa) throws Exception {
        Locacao objMarca;
        try {
           ArrayList<Locacao> listaLoc = this.recuperarLocacao();
           FileWriter fw = new FileWriter(arquivoLocacao);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int pos=0; pos<listaLoc.size();pos++){
               Locacao aux = listaLoc.get(pos);
               if(!(placa).equals(aux.getPlacaVeiculo())){
                   bw.write(aux.getId()+";"+aux.getCnhCliente()+";"+aux.getPlacaVeiculo()+
                   ";"+aux.getValor()+";"+aux.getDataLoc()+";"+aux.getDataDev()+"\n");
               }
           }
           bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
