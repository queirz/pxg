public class Pokemon {
    private int number;
    private String name;
    private byte level;
    //private Hability[] habilities;
    private Type[] type;
    private float price;
    private byte boost;
    private Type[] weakness;
    private Pokemon evolution;
    private String description;
    private boolean shiny;
 
    public Pokemon(int number, String name, byte level, Type[] type, float price, byte boost, String description, boolean shiny) {
        this.number = number;
        this.name = name;
        this.level = level;
        this.habilities = null;
        this.type = type;
        this.price = price;
        this.boost = boost;
        this.weakness = null;
        this.evolution = null;
        this.description = description;
        this.shiny = shiny;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public byte getLevel() {
        return level;
    }
    public Hability[] getHabilities() {
        return habilities;
    }
    public String getType() {
        String s = "";
        
        for(Type t: this.type) {
            s += t.name();
            s += "-";
        }

        return s;
    }
    public float getPrice() {
        return price;
    }
    public byte getBoost() {
        return boost;
    }
    public Type[] getWeakness() {
        return weakness;
    }
    public byte getEvolution() {
        return evolution;
    }
    public String getDescription() {
        return description;
    }
    public boolean hasShiny() {
        return shiny;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(byte level) {
        this.level = level;
    }
    public void setHabilities(Hability[] habilities) {
        this.habilities = habilities;
    }
    public void setType(Type[] type) {
        this.type = type;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setBoost(byte boost) {
        this.boost = boost;
    }
    public void setWeakness(Type[] weakness) {
        this.weakness = weakness;
    }
    public void setEvolution(byte evolution) {
        this.evolution = evolution;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    
    
}
