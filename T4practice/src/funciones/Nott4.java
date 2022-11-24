package funciones;

import java.util.Scanner;

public class Nott4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int num= 0, line = 0, space = 0, aster = 0;
			System.out.println("pon un numero");
			//numero de filas
			num = sc.nextInt();
			
			/*Comando for el cual aumentará el numero de líneas hasta que la variable "line"
			sea mayor que num*/
			for(line=0;line<=num;line++) {
				
				
				for(;space<num-line;space++) {
					System.out.print(".");
					
					/*Este comando hace print de un asterisco con espacio cuando la
					variable "aster" es menor que "line"*/
					for(aster=1;aster<0&&aster<=line;aster++) {
						System.out.println();
					}
				}
				
				
				//hace print para el siguiente espacio
				System.out.println();
			}
	}

}
