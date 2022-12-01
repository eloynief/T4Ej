package sobrecarga;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double numa1,numb1,numab1, numa2,numb2,numc2,numabc2;
		
		System.out.println("Introduce el número numa1: ");
		numa1=sc.nextDouble();
		System.out.println("Introduce el número numb1: ");
		numb1=sc.nextDouble();
		System.out.println("Introduce el número numa2: ");
		numa2=sc.nextDouble();
		System.out.println("Introduce el número numb2: ");
		numb2=sc.nextDouble();
		System.out.println("Introduce el número numb2: ");
		numc2=sc.nextDouble();
		
		numab1=media(numa1,numb1);
		
		numabc2=media(numa2,numb2,numc2);
		
		System.out.println(numab1);
		System.out.println(numabc2);
	}
	static double media(double a1, double b1) {
		double media1;
		media1=(a1+b1)/2;
		return media1;
	}
	static double media(double a2,double b2,double c2) {
		double media2;
		media2=(a2+b2+c2)/3;
		return media2;
	}
}
