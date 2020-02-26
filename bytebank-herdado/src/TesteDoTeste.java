
public class TesteDoTeste {
	public static void main(String[] args) {
		/* Funcionário passou a ser 'abstract'
		Funcionario seuJoao = new Funcionario();*/
		Gerente seuJoao = new Gerente();
		seuJoao.setSalario(3000.0);
		System.out.println("Funcionário tipo " + seuJoao.getTipoFuncionario());
		System.out.println("Bonificação - " + seuJoao.getBonificacao());
		
		/*tb alterado p causa de Funcionario abstract 
		Funcionario DrFodao = new Funcionario();*/
		EditorVideo juninho = new EditorVideo();
		juninho.setTipofuncionario(2);
		juninho.setSalario(5000.0);
		System.out.println("\nFuncionário tipo " + juninho.getTipoFuncionario());
		System.out.println("Bonificação - " + juninho.getBonificacao());
	}
}
