package Strategy;

public class Aritmetica implements ICalMedia {

    public double Calcular(double a, double b) {
        double Media = (a + b) / 2;
        return Media;
    }

    public String Situacao(double Media) {  
        return (media >= 5) ? "Aprovado" : "Reprovado";
    }


    public String situacao(double Media) {
        throw new UnsupportedOperationException("Unimplemented method 'situacao'");
    }

}