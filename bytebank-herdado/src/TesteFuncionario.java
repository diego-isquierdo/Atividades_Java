import java.io.ObjectInputStream.GetField;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCPF("123.456.789-12");
		nico.setSalario(3000);
		
		Funcionario f1 = new Gerente();
		
		System.out.println("Nome: " + nico.getNome() + "\nCPF: " + nico.getCPF() + "\nSalario: " + nico.getSalario());
		System.out.println("Bonificação: " + nico.getBonificacao());
	}
}
