package SetGet;

public class Informa_dados {
	public static void main (String args []) {

		Dados_Contribuinte a = new Dados_Contribuinte();

		String nm = JOptionPane.showInputDialog ("Digite o nome do contribuinte: ");
		String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
		String cnpj = JOptionPane.showInputDialog("Digite o CNPJ: ");
		String ct = JOptionPane.showInputDialog ("Digite o cartao:" );


		a.setNome (nm);
		a.setCpf (cpf);
		a.setCnpj (cnpj);
		a.setCartao (ct);

		
		System.out.println("Nome do Contribuinte: " + a.getNome());
		System.out.println("CPF: " + a.getCpf());
		System.out.println("CNPJ: " + a.getCnpj());
		System.out.println("Cartao: " + a.getCartao());

	}

}
