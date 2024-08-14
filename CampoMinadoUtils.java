
package com.mycompany.trabalhocampominado;

// AQUI TEMOS O MÉTODO PARA IMPRIMIR O CAMPO COM DICAS DE MINAS ADJACENTES

public class CampoMinadoUtils {
    
    public static void printFieldWithHints(char[][] field) { //método que faz a impressão
        int n = field.length; // Número de linhas
        int m = field[0].length; // Número de colunas

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; // Deslocamentos nas linhas para os vizinhos
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1}; // Deslocamentos nas colunas para os vizinhos
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == '*') {
                    System.out.print("*"); // Se há uma mina, imprime *
                } else {
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m && field[ni][nj] == '*') {
                            count++; // Conta quantas minas estão ao redor do quadrado
                        }
                    }
                    System.out.print(count); // Imprime o número de minas adjacentes
                }
            }
            System.out.println(); // Quebra de linha após cada linha do campo
        }

        System.out.println(); // Linha vazia entre os campos
    }
}

