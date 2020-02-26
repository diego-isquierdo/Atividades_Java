
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		/* Funcionário passou a ser 'abstract'
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
		
		System.out.println("Bonificação do Gerenete " + g1.getNome() + " é: R$" + g1.getBonificacao());
		//System.out.println("Bonificação do Funcionario " + f1.getNome() + " é: R$" + f1.getBonificacao());
		System.out.println("Bonificação do Editor de Vídeo " + ev1.getNome() + " é: " + ev1.getBonificacao());
		System.out.println("Bonificação do Designer " + ds1.getNome() + " é " + ds1.getBonificacao());
		System.out.println("Bonificação Total é de " + controle.getSoma());
	}
}
