
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela);
		
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.cpf = "001.333.310-12";
		
		System.out.println("Nome: " + contaDaMarcela.titular.nome + "\nCPF -" + contaDaMarcela.titular.cpf);
	}
}
