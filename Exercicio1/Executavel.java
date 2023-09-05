package Exercicio1;

import Exercicio1.Plano_Ensino;

public class Executavel {

    public static void main (String args []) {
        Plano_Ensino a = new Plano_Ensino (); 

        Plano_Ensino b = new Plano_Ensino (); 
        b.setMateria("Programação Orientada a Objetos");
        b.setConteudo("Metodo Construtor");
        b.setBibliografia("eu");
        b.setAvaliacao("prova");
        System.out.println("Nome da materia: " + b.getMateria());
        System.out.println("Conteudo: " + b.getConteudo());
        System.out.println("Bibliografia: " + b.getBibliografia());
        System.out.println("Metodo de Avaliação: " + b.getAvaliacao());      

    }
    
}
