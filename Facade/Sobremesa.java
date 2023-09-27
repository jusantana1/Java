package Facade;

public class Sobremesa extends Produto {
    
    private String tamanho;
   // public String setDescricao;
    //public double setPreco;

    public void setTamanho (String tamanho){
        this.tamanho= tamanho;
    }
    public String getTamanho() {
        return tamanho;
    }
}
