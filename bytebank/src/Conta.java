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
	
	//criando um método - deposita >> acrescenta $$ ao valor 
	//se usa VOID (vazio) quando não se espera retorno, apenas quer executar uma ação
	public void deposita(double valor) {
		
		//this - desta conta - auxilia na atribuição quando for 'invocado'
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
	
	
	//metodo transfere >> utilizando instância do tipo Conta
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			/* 02 formas de fazer.. direto pela Conta destino
			destino.saldo += valor;*/
			
			//ou utilizando outro método criado
			destino.deposita(valor);
			
			return true;
		}
		
		//else não seria necessário pois no 'ruturn' do 'if', o codigo pararia
		/*else {
			return false;
		}*/
		return false;
	}

}
