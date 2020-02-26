//Classe abstrata NÃO é obrigada a implementar método concreto
//classe criada para ser intermediária entre 'Funcionario' e 'Gerente/Administrador'

//Convertenten classe autenticacel em interface
//interface mão pode possuir nada concreto, como 'metodos' e 'atributos'


//contrato autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel  {
	//metodos abstratos e 'não concretos - assinaturas'
	public void setSenha(int senha);
	public abstract boolean autentica(int senha);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
//ignorando todos os itens concretos 	
/*private int senha;	
	
	
	public boolean autentica (int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	public boolean autenticaSenha (int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}*/

