public class Anatomy {
    public static void main (String [] args) { 
        String firstName = "Bentinho";
        String lastName = "Da Silva";
        String name = name (firstName, lastName);
        System.out.print(name);
    }
    public static String name (String firstName, String lastName) {
        return "Gatinho mais lindo do Brasil: " + firstName.concat(" ").concat(lastName);
    }
}
