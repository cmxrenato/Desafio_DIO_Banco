package padrao;

public class BancoMain {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Cliente cliente = new Cliente("Renato");
			
			Conta cc = new ContaCorrente(cliente);
			Conta cp = new ContaPoupanca(cliente);
		
			
			
			
			cp.depositar(100.0);
			cp.sacar(50.0);
			cp.transferir(25, cc);
			cc.depositar(250.0);
			
			cc.imprimirExtrato();
			cp.imprimirExtrato();
			
		}


		
	}


