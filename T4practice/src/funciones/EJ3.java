package funciones;

import java.util.Scanner;

public class EJ3 {

	//en este void se pedirán las cosas que queramos mostrar y las variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		num1= sc.nextInt();
		System.out.println("Introduce el número: ");
		num2= sc.nextInt();
		System.out.println("Introduce la opción que quieras ver: ");
		System.out.println("1=área");
		System.out.println("2=volumen");
		num3= sc.nextInt();
		
		//esto hace lo que tiene dentro
		cilindro(num1,num2,num3);
		
		sc.close();
	}
	
	//en este void se harán las operaciones del cilindro para saber su valores
	static void cilindro (int radio, int altura,int opcion) {
		int area,volumen;
		area= 2*(int)Math.PI * radio * (altura + radio);
		 volumen = (int)Math.PI * (radio*radio) * altura;
		 if(opcion==1) {
			 System.out.println(area);
		 }
		 if(opcion==2) {
			 System.out.println(volumen);
		 }
		 else {
			 System.out.println("ERROR");
		 }
	}
}
