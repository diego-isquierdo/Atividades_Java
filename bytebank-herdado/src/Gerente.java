//Classe Gerente herda tudo de Funcionario
//classe tb conversa com interface 'autenticafvel' >> implements autenticavel
public class Gerente extends  Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public double getBonificacao() {
		//gerente ganhará a bonificação de gerente (01 salario) + um acréscimo de bonificação de funcionário
		
		return super.getSalario(); //super indica q o atribudo se refere à classe MÃE || this se refere à classe em questão
		//super tb se aplica para métodos
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
	
}
