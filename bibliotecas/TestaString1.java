package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String("Java ADS");
		String b = new String("Java ADS");
		//int a = 2;// tipo primitivo: comportamente eh diferente
		//int b = 2;
		if(a == b) {
			System.out.println("a e b sao iguais");
		}else {
			System.out.println("A e b sao objetos diferentes");
		}
	}
}
