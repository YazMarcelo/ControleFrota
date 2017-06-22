
package classededados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GeradorDeId {
    private int idCliente = 0;
    private int idLocacao = 0;
    private int idMarca = 0;
    private int idModelo = 0;
    
    private String m = "C:\\Users\\aluno\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String mt = "C:\\Users\\selecta\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String mc = "C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String t = "C:\\Users\\aluno\\Documents\\VPProjects\\ControleFrota\\ControleFrota\\src\\arquivo";
    private String d = "";
    String arquivoIds = mc+"\\Ids.csv";
    
    FileReader frIds = null;
    BufferedReader brIds = null;
    
    public GeradorDeId(){
        try {
        frIds = new FileReader(arquivoIds);
        brIds = new BufferedReader(frIds);
        
        String linha = brIds.readLine();
        String vetorIds[] = linha.split(";");
        idCliente = Integer.parseInt(vetorIds[0]);
        idLocacao = Integer.parseInt(vetorIds[1]);
        idMarca = Integer.parseInt(vetorIds[2]);
        idModelo = Integer.parseInt(vetorIds[3]);
        brIds.close();
        } catch (Exception e) {
        }
   
    }

    public int getIdCliente() {
        return ++idCliente;
    }

    public int getIdLocacao() {
        return ++idLocacao;
    }

    public int getIdMarca() {
        return ++idMarca;
    }

    public int getIdModelo() {
        return ++idModelo;
    }

    public void finalize() throws IOException{
        FileWriter fwIds = new FileWriter(arquivoIds,false);
        BufferedWriter bwIds = new BufferedWriter(fwIds);
        String saida = idLocacao+";"+idCliente+";"+idMarca+";"+idModelo;
        bwIds.write(saida);
        bwIds.close();
    }

}
