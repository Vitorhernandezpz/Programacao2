package excecoes;

import java.io.InputStreamReader;
import java.io.IOException;

public class TesteException3 {
	private static InputStreamReader conn;

	public static void main(String[] args) {
		
		try {
			
		}finally {
			conn.close();
		}
	}

}
