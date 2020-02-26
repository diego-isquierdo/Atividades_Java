
public class FuncionarioBase {
	private String nome;
	private String cpf;
	protected double salario;
	
	//construtor funcionario
	public FuncionarioBase() {
		
	}
	
	public double getBonificacao() {
		return this.salario *0.1;
	}
	
	public void setNome(String nomeSet) {
		this.nome = nomeSet;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String cpfSet) {
		this.cpf = cpfSet;
	}
	public String getCPF() {
		return this.cpf;
	}
	
	public void setSalario(double salarioSet) {
		this.salario = salarioSet;
	}
	public double getSalario() {
		return this.salario;
	}
}
