package Matrices;

import java.util.Scanner;

public class matrices {

	public static void main(String[] args) {
		//Declaracion de matrices
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el tamaño de la matriz: filas ");
		int cantFilasA = sc.nextInt();
		System.out.print("Ingrese el tamaño de la matriz: columnas ");
		int cantColumnasA = sc.nextInt();
		
		System.out.print("Ingrese el tamaño de la matrizb: filas ");
		int cantFilasB = sc.nextInt();
		System.out.print("Ingrese el tamaño de la matrizb: columnas ");
		int cantColumnasB = sc.nextInt();
		
		if((cantFilasA == cantFilasB) && (cantColumnasA == cantColumnasB)) {
			int [][] matrizA = new int[cantFilasA][cantColumnasA]; //2filas y 2columnas
			int [][] matrizB = new int[cantFilasB][cantColumnasB];
			int cantFilassuma = cantFilasA;
			int cantColumnassuma = cantColumnasA;
			int [][] suma = new int[cantFilasA][cantColumnasA];
			//Ingresar datos de la matriz
			
			System.out.println("Ingrese los datos de la matriz A");
			for(int i = 0; i < cantFilasA; i++) { //para recorrer las filas
				for(int j = 0 ; j < cantColumnasA; j++) { //para recorrer las clumnas
					System.out.print("Dato(" + i + " , " + j + ") = ");
					matrizA[i][j] = sc.nextInt();
				}
			}
			System.out.println("Ingrese los datos de la matriz B");
			for(int i = 0; i < cantFilasB; i++) { //para recorrer las filas
				for(int j = 0 ; j < cantColumnasB; j++) { //para recorrer las clumnas
					System.out.print("Dato(" + i + " , " + j + ") = ");
					matrizB[i][j] = sc.nextInt();
				}
			}
			
			//sumar los elementos de la matrices
			for(int i = 0; i < cantFilassuma; i++) {
				for(int j = 0; j < cantColumnassuma; j++) {
					suma[i][j] = matrizB[i][j] + matrizB[i][j];
			}
				System.out.println();
		  }		
			//Mostrar datos de la matriz
			System.out.println("Los datos de la matrizB son: ");
			for(int i = 0; i < cantFilassuma; i++) {
				for(int j = 0; j < cantColumnassuma; j++) {
					System.out.print( suma[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Las matrices no son compatibles");
		}
		
		System.out.println("Fin del programa");
		
		}
	
	}




