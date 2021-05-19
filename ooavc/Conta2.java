package ooavc;

public class Conta2 {

	int numero;
	Cliente cliente;
	double saldo;
	double limite;
	
	
	public Conta2(int numero, Cliente cliente, double saldo, double limite) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {
		//saldo=saldo-valor;
		if(valor>this.saldo+this.limite) {
			return false;
		}else {
			this.saldo=this.saldo-valor;
			return true;
		}
	}
	
	public int getNumero() {
		return numero;
	}

	void depositar(double valor) {
		saldo=saldo+valor;
	}
}
