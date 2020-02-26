
public class TesteSaqueNegativo {
	public static void main(String[] args) {
		ContaExe conta = new ContaExe();
		conta.deposita(100);
		if(conta.saca(50)) {
			System.out.println("Saque Realizado com sucesso!");
		}
		else {
			System.out.println("Saque não realizado! Saldo Insuficiente!");
		}
		
		
		System.out.println(conta.getSaldo());
		
		
		
		//System.out.println(conta.saldo);
		//como o saldo é 'private' não pode nem ser impresso.
		//eh necessário criar um metododentro da classe para imprimir o saldo
		
		
		//como 'saldo' esta como 'private', só pode ser alterado pela própria classe
		//ou seja, para sacar/depositar saldo na conta, só pode ser feito pelo método saca/deposita
		//conta.saldo = 300; 
	}
}
