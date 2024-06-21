package args_project;

public class AboutMe {
    public static void main(String[] args){
        String nome = args [0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);
        String pet = args [3];

        System.out.println("Oie! me chamo " + nome);
        System.out.println("Tenho " + idade + "anos ");
        System.out.println("Minha altura é " + altura + "cm");
        System.out.println("E um bichinho de estimação muito fofo chamado " + pet);

    }
}
