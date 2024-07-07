package loops_arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criando um array para armazenar até 6 consoantes
        String[] consoantes = new String[6];
        int quantConsoantes = 0; // Contador para armazenar o número de consoantes inseridas

        int count = 0; // Contador para controlar o número de entradas no loop do-while

        // Loop do-while para solicitar entrada de letras até o array de consoantes ser preenchido
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            // Verificando se a letra digitada não é uma vogal (a, e, i, o, u)
            if (!(letra.equalsIgnoreCase("a") ||
                  letra.equalsIgnoreCase("e") ||
                  letra.equalsIgnoreCase("i") ||
                  letra.equalsIgnoreCase("o") ||
                  letra.equalsIgnoreCase("u"))) {
                
                consoantes[count] = letra; // Armazenando a consoante no array
                quantConsoantes++; // Incrementando o contador de consoantes
            }
            count++; // Incrementando o contador do loop
        } while (count < consoantes.length); // Continua enquanto não preencher todas as posições do array

        // Exibindo as consoantes armazenadas no array
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) // Verifica se a posição do array contém uma consoante
                System.out.println(consoante + " ");
        }

        // Exibindo a quantidade de consoantes inseridas
        System.out.println("Quantidade de consoantes: " + quantConsoantes);
    }
}
