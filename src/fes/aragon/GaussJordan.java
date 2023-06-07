package fes.aragon;

import java.util.Scanner;
	
	public class GaussJordan {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("PROGRAMA HECHO POR 'SARE'\n");
	        System.out.println("CALCULADORA DE MATRICES POR GAUSS JORDAN");
	        
	        System.out.print("\nPor favor ingrese el número de filas de la matriz →: ");
	        int filasM = scanner.nextInt();

	        System.out.print("\nPor favor Ingrese el número de columnas de la matriz ↓: ");
	        int columnasM = scanner.nextInt();

	        double[][] matrizM = new double[filasM][columnasM + 1];

	        System.out.println("\nPor favor ingrese los valores de la matriz");
	        for (int i = 0; i < filasM; i++) {
	            for (int j = 0; j < columnasM; j++) {
	                System.out.print("\nIngrese el valor en la posición de la matriz [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matrizM[i][j] = scanner.nextDouble();
	            }

	            System.out.print("\nIngrese la constante en la posición de la matriz [" + (i + 1) + "][" + (columnasM + 1) + "]: ");
	            matrizM[i][columnasM] = scanner.nextDouble();
	        }

	        System.out.println("\nMatriz introducida por el usuario:\n");
	        ResolverMatriz.imprimirMatriz(matrizM);

	        ResolverMatriz.resolverMatriz(matrizM);

	        System.out.println("---------------\n");
	        ResolverMatriz.imprimirPasos(matrizM);

	        double[] resultadosM = ResolverMatriz.obtenerResultados(matrizM);
	        System.out.println("La solucion es:");
	        ResolverMatriz.imprimirResultados(resultadosM);
	    }
	}

