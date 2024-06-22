package type_andOperator;
public class Estoque { // Declaração da classe chamada 'Type'
    
    public static void main(String[] args) { // Declaração do método principal, ponto de entrada do programa
        
        // Declaração de uma constante para o nome do produto
        final String PRODUCT_NAME = "Gadget"; // 'final' torna PRODUCT_NAME uma constante. O valor não pode ser alterado.
        
        // Declaração de variáveis de tipos primitivos
        byte quantity = 100; // Quantidade de produtos em estoque (byte pode armazenar de -128 a 127)
        short warehouseNumber = 32; // Número do armazém (short pode armazenar de -32.768 a 32.767)
        int productID = 123456; // ID único do produto (int pode armazenar de -2^31 a 2^31-1)
        long barcode = 123456789012L; // Código de barras do produto (long pode armazenar de -2^63 a 2^63-1)
        float weight = 1.5F; // Peso do produto em kg (float é um número de ponto flutuante de precisão simples)
        double price = 99.99; // Preço do produto (double é um número de ponto flutuante de precisão dupla)
        boolean inStock = true; // Indicador se o produto está em estoque (boolean pode ser true ou false)
        char currencySymbol = '$'; // Símbolo da moeda do preço (char armazena um único caractere Unicode)
        
        // Cálculo do valor total em estoque
        double totalValue = quantity * price; // Multiplicação da quantidade pelo preço para obter o valor total
        
        // Criação de uma variável String para armazenar uma mensagem de saída
        String message = "Detalhes do Produto:\n"; // Variável do tipo String para a mensagem inicial
        message += "Nome: " + PRODUCT_NAME + "\n"; // Adição do nome do produto à mensagem
        message += "ID do Produto: " + productID + "\n"; // Adição do ID do produto à mensagem
        message += "Código de Barras: " + barcode + "\n"; // Adição do código de barras à mensagem
        message += "Quantidade em Estoque: " + quantity + "\n"; // Adição da quantidade à mensagem
        message += "Número do Armazém: " + warehouseNumber + "\n"; // Adição do número do armazém à mensagem
        message += "Peso: " + weight + " kg\n"; // Adição do peso à mensagem
        message += "Preço: " + currencySymbol + price + "\n"; // Adição do preço à mensagem
        message += "Em Estoque: " + inStock + "\n"; // Adição do status de estoque à mensagem
        message += "Valor Total em Estoque: " + currencySymbol + totalValue; // Adição do valor total à mensagem
        
        // Impressão da mensagem completa
        System.out.println(message); // Exibe a mensagem completa com todos os detalhes do produto
    }
}
