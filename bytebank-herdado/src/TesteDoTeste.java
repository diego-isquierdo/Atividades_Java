
public class TesteDoTeste {
	public static void main(String[] args) {
		/* Funcion�rio passou a ser 'abstract'
		Funcionario seuJoao = new Funcionario();*/
		Gerente seuJoao = new Gerente();
		seuJoao.setSalario(3000.0);
		System.out.println("Funcion�rio tipo " + seuJoao.getTipoFuncionario());
		System.out.println("Bonifica��o - " + seuJoao.getBonificacao());
		
		/*tb alterado p causa de Funcionario abstract 
		Funcionario DrFodao = new Funcionario();*/
		EditorVideo juninho = new EditorVideo();
		juninho.setTipofuncionario(2);
		juninho.setSalario(5000.0);
		System.out.println("\nFuncion�rio tipo " + juninho.getTipoFuncionario());
		System.out.println("Bonifica��o - " + juninho.getBonificacao());
	}
}
