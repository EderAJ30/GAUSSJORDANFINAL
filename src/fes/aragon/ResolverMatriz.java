package fes.aragon;

public class ResolverMatriz {
	public static void resolverMatriz(double[][] matriz) {
        int filasR = matriz.length;
        int columnasR = matriz[0].length;

        for (int i = 0; i < filasR; i++) {
            // Encontrar el eje máximo en la columna actual
            int pivoteMaximo = i;
            for (int j = i + 1; j < filasR; j++) {
                if (Math.abs(matriz[j][i]) > Math.abs(matriz[pivoteMaximo][i])) {
                    pivoteMaximo = j;
                }
            }

            // Intercambiar filas
            double[] temp = matriz[i];
            matriz[i] = matriz[pivoteMaximo];
            matriz[pivoteMaximo] = temp;

            System.out.println("Paso " + (i + 1) + ":");
            imprimirMatriz(matriz);

            // Hacer el eje igual a 1
            double pivote = matriz[i][i];
            for (int j = i; j < columnasR; j++) {
                matriz[i][j] /= pivote;
            }

            // Hacer cero los elementos por debajo y por encima del eje
            for (int j = 0; j < filasR; j++) {
                if (j != i) {
                    double factor = matriz[j][i];
                    for (int k = i; k < columnasR; k++) {
                        matriz[j][k] -= factor * matriz[i][k];
                    }
                }
            }
        }
    }

    public static double[] obtenerResultados(double[][] matriz) {
        int filasO = matriz.length;
        int columnasO = matriz[0].length;

        double[] resultados = new double[filasO];
        for (int i = 0; i < filasO; i++) {
            resultados[i] = matriz[i][columnasO - 1];
        }

        return resultados;
    }

    public static void imprimirMatriz(double[][] matriz) {
        int filasI = matriz.length;
        int columnasI = matriz[0].length;

        for (int i = 0; i < filasI; i++) {
            for (int j = 0; j < columnasI; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imprimirPasos(double[][] matriz) {
        int filasP = matriz.length;
        int columnasP = matriz[0].length;

        for (int i = 0; i < filasP; i++) {
            System.out.println("Paso " + (i + 1) + ":");
            imprimirMatriz(matriz);
        }
    }

    public static void imprimirResultados(double[] resultados) {
        int filasIR = resultados.length;

        for (int i = 0; i < filasIR; i++) {
            System.out.println("x" + (i + 1) + " = " + resultados[i]);
        }
    }
}
