package Herança;

public class Usa_Heranca {
    public static void main (String args []) {

        ClasseFilha2 a = new ClasseFilha2();
        ClasseFilha3 b = new ClasseFilha3();

        a.set_atributo_1("valor do atributo 1");
        a.set_atributo_2("valor do atributo 2");
        System.out.println(a.get_atributo_1());
        System.out.println(a.get_atributo_2());
    }

}
