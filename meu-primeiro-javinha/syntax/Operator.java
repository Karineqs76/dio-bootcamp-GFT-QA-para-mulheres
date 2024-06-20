public class Operator { 
    public static void main(String[] args) {
        // Declaração de variáveis booleanas Karine e Karina
        boolean Karine, Karina;
        
        // Declaração de variáveis inteiras number, number2 e action
        int number, number2, action;
        
        // Atribui o valor 5 à variável number
        number = 5;
        // Imprime o valor de number (5)
        System.out.println(number);

        // Muda o sinal do valor de number (de 5 para -5)
        number = -number;
        // Imprime o valor de number (-5)
        System.out.println(number);

        // Muda novamente o sinal do valor de number (de -5 para 5)
        number = number * (-1);
        // Imprime o valor de number (5)
        System.out.println(number);

        // Incrementa o valor de number em 1 (de 5 para 6)
        number++;
        // Imprime o valor de number (6)
        System.out.println(number);

        // Declara uma variável booleana chamada variable e atribui a ela o valor falso (false)
        boolean variable = false;
        // Imprime o valor inverso de variable (!false = true)
        System.out.println(!variable);

        // Atribui o valor 6 à variável number2
        number2 = 5;

        // Operador ternário que compara se number é igual a number2
        // Se verdadeiro, action recebe 1, caso contrário, recebe 0
        action = number == number2 ? 1 : 0;
        System.out.println(action);

        // Atribui o valor verdadeiro (true) à variável Karine
        Karine = true;
        // Atribui o valor falso (false) à variável Karina
        Karina = false;

        // Verifica se ambas as variáveis Karine e Karina são verdadeiras
        if (Karine && Karina) {
            // Se ambas forem verdadeiras, imprime "AND"
            System.out.println("AND");
        }
        // Verifica se pelo menos uma das variáveis Karine ou Karina é verdadeira
        if (Karine || Karina) {
            // Se pelo menos uma for verdadeira, imprime "OR"
            System.out.println("OR");
        }
    }
}

