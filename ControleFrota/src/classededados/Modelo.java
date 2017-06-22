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
    private int idMarca = 0;
    private String tipo = "";
    //private String tipo = "";

    public Modelo() {
        
    }
    
    public enum Tipo {
    LUXO,
    PLUS,
    ECONÔMICO;
    }
    
    public Modelo(int id, String descricao, int idMarca){
        this.id = id;
        this.descricao = descricao;
        this.idMarca = idMarca;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
}
