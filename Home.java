public class Home{

    public static void Main(String[] args) {
        System.out.println("New move: ");
        String name = "tackle";
        int level = 20;
        byte cooldown = 15;
        String[] element = ("", "");
        String description = "";

        Move m = new Move(name, level, cooldown, element, description);
    }
}