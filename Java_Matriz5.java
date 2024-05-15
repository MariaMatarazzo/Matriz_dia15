package Aula_15_05;

import java.util.Scanner;

public class Java_Matriz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		int m[][] = new int[5][5];
		int filtro;
		int soma=0;


		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				filtro = (int)Math.round(Math.random()*4);

				if ( filtro%2==0) {
					m[i][j]=filtro;
					soma= soma+	m[i][j];
				}

			}
		}

		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
		System.out.println(" | " + m[i][j] + " | ");

			}
		}
		System.out.println(">>>>>>>>>>>>>As somas são:  " + soma);
	}
}














