
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(1200);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
