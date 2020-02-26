
public class ContaExe {
	//utlizando 'private' restringi-se o acesso ao atributo pela própria classe
	//este processo eh encapsulamento
	private double saldo;
	ClienteExe titular = new ClienteExe();
	int agencia;
	int numero;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere (double valor, ContaExe contaDestino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}
		return false;
	}
	
	//metodo para imprimir o saldo (que é 'private')
	public double getSaldo() {
		return this.saldo;
	}
}
