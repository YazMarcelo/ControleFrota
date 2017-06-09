/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;
import classededados.Marca;

/**
 *
 * @author Pedro
 */
public class Modelo {
    private int id = 0;
    private String descricao = "";
    private String marca = "";
    //private String tipo = "";
    
    public enum Tipo {
    LUXO,
    PLUS,
    ECONÔMICO;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
