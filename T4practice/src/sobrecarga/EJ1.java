package sobrecarga;

import java.util.Scanner;

public class EJ1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numa1,numb1,numab1;
		double numa2,numb2,numab2;
		
		System.out.println("Introduce el número numa1: ");
		numa1=sc.nextInt();
		System.out.println("Introduce el número numb1: ");
		numb1=sc.nextInt();
		System.out.println("Introduce el número numa2: ");
		numa2=sc.nextDouble();
		System.out.println("Introduce el número numb2: ");
		numb2=sc.nextDouble();
		
		
		numab1=suma(numa1,numb1);
		
		numab2=suma(numa2,numb2);
		
		System.out.println(numab1);
		System.out.println(numab2);
	}
	/**
	 * 
	 * @param a1
	 * @param b1
	 * @return
	 */
	static int suma(int a1, int b1) {
		int suma1;
		suma1=a1+b1;
		return suma1;
	}
	/**
	 * 
	 * @param a2
	 * @param b2
	 * @return
	 */
	static double suma(double a2,double b2) {
		double suma2;
		suma2=a2+b2;
		return suma2;
	}
	

}
