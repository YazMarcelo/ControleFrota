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
    private Marca marca = null;
    //private String tipo = "";

    public Modelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Tipo {
    LUXO,
    PLUS,
    ECONÔMICO;
    }
    
    public Modelo(int id, String descricao, Marca marca){
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    
}
