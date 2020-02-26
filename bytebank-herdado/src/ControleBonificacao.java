
public class ControleBonificacao {
	
	private double soma;
	
	//o mestodo da classe pai pode ser acessado pelas classes filhas
	//sem mudança no codigo em virtude o POLIMORFISMO
	//verifica bonificacao do funcionario
	public void registra (Funcionario fAux) {
		double boni = fAux.getBonificacao();
		this.soma += boni;
	}
	
	
	//metodos criados para as classes filhas
	/*verifica bonificacao do Gerente
	public void registra(Gerente gAux) {
		double boni = gAux.getBonificacao();
		this.soma += boni;
	}*/
	
	/*verifica bonificacao do Editor de Vídeo
	public void registra (EditorVideo evAux) {
		double boni = evAux.getBonificacao();
		this.soma += boni;
	}*/
	
	
	public double getSoma() {
		return soma;
	}
}
