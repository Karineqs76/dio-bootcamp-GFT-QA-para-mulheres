package loops_arrays;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
        System.out.println("Nota invalida! Por favor, digite a nota correta.");
        nota = scan.nextInt();
        }
        System.out.println("Nota registrada com sucesso!");
    }
}
