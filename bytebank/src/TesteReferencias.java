
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		//ao instanciar um objeto, apenas aponta-se o endere�o de mem�ria � inst�ncia
		
		Conta segundaConta = primeiraConta; // nesse caso, segundaConta n�o recebe o conte�do de primeiraConta,
											// mas sim, o endere�o de mem�ria de primeiraConta
		
		
		System.out.println("Saldo da Segunda conta: " + segundaConta.saldo);
		
		
		segundaConta.saldo += 100; //como segundaConta aponta para o mesmo endere�o de mem�ria que primeiraConta,
								   //ambas acabar�o ficando com o mesmo valor >> 400.0
		
		//tanto primeiraConta quanto segunda fazem refer�ncia ao mesmo OBJETO
		
		System.out.println("\nsegunda conta: " + segundaConta.saldo);
		System.out.println("primeira conta: " + primeiraConta.saldo);
		
		
		//Comprovando a teoria.. imprimindo o conte�do das inst�ncia
		
		System.out.println("\nEndere�o da primeira conta >>> " + primeiraConta);
		System.out.println("Endere�o da segunda conta >>> " + segundaConta);
		
	}
}
