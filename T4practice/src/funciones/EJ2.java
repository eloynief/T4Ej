package funciones;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num,num2;
		System.out.println("Escribe el primer número:");
		num= sc.nextInt();
		
		System.out.println("Escribe el segundo número:");
		num2= sc.nextInt();
		entre(num,num2);
		
		
	}
	static void entre(int inicio,int fin) {
		for(int cambio=inicio;cambio<=fin;cambio++) {
		System.out.println(cambio);	
		}
	}

}
