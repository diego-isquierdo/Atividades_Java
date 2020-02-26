

//classe abstrata - não se pode mais instanciar com essas classe 
public abstract class Funcionario {
	private String nome;
	private String cpf;
	//protected double salario; //protecte >> atributo 'visivel' para a classe e 'classes filhos'
	private double salario;
	private int tipoFuncionario = 0; // 0 - Funcionario comum || 1 - Gerente || 2 - Diretor
	
	
	//construtor funcionario
	public Funcionario() {
		
	}
	
	//Geters e Seters
	public void setTipofuncionario (int tipo) {
		this.tipoFuncionario = tipo;
	}
	public int getTipoFuncionario() {
		return this.tipoFuncionario;
	}
	
	//metodo abstrato >> controle eh feito pelas classes filhas
	//obriga às classes filhas a implementarem o metodo getBonificacao() 
	public abstract double getBonificacao();
	
	
	
	/*Bonificação varia de acordo com o cargo
	public double getBonificacao() {
		return this.salario *0.1;
		/*if(this.tipoFuncionario == 0) { //0 - Funcionario comum
			return this.salario *0.1;
		}
		else if(this.tipoFuncionario == 1) { //1 - Gerente
			return this.salario;
		}
		else {
			return this.salario + 1000.0;
		}
	}*/
	//
	public void setNome(String nomeSet) {
		this.nome = nomeSet;
	}
	public String getNome() {
		return this.nome;
	}
	//
	public void setCPF(String cpfSet) {
		this.cpf = cpfSet;
	}
	public String getCPF() {
		return this.cpf;
	}
	//
	public void setSalario(double salarioSet) {
		this.salario = salarioSet;
	}
	public double getSalario() {
		return this.salario;
	}
}
