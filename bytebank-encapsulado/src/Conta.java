
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0; //contador de contas do construtor 'new Conta'
	//STATIC >> faz com que o atributo seja da classe ao invés do objeto >> meio que "variável global"
	
	
	//CONSTRUTOR >> 'rotina de inicializa' itpo 'Conta' invocada pelo 'new'
	/*public Conta() {
		
	}*/
	//incializa o tipo public 'obrigando' que alguns itens sejam SETados
	public Conta(int agencia, int numero) {
		Conta.totalContas ++;
		//System.out.println("Total de contas abertas é: " + totalContas);
		
		//filtro p evitar agencia e conta negativos ou zero
		if (agencia <= 0) {
			System.out.println("ERRO!! Numero de Agência Inválido!!\n");
			return;
		}
		else{
			this.agencia = agencia;
		}
		if(numero <= 0) {
			System.out.println("ERRO!! Número de Conta Inválido!!\n");
			return;
		}
		else{
			this.numero = numero;
		}
		System.out.println("Criando uma conta - Ag " + this.agencia + " || C/C - " + this.numero);
	}
	
	
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
	
	public boolean transfere (double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}
		return false;
	}
	
	//metodo para imprimir o saldo (que é 'private')
	
	//Uilizando 'get' e 'set' como metodos para ler e secrever numeros
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	//escrevendo e lendo o 'numero da conta'
	public void setNumero(int numero) {
		if (numero <= 0) {
			//filtro contra numeros negativos ou zero
			System.out.println("ERRO! Valor informado não é válido!");
			return;
		}
		else {
			this.numero = numero;
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//escrevendo e lendo o 'numero da agencia'
	public void setAgencia(int numero) {
		if(numero <= 0) {
			//filtro contra numeros negativos ou zero
			System.out.println("ERRO! Valor informado não é válido!");
			return;
		}
		else{
			this.agencia = numero;
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	
	//escrevendo e lendo nome do 'titular'
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//'static' para associar o 'get' à classe toda
	public static int getTotal() {
		return Conta.totalContas;
	}	
}


