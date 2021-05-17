package bibliotecas;

public class Testamath3 {

	public static void main(String[] args) {
		
		// seno de 90
		System.out.println(Math.round(Math.sin(90)));
		
		//180º em radianos
		double x = 180.0;
		double resultado = Math.toRadians(x);
        System.out.println(resultado);
        
        System.out.println(Math.toDegrees(resultado));
	}

}
