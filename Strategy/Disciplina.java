package Strategy;

public class Disciplina {

    private ICalMedia CalMedia;
    private double Media;
    private String Nome;
    private double a;
    private double b;
    private String situacao;

    public Disciplina(Aritmetica calculo) {
    }
    public ICalMedia getCalMedia() {
        return CalMedia;
    }
    public void setCalMedia(ICalMedia CalMedia) {
        CalMedia = ICalMedia;
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

    public double getMedia() {
        return Media;
    }

    public void setMedia(int Media) {
        this.Media = Media;
    }

    public void setNome(String nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
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