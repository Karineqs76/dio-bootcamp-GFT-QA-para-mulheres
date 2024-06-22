// Classe que representa o usuário da TV
package method_project;
public class User {
    // Método principal que é executado quando o programa roda
    public static void main(String[] args) throws Exception {
        // Cria uma nova instância da classe SmartTV (uma nova TV)
        SmartTV smartTV = new SmartTV();

        // Exibe no console se a TV está ligada
        System.out.println("TV Ligada? " + smartTV.ligada);

        // Exibe no console o canal atual da TV
        System.out.println("Canal Atual: " + smartTV.canal);

        // Exibe no console o volume atual da TV
        System.out.println("Volume Atual: " + smartTV.volume);
    }
}
