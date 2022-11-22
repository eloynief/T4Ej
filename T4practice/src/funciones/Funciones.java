package funciones;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Escribe el número de veces que va a decier Eco...");
		int num= sc.nextInt();
		eco(num);
		
		
	}
	
	static void eco(int veces) {
		for(;veces>0;veces--) {
		System.out.println("Eco...");
		}
		
	}

}
