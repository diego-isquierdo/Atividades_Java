
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		//ao instanciar um objeto, apenas aponta-se o endereço de memória à instância
		
		Conta segundaConta = primeiraConta; // nesse caso, segundaConta não recebe o conteúdo de primeiraConta,
											// mas sim, o endereço de memória de primeiraConta
		
		
		System.out.println("Saldo da Segunda conta: " + segundaConta.saldo);
		
		
		segundaConta.saldo += 100; //como segundaConta aponta para o mesmo endereço de memória que primeiraConta,
								   //ambas acabarão ficando com o mesmo valor >> 400.0
		
		//tanto primeiraConta quanto segunda fazem referência ao mesmo OBJETO
		
		System.out.println("\nsegunda conta: " + segundaConta.saldo);
		System.out.println("primeira conta: " + primeiraConta.saldo);
		
		
		//Comprovando a teoria.. imprimindo o conteúdo das instância
		
		System.out.println("\nEndereço da primeira conta >>> " + primeiraConta);
		System.out.println("Endereço da segunda conta >>> " + segundaConta);
		
	}
}
