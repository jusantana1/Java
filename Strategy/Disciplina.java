package Strategy;

public class Disciplina {

    private ICalMedia CalMedia;
    private double Media;
    private String Nome;
    private double a;
    private double b;
    private String situacao;

    public ICalMedia getCalMedia() {
        return CalMedia;
    }
    public void setCalMedia(ICalMedia CalMedia) {
        calculomedia = CalMedia;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setNome(String nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public double Calcular()
    {
        return this.CalMedia.calcular(this.a, this.b);
    }

}