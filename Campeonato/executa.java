//package Campeonato;

public class executa {
	
	public static void main(String args[]) {
		implementa b = new implementa(); 
		b.pontos_time1 = 3;
		b.pontos_time2 = 2;
		
		System.out.println("Time 1: " + b.nome_time1(b.nome_time1("Altos")));
		System.out.println("Time 2: " + b.nome_time1(b.nome_time2("Figuerense")));
		System.out.print("Placar: " + b.placar(b.pontos_time1));
		System.out.print("X" + b.placar(b.pontos_time2)); 
	}
	
}
