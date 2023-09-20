public class fila {

    private String ImprimeDocumento;
    private String RemoveDocumento;
    private String RemoveTodosDocumentos;

    private static fila Fila; 

    private fila () {

    }
     
    public static fila getInstance() {
        if (Fila == null) {
            Fila = new fila();
        }
        return Fila; 
    }

    public String getImprimeDocumento(){
        return ImprimeDocumento; 
    }
    public void setImprimeDocumento (String imprimeDocumento){
        ImprimeDocumento = imprimeDocumento;
    }
    public String getRemoveDocumento(){
        return RemoveDocumento;
    }
    public void setRemoveDocumento(String removeDocumento){
        RemoveDocumento = removeDocumento;
    }
    public String getRemoveTodosDocumentos(){
        return RemoveTodosDocumentos;
    }
    public void setRemoveTodosDocumento(String removeTodosDocumentos){
        RemoveTodosDocumentos = removeTodosDocumentos;
    }
}