package exercicio1;

public class SetorRH extends DepFinanceiro {

    private String responsavel; 
    private int func; 

    public void setRespinsavel (String responsavel){
        this.responsavel = responsavel; 
    } 
    public void setFunc(int func){
        this.func = func; 
    }

    public String getResponsavel (){
        return responsavel; 
    }
    public int getFunc(){
        return func; 
    }
    
    SetorRH(){
        setDespesas(500.000);
        System.out.println("Despesas: " + getDespesas()); 
    }
}
