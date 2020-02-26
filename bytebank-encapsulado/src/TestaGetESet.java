
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(4529, 140995);
		
		conta.setNumero(1337);
		conta.setAgencia(1154);
		
		Cliente paulo = new Cliente();
		//paulo.titular = "Paulo"; >> acesso private >> only by metods Class Conta
		
		
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		//seguindo a sequencia conta >> titular >> nome || por serem 'private' acesso por metodos em cascata
		System.out.println(conta.getTitular().getNome());
		
		//alteração tb podem ser feitas em cascata
		conta.getTitular().setProfissao("Programador");
		
		//utilizando variavel temp
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(titularDaConta.getProfissao());
	}
}
