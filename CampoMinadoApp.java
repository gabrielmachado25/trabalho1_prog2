
package com.mycompany.trabalhocampominado;

import java.util.Scanner;

// AQUI CONTÉM A LÓGICA DE EXECUÇÃO DO PROGRAMA

public class CampoMinadoApp {

    public void run() {
        // o run CONTROLA A EXECUÇÃO DO PROGRAMA
        Scanner scanner = new Scanner(System.in);
        int fieldNumber = 1; // Variável para contar o número do campo

        while (true) {
            int n = scanner.nextInt(); // Número de linhas
            int m = scanner.nextInt(); // Número de colunas

            if (n == 0 && m == 0) {
                break; // Se ambos n e m são 0, termina o programa
            }

            char[][] field = new char[n][m]; // Cria uma matriz para representar o campo

            for (int i = 0; i < n; i++) {
                String line = scanner.next();
                for (int j = 0; j < m; j++) {
                    field[i][j] = line.charAt(j); // Preenche a matriz com os caracteres fornecidos
                }
            }

            System.out.println("Field #" + fieldNumber + ":"); // Imprime o número do campo
            CampoMinadoUtils.printFieldWithHints(field); // Chama a função para imprimir o campo com as dicas
            fieldNumber++; // Incrementa o número do campo para o próximo
        }
    }
    
}
