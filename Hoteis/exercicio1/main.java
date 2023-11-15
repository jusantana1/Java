package exercicio1;

public class main  {

    public static void main (String args []) {

        RedeHotelaria a = new RedeHotelaria();
        SetorRH c = new SetorRH();
        Almoxarifado d = new Almoxarifado(); 

        a.setHotel("Ibis");
        a.setQnt(102);

        System.out.println("Nome Hotel: " + a.getHotel());
        System.out.println("Quantidade de Redes: " +a.getQnt());

        c.setFunc(65);
        c.setRespinsavel("Érica");

        System.out.println("Quantidade de funcionarios: " + c.getFunc());
        System.out.println("Responsavel RH: " + c.getResponsavel());

        
        d.setMaterial("Papel");
        
        System.out.println("Material: " + d.getMaterial()); 
    }
    
}
