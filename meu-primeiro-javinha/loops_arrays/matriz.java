package loops_arrays;

import java.util.Random;

public class matriz {
    public static void main(String[] args) {
        // Criando uma instância da classe Random para gerar números aleatórios
        Random random = new Random();

        // Declarando e inicializando a matriz M com dimensões 4x4
        int[][] M = new int[4][4];
        
        // Preenchendo a matriz M com números aleatórios entre 0 e 8
        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9); // Gera um número aleatório entre 0 e 8
            }
        }
        
        // Imprimindo a matriz M na tela
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " "); // Imprime cada elemento da matriz seguido de um espaço
            }
            System.out.println(); // Imprime uma nova linha após cada linha da matriz
        }
    }
}

    }
}
