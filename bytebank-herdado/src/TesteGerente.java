
public class TesteGerente {
	public static void main(String[] args) {
		
		//
		Autenticavel referencia = new Cliente(); 
		
		Gerente g1 = new Gerente();
		g1.setNome("Diego");
		g1.setCPF("123.456.789-32");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCPF());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123456);
		boolean autenticou = g1.autentica(123456);
		
		//g1.salario = 300;
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
	}
}
