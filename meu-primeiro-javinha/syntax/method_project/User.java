
package method_project;
public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        
    }
}
