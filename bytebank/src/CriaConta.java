
public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); //instanciando a instancia 'primeiraConta' do tipo 'Conta'
			
		primeiraConta.saldo = 200;
		//System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		//System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(); //instanciando a instancia 'segundaConta' do tipo 'Conta'
		segundaConta.saldo = 50;
		
		
		primeiraConta.agencia = 146;
		System.out.println("\nPrimeira conta - Ag�ncia: " + primeiraConta.agencia);
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Primeira Conta - N�mero: " + primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("\nSegunda conta - Ag�ncia: " + segundaConta.agencia);
		System.out.println("Segunda Conta tem: "  + segundaConta.saldo);
		System.out.println("Segunda conta - N�mero: " + segundaConta.numero);
		
		System.out.println("Endere�o da primeira conta: " + primeiraConta);
		System.out.println("Endere�o da segunda conta: " + segundaConta);
		
	}
}
