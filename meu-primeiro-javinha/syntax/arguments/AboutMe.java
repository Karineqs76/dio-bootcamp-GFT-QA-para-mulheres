// Pacote que agrupa as classes relacionadas ao projeto de argumentos
package arguments;

// Classe que representa informações sobre mim
public class AboutMe {
    // Método principal que é executado quando o programa roda
    public static void main(String[] args){
        // 'args' é um array de Strings que armazena os argumentos passados na linha de comando
        // Cada elemento do array 'args' corresponde a um argumento passado para o programa

        // Atribui o primeiro argumento passado (nome) à variável 'nome'
        String nome = args[0];

        // Atribui o segundo argumento passado (idade), convertendo de String para int, à variável 'idade'
        int idade = Integer.valueOf(args[1]);

        // Atribui o terceiro argumento passado (altura), convertendo de String para double, à variável 'altura'
        double altura = Double.valueOf(args[2]);

        // Atribui o quarto argumento passado (nome do pet) à variável 'pet'
        String pet = args[3];

        // Imprime no console uma mensagem usando os valores passados como argumentos
        System.out.println("Oie! me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        System.out.println("E um bichinho de estimação muito fofo chamado " + pet);
    }
}

