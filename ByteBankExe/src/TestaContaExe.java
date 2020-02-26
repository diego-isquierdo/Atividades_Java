
public class TestaContaExe {
	public static void main(String[] args) {
		ContaExe contaDoDiego = new ContaExe();
		contaDoDiego.titular.nome = "Diego Isquierdo";
		contaDoDiego.titular.cpf = "222.222.222-33";
		contaDoDiego.titular.enderco.logradouro = "Rua Guanabara s/n";
		contaDoDiego.deposita(100);
		//contaDoDiego.saldo = 100;
		
		System.out.println("Nome: " + contaDoDiego.titular.nome + "\nCPF: " + contaDoDiego.titular.cpf);
		
		contaDoDiego.deposita(500);
		contaDoDiego.saca(50);
		
		ContaExe contaDaLisi = new ContaExe();
		contaDaLisi.titular.nome = "Lisi Isquierdo";
		contaDaLisi.titular.cpf = "33.333.444.42";
		
		boolean testaTransferencia = contaDoDiego.transfere(2000, contaDaLisi);
		if (testaTransferencia) {
			System.out.println("\nTransferência concluída com Sucesso!\n");
		}
		else {
			System.out.println("\nTransferência não efetuada! Saldo Insufiente!");
		}
		
		/*System.out.println("\nSaldo do Diego: R$" + contaDoDiego.saldo);
		System.out.println("Saldo da Lisi: R$:" + contaDaLisi.saldo);*/
		
	}
}
