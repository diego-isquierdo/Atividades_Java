//Classe Gerente herda tudo de Funcionario
//classe tb conversa com interface 'autenticafvel' >> implements autenticavel
public class Gerente extends  Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	public double getBonificacao() {
		//gerente ganhar� a bonifica��o de gerente (01 salario) + um acr�scimo de bonifica��o de funcion�rio
		
		return super.getSalario(); //super indica q o atribudo se refere � classe M�E || this se refere � classe em quest�o
		//super tb se aplica para m�todos
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
