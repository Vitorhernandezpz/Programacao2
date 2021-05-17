package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteException2 {
	public static void main(String[] args)throws IOException {
		try {
			new FileReader("C://arquivoDeTeste.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
