public class Main {
    public static void main(String[] args) {

        Aritmetica calculo = new Aritmetica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("design patterns");
        d.setA(10); 
        d.setB(5);
        d.CalMedia();
        System.out.println(

            String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", 
            
            d.getA(),d.getB(), d.getCalMedia(), d.getSituacao()));
    }

}