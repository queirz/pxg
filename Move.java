public class Move {
    private int id;
    private String name;
    private int level;
    private byte cooldown;
    private int damage;
    private Type type;
    private Move_status[] status;
    private String description;

    // Construtores
    public Move() {
        setID(0);
        setName("");
        setLevel(0);
        setCooldown( (byte) 0);
        setDamage(0);
        setType(null);
        setStatus(null);
        setDescription("");
    }

    public Move (int id, String name, int level, byte cooldown, int damage, Type type, Move_status[] status, String description){
        setID(id);
        setName(name);
        setLevel(level);
        setCooldown(cooldown);
        setDamage(damage);
        setType(type);
        setStatus(status);
        setDescription(description);


    }

    public void setID(int id) {
        if(id > 0) {this.id = id;}
    }
    public int getID() {
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setLevel(int level) {
        if (level > 0 && level < 100) {this.level = level;}
    }
    public int getLevel(){
        return this.level;
    }
    public void setCooldown(byte cooldown) {
        if(cooldown > 0 && cooldown < 120) {this.cooldown = cooldown;}
    }
    public byte getCooldown(){
        return this.cooldown;
    }
    public void setDamage(int damage){
        if(damage > 0) {this.damage = damage;}
    }
    public int getDamage(){
        return this.damage;
    }
    public void setType(Type type){
        this.type = type;
    }
    public Type getType(){
        return this.type;
    }
    public void setStatus(Move_status[] status){
        this.status = status;
    }
    public Move_status[] getStatus(){
        return this.status;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    // Demais métodos
    public int getLastMoveID(){
        Move m = MyFile.ReadLastMove();
        return m.getID();
    }
    public void seeMove(){
        System.out.println(
            "#" + getID() + ": " + getName() + " é do level " + getLevel() + " e do tipo " + getType() + ". "
            + "Tempo de cooldown: " + getCooldown() + ". "
            + "Dá " + getDamage() + " de dano. "
            + "Descrição: " + getDescription()
        );
    }
    public void writeMoveInFile(){
        MyFile.writeMove(new Move(getID(), getName(), getLevel(), getCooldown(), getDamage(), getType(), getStatus(), getDescription()));
    }
}