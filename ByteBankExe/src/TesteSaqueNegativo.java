
public class TesteSaqueNegativo {
	public static void main(String[] args) {
		ContaExe conta = new ContaExe();
		conta.deposita(100);
		if(conta.saca(50)) {
			System.out.println("Saque Realizado com sucesso!");
		}
		else {
			System.out.println("Saque n�o realizado! Saldo Insuficiente!");
		}
		
		
		System.out.println(conta.getSaldo());
		
		
		
		//System.out.println(conta.saldo);
		//como o saldo � 'private' n�o pode nem ser impresso.
		//eh necess�rio criar um metododentro da classe para imprimir o saldo
		
		
		//como 'saldo' esta como 'private', s� pode ser alterado pela pr�pria classe
		//ou seja, para sacar/depositar saldo na conta, s� pode ser feito pelo m�todo saca/deposita
		//conta.saldo = 300; 
	}
}
