package classededados;
public class Veiculo {
    private int id = 0;
    private Marca marca = null;
    private Modelo modelo = null;

    public String getMarca(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModelo(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public enum UserStatus {
    VENDIDO,
    SINISTRO,
    DISPONIVEL,
    DEVOLVIDO,
    LOCADO;
    }

    public int getId() {
        return id;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
