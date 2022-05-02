public class App {
    public static void main(String[] args) throws Exception {
        
        Player p1;
        Player p2;
        Player p3;
        Player p4;

        p1 = new Player("Giovanni");
        p2 = new Player("Claudio");
        p3 = new Player("Giuseppe");
        p4 = new Player("Francesco");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();

        System.out.println("Gara terminata \n");

        System.out.println("Primo: " +p1.podio.get(0) + "\nSecondo: " + p1.podio.get(1) + "\nTerzo: " + p1.podio.get(2) + "\nQuarto: " + p1.podio.get(3));
        
    }
}
