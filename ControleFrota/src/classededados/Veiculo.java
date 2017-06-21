package classededados;
public class Veiculo {
    private String situacao = "";
    private String marca = "";
    private String modelo = "";
    private String placa = "";
    private String cor = "";
    private Marca marcas = null;
    private Modelo modelos = null;
    private int ano = 0;
    private double caucao = 0;
    private double valor = 0;
    
    public Marca getMarcas() {
        return marcas;
    }

    public Modelo getModelos() {
        return modelos;
    }

    public void setModelos(Modelo modelos) {
        this.modelos = modelos;
    }

    
    public enum UserStatus {
    VENDIDO,
    SINISTRO,
    DISPONIVEL,
    DEVOLVIDO,
    LOCADO;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModelo(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
     public double getCaucao() {
        return caucao;
    }

    public void setCaucao(double caucao) {
        caucao = (this.valor/100)*caucao;
        this.caucao = caucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
