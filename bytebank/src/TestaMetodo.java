
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 50;
		
		//chamando metodo 'deposita'
		contaDoPaulo.deposita(100);
		
		//chamando metodo saca >> o 'boolean que retorna, term seu uso opcional
		/*boolean conseguiuSacar = contaDoPaulo.saca(200);
		
		
		//testa se houve saque ou n�o
		if (conseguiuSacar){
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque n�o realizado. Saque indisdpon�vel!");
		}*/
		
		//System.out.println("Saldo do Paulo �: R$" + contaDoPaulo.saldo);
		
		//criando a conta que far� a transfer�ncia
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean testaTranseferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if (testaTranseferencia) {
			System.out.println("Transfer�ncia Realizada com Sucesso!!");
		}
		else {
			System.out.println("Transfer�ncia N�o Realizada! Slado insuficiente!");
		}
		
		System.out.println("Saldo do Paulo �: R$" + contaDoPaulo.saldo);
		System.out.println("Saldo da Marcela �: R$" + contaDaMarcela.saldo);
		
		//preenchendo o atributo 'titular'
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}
}
