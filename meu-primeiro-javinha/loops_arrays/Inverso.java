package loops_arrays;

public class Inverso {
    public static void main(String[] args) {
        // Definição do vetor de inteiros
        int[] vetor = {2, 4, 5, 8, 9, 5};

        // Imprime "Vetor: "
        System.out.println("Vetor: ");
        
        // Inicialização da variável de controle do loop
        int count = 0;
        
        // Loop while para percorrer o vetor e imprimir seus elementos
        while(count < vetor.length) {
            System.out.println(vetor[count] + " "); // Imprime o elemento do vetor na posição count
            count++; // Incrementa count para acessar o próximo elemento do vetor
        }

        // Imprime uma nova linha para separar os dois blocos de impressão
        System.out.println("\nVetor: ");

        // Loop for para imprimir o vetor ao contrário
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " "); // Imprime o elemento do vetor na posição i (inversa)
        }
    }
}

