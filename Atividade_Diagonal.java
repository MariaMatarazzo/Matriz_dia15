package Aula_15_05;

import java.util.Scanner;

public class Atividade_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		int m[][] = new int[4][4];
         int valor;
		//Entrada de dados

		for(int i=0; i<4; i++) {

			for (int j=0; j<4; j++) {

				valor= (int)Math.round(Math.random()*4);
				if ( i==j) {
                m[i] [j]=valor;
			}
			}
		}

		//Saída de dados

		for(int i=0; i<4; i++) {

			for(int j=0; j<4; j++) {

				System.out.print("|"+ m[i][j] + "|"+ " \t");
			}
			System.out.println();

		}

	}
}


