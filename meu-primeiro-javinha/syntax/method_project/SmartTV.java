package method_project;

// Classe que representa uma Smart TV
public class SmartTV {
    // Atributo que indica se a TV está ligada ou não (inicialmente desligada)
    boolean ligada = false;
    
    // Atributo que indica o canal atual da TV (inicialmente canal 1)
    int canal = 1;
    
    // Atributo que indica o volume atual da TV (inicialmente volume 25)
    int volume = 25;

    // Método para ligar a TV
    public void ligar(){
        // Define o atributo 'ligada' como true (ligada)
        ligada = true;
    }

    // Método para desligar a TV
    public void desligar(){
        // Define o atributo 'ligada' como false (desligada)
        ligada = false;
    }

    // Método para mudar o canal da TV
    // Recebe um número de canal como parâmetro e define como canal atual
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    // Método para aumentar o volume da TV
    public void aumentarVol(){
        // Incrementa o valor do atributo 'volume' em 1
        volume++;
    }

    // Método para diminuir o volume da TV
    public void diminuirVol(){
        // Decrementa o valor do atributo 'volume' em 1
        volume--;
    }
}