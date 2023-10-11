package Strategy;

public class Aritmetica implements ICalMedia {

    private static final int Media = 0;

    public double Aritmetica (double a, double b) {

        double Media = a+b/2;

        return Media;
    }

    public String situacao() {

        If(Media >= 5 ) {
            System.out.println("Aluno Aprovado");
        } else {
             System.out.println("Aluno Reprovado"); 
        }
    }

}