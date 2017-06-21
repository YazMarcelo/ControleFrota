package classededados;
public class Veiculo {
    private String situacao = "";
    private int idMarca = 0;
    private int idModelo = 0;
    private String placa = "";
    private String cor = "";
    private Marca marcas = null;
    private Modelo modelos = null;
    private int ano = 0;
    private double caucao = 0;
    private double valor = 0;
    
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
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }
    
}
