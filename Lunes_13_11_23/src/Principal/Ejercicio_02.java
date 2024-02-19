package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce la temperatura : ");
		int temperatura = Integer.parseInt(br.readLine());
		
		if (temperatura < 0) {
			System.out.println("Temperatura bajo cero.");
		}
		br.close();
	}
}
