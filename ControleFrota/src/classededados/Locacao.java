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
public class Locacao {
    private String cnhCliente = "";
    private String placaVeiculo = "";
    private double valor = 0;
    private String dataLoc = "";
    private String dataDev = "";
    private int id = 0;
    

    public String getCnhCliente() {
        return cnhCliente;
    }

    public void setCnhCliente(String cnhCliente) {
        this.cnhCliente = cnhCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataLoc() {
        return dataLoc;
    }

    public void setDataLoc(String dataLoc) {
        this.dataLoc = dataLoc;
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
