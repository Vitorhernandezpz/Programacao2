package ooavc;

public class TestaConta {

	public static void main(String[] args) {
		//Conta c1 = new Conta();
		Conta c1 = new ContaPoupança();
		
		c1.numero = 001;
		c1.nome = "Vitor";
		c1.saldo = 1000;
		c1.limite = 100;
		
		System.out.println("numero da conta: "+ c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo: "+ c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		double valorSaque = 2000;
		boolean resultado = c1.sacar(valorSaque);
		if(resultado) {
			System.out.println("Voce sacou R$"+valorSaque);
		}
		else {
			System.out.println("Saque não autorizado, valor acima do possivel");
		}
	}

}
