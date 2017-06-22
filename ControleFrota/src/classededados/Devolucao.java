/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author Pedro
 */
public class Devolucao {
    private String placa = "";
    private String situação = "";
    private String observacao = "";
    private String dataDev = "";
    private int id = 0;

    public Devolucao() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDataDev() {
        return dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
