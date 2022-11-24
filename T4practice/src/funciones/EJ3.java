package funciones;

import java.util.Scanner;

public class EJ3 {

	//en este void se pedirán las cosas que queramos mostrar y las variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		cilindro();
		radio= sc.nextInt();
		altura= sc.nextInt();
		
	}
	
	//en este void se harán las operaciones del cilindro para saber su valores
	void cilindro (int opcion, int radio, int altura) {
		int area,volumen;
		area= 2*(int)Math.PI * radio * (altura + radio);
		 volumen = (int)Math.PI * (radio*radio)* (int)Math.PI * altura;
	}
}
