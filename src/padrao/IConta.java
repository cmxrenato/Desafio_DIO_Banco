package padrao;

public interface IConta {
	 void sacar(double valor); 
		//Não faz sentido escrever a palavra public
	 //porque toda interface é pública.
	
	 void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato();
	 
		
	
}
