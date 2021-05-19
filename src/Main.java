public class Main {
    public static void main (String[] args) {
        Person person = new Implementor().setName("Galin").setAge(23).setBirth("08.10.1998").build();
        person.display();
    }
}
