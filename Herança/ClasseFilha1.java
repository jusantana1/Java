package Herança;

public class ClasseFilha1 extends SuperClasse {

    private String atributo_2;

    ClasseFilha1(){
        super();
        System.out.println("acesso ao metodo construtor da classe filha 1");

    }
    public void set_atributo_2(String atributo_2){
        this.atributo_2 = atributo_2;
    }
    public String get_atributo_2() {
        return atributo_2;
    }
}
