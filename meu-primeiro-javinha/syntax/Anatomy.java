public class Anatomy { // Declaração da classe chamada 'Anatomy'. Em Java, todo o código é organizado dentro de classes.
    
    public static void main (String [] args) { // Declaração do método principal. Este é o ponto de entrada do programa, onde a execução começa.
        
        // Declaração de uma variável chamada 'firstName' do tipo String (texto) e atribuição do valor "Bentinho" a ela.
        String firstName = "Bentinho";
        
        // Declaração de uma variável chamada 'lastName' do tipo String (texto) e atribuição do valor "Da Silva" a ela.
        String lastName = "Da Silva";
        
        // Chamada do método 'name' com os argumentos 'firstName' e 'lastName', e armazenamento do valor retornado na variável 'name'.
        String name = name (firstName, lastName);
        
        // Impressão do valor da variável 'name' na tela. A função System.out.print() exibe o texto sem uma nova linha no final.
        System.out.print(name);
    }
    
    // Declaração de um método estático chamado 'name' que aceita dois parâmetros do tipo String: 'firstName' e 'lastName'.
    // Este método retorna uma String que combina os dois nomes com uma frase adicional.
    public static String name (String firstName, String lastName) {
        
        // Retorna uma String formatada que combina o texto "Gatinho mais lindo do Brasil: " com os valores de 'firstName' e 'lastName'.
        // A função concat() adiciona um espaço entre os nomes.
        return "Gatinho mais lindo do Brasil: " + firstName.concat(" ").concat(lastName);
    }
}

