/*tipo conta: 
	saldo
	agencia
	numero
	titular*/

//criando classe 'Conta'
public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//criando um m�todo - deposita >> acrescenta $$ ao valor 
	//se usa VOID (vazio) quando n�o se espera retorno, apenas quer executar uma a��o
	public void deposita(double valor) {
		
		//this - desta conta - auxilia na atribui��o quando for 'invocado'
		this.saldo += valor;
				
	}
	
	//metodo 'saca' alura >> boolean para saque - true ou false
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//metodo transfere >> utilizando inst�ncia do tipo Conta
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			/* 02 formas de fazer.. direto pela Conta destino
			destino.saldo += valor;*/
			
			//ou utilizando outro m�todo criado
			destino.deposita(valor);
			
			return true;
		}
		
		//else n�o seria necess�rio pois no 'ruturn' do 'if', o codigo pararia
		/*else {
			return false;
		}*/
		return false;
	}

}
