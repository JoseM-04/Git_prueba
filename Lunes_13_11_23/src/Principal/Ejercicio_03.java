package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce el valor de x : ");
		int num = Integer.parseInt(br.readLine());
		
		if (num == 10) {
			System.out.println("Numero igual a 10");
		}
		br.close();
	}
}
