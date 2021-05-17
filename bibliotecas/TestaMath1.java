package bibliotecas;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class TestaMath1 {
 public static void main(String [] args) {
	 int i = -10;
	 System.out.println(i);
	 int j = Math.abs(i);
	 System.out.println(j);
	 
	 double d1 = 4.49999;
	 System.out.println(d1);
	 double d2 = 4.000;
	 System.out.println(d2);
	 double d3 = Math.round(d1);
	 System.out.println(d3);
	 
	 double d4 = Math.max(d1, d3);
	 System.out.println(d4);
	 
	 //tarefa
	 //implementar e testar math.min()
	 
	 //funcoes ceil e floor
	 System.out.println(Math.ceil(d1));
	 double d5 = 4.999999;
	 System.out.println(Math.ceil(d1));
	 
	 //implememtar testamatch2> math.exp, math.log, math.pow
	 //math.sqrt, log de a na base b,
	 //<implementar testamacth3> e ver a diferença de math.sin e math.toDegress, math.toRadians
	 
	 
	 
 }
}
