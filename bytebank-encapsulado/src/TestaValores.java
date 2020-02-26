
public class TestaValores {
	public static void main(String[] args) {
		//Conta conta = new Conta(); >> construtor criado, agora existem regras
		
		//deve-se agora informar 'agencia' e 'conta'
		Conta conta = new Conta(4529, 141889);
		Conta conta2 = new Conta(3346, 505448);
		Conta conta3 = new Conta(2234, 664548);
		
		//System.out.println("Total de contas é: "+ Conta.totalContas); >> funcionaria se o 'totalContas' não fosse 'private' >> será feito por 'get'
		
		System.out.println("Total de contas é: " + Conta.getTotal());		
	}
}
