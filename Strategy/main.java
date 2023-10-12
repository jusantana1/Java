package Strategy;

import java.awt.*;

public class Executar {

        public static void main(String[] args) {

            Aritmetica calculo = new Aritmetica();
            //Geometrica calculo = new Geometrica();
    
            Disciplina d = new Disciplina(calculo);
            d.setNome("design patterns");
            d.setA(10); d.setB(5);
            d.getCalMedia();
    
            System.out.println(
                String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", 
                    d.getA(),d.getB(), d.getCalMedia(), d.getSituacao()));
        }
}