package Herança; 

public class SuperClasse {
    
    private String atributo_1;

    SuperClasse(){
        System.out.println("acesso ao metodo construtor da superclasse");
    }

    public void set_atributo_1(String atributo_1) {
        this.atributo_1 = atributo_1;
    }

    public String get_atributo_1 () {
        return atributo_1; 
    }

}