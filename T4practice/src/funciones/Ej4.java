package funciones;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1,num2, resultado;
		
		System.out.println("Introduce el número: ");
		num1= sc.nextInt();
		System.out.println("Introduce el número: ");
		num2= sc.nextInt();
		
		
		resultado=maksimo(num1,num2);
		System.out.println(resultado);
	}
	//el nombre es aún un placeholder, lo cambiaré más adelante
	
	static int/*<-está buscando un int*/ maksimo(int numa,int numb) {
		int max;
		if(numa>numb) {
			max=numa;
		}
		else {
			max=numb;
		}
		
		
		//return hace que la variable que tengas se sustituya con el int anterior
		return max;
	}
}
