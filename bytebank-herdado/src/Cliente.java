
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	//criando um construtor para relacionar com AutenticacaoUtil
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
