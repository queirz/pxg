public class Move {
    private int move_id;
    private String move_name;
    private int move_level;
    private byte cooldown;
    private int damage;
    private Type element;
    private int[] status;
    private String descripton;

    // Construtor
    Move (String name, int level, byte cooldown, String element, int[] status, String description){
        this.move_name = name;
        this.move_level = level;
        this.cooldown = cooldown;
        this.element = element;
        this.status = status;
        this.description = description;
    }
}