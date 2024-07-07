package loops_arrays;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();  // Recebe o número cujo fatorial será calculado

        int multiplicacao = 1;  // Variável que irá armazenar o resultado do fatorial

        System.out.println(fatorial + "! = ");
        for(int i = fatorial ; i >= 1 ; i --) {  // Loop para calcular o fatorial
            multiplicacao = multiplicacao * i;  // Multiplica o número atual pelo resultado acumulado
        }

        System.out.println(multiplicacao);  // Imprime o resultado do fatorial
    }
}
