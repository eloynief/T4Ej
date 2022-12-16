package funni;

import java.util.Scanner;

public class Funni {
	/*static int ficha(int fichaj1, int fichaj2) {
	int fichas=fichaj1+fichaj2;
	return fichas/2;
}*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dumb;
		System.out.println("write a nubmer: ");
		dumb=sc.nextInt();
		
		
		System.out.println();
		//interaccion en el otro archivo
		Funni2.shit=sc.nextInt();
		
		Funni2 s= new Funni2();
		s.sax(dumb);
		
	}
	public static void at(int so) {
	while (so<10) {
		System.out.println("hi");
		so++;
		}
	}
}
