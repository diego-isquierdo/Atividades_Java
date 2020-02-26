
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 50;
		
		//chamando metodo 'deposita'
		contaDoPaulo.deposita(100);
		
		//chamando metodo saca >> o 'boolean que retorna, term seu uso opcional
		/*boolean conseguiuSacar = contaDoPaulo.saca(200);
		
		
		//testa se houve saque ou não
		if (conseguiuSacar){
			System.out.println("Saque realizado com sucesso!");
		}
		else {
			System.out.println("Saque não realizado. Saque indisdponível!");
		}*/
		
		//System.out.println("Saldo do Paulo é: R$" + contaDoPaulo.saldo);
		
		//criando a conta que fará a transferência
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean testaTranseferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if (testaTranseferencia) {
			System.out.println("Transferência Realizada com Sucesso!!");
		}
		else {
			System.out.println("Transferência Não Realizada! Slado insuficiente!");
		}
		
		System.out.println("Saldo do Paulo é: R$" + contaDoPaulo.saldo);
		System.out.println("Saldo da Marcela é: R$" + contaDaMarcela.saldo);
		
		//preenchendo o atributo 'titular'
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}
}
