package english;

import java.util.Scanner;

public class Ej1 {
	
	public static void main(String[] args) {
		double kg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a number: ");
		kg=sc.nextDouble();
		
		System.out.println(operation(kg));
	}
	static double operation(double calc) {
		double pounds;
		pounds=calc*2.205;
		return pounds;
	}
}
