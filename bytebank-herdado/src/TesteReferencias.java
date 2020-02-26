
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		/* Funcion�rio passou a ser 'abstract'
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
		f1.setNome("Paulo");*/
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Pedro");
		ev1.setSalario(2500);
		
		Designer ds1 = new Designer();
		ds1.setNome("Ana");
		ds1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f1);
		controle.registra(ev1);
		controle.registra(ds1);
		
		System.out.println(g1.getTipoFuncionario());
		
		System.out.println("Bonifica��o do Gerenete " + g1.getNome() + " �: R$" + g1.getBonificacao());
		//System.out.println("Bonifica��o do Funcionario " + f1.getNome() + " �: R$" + f1.getBonificacao());
		System.out.println("Bonifica��o do Editor de V�deo " + ev1.getNome() + " �: " + ev1.getBonificacao());
		System.out.println("Bonifica��o do Designer " + ds1.getNome() + " � " + ds1.getBonificacao());
		System.out.println("Bonifica��o Total � de " + controle.getSoma());
	}
}
