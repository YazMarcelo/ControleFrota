
package classededados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GeradorDeId {
    private int idCliente = 0;
    private int idVeiculo = 0;
    private int idMarca = 0;
    private int idModelo = 0;
    String arquivoIds = "C:\\Users\\Pedro\\Documents\\NetBeansProjects\\ControleFrota\\ControleFrota\\src\\arquivo\\Ids.csv";
    
    FileReader frIds = null;
    BufferedReader brIds = null;
    
    public GeradorDeId(){
        try {
        frIds = new FileReader(arquivoIds);
        brIds = new BufferedReader(frIds);
        
        String linha = brIds.readLine();
        String vetorIds[] = linha.split(";");
        idCliente = Integer.parseInt(vetorIds[0]);
        idVeiculo = Integer.parseInt(vetorIds[1]);
        idMarca = Integer.parseInt(vetorIds[2]);
        idModelo = Integer.parseInt(vetorIds[3]);
        brIds.close();
        } catch (Exception e) {
        }
   
    }

    public int getIdCliente() {
        return ++idCliente;
    }

    public int getIdVeiculo() {
        return ++idVeiculo;
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
        String saida = idVeiculo+";"+idCliente+";"+idMarca+";"+idModelo;
        bwIds.write(saida);
        bwIds.close();
    }

}
