package Strategy;
import java.lang.Math; 

public class Geometrica implements ICalMedia () {

      public double Geometrica (double a, double b) {

        Media = Math.sqrt(a*b);

        return Media;
    }

    public String situacao() {

        If(Media >= 7 ){
            System.out.println("Aluno Aprovado");
        } else {
             System.out.println("Aluno Reprovado"); 
        }
    }

}