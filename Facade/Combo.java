package Facade;

public class Combo {
    private Burger Burger = new Burger();
    private Sobremesa Sobremesa = new Sobremesa();
    private Bebida Bebida = new Bebida();

     public void CriarCombo(int tipo) {
   
    switch (tipo) {

        case 1:
       
        System.out.println("*Combo Master*");
        Burger.setDescricao ("X- Burger");
        Burger.setPreco(18.5);
        Burger.setGramas(200);

        Sobremesa.setDescricao("Sorvete");
        Sobremesa.setPreco(5.5);
        Sobremesa.setTamanho("Grande");

        Bebida.setDescricao("Coca Cola");
        Bebida.setPreco(8.0);
        Bebida.setTamanho("500 ml");
        break;

        case 2:

        System.out.println("*Super Combo*");
        Burger.setDescricao("X-Salada");
        Burger.setPreco(18.5);
        Burger.setGramas(200);

    
        Sobremesa.setDescricao("Pudim");
        Sobremesa.setPreco(5.5);
        Sobremesa.setTamanho("Medio");

        Bebida.setDescricao("Guarana");
        Bebida.setPreco(6.0);
        Bebida.setTamanho("500 ml");

        default: 
        System.out.println("Opcao Invalida");

           
    }
    
}

    @Override
    public String toString() {
      return "Lanche: " + Burger.getDescricao() + " Preço: " + Burger.getPreco() + " Gramas: " + Burger.getGramas() +
      "\nSobremesa: " + Sobremesa.getDescricao() + "Preço: " + Sobremesa.getPreco() + " Tamanho: " + Sobremesa.getTamanho() +
      "\nBebida: " + Bebida.getDescricao() + " Preço: " + Bebida.getPreco() + " Tamanho: " + Bebida.getTamanho();

    }


    
}
