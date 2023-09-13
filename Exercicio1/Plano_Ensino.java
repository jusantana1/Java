package Exercicio1; // metodo construtor / get set 

public class Plano_Ensino {

private String materia;
private String conteudo;
private String bibliografia;
private String avaliação; 


Plano_Ensino () {} // metodo construtor 

public void setMateria(String materia) {
		this.materia = materia; 
}

public void setConteudo (String conteudo){
    this.conteudo = conteudo; 
}

public void setBibliografia (String bibliografia) {
    this.bibliografia  = bibliografia;
}

public void setAvaliacao (String avaliacao){
    this.avaliação = avaliacao; 
}

public String getMateria() {
		return materia;
}

public String getConteudo () {
    return conteudo; 
}

public String getBibliografia (){
    return bibliografia;
}

public String getAvaliacao () {
    return avaliação; 
}

}