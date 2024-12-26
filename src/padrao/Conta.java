package padrao;


public abstract class Conta implements IConta {
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	public void imprimirInfosComuns() {
		System.out.println("Cliente: "+this.cliente.getNome());
		System.out.println("Agencia: "+this.agencia);
		System.out.println("Numero: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
	}
	
	  @Override
	    public String toString() {
	        return "Conta{" +
	        		"Agencia="+ agencia+
	                "numero=" + numero +
	                ", titular='" + cliente.getNome()+ '\'' +
	                ", saldo=" + saldo +
	                '}';
	    }
	
   
}
