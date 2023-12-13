import java.io.*;

public class MyFile {
    private static final String MOVES_FILE = "moves.md";
    private static final String POKEMONS_FILE = "pokemons.md";

    /*public static void writeMove(Move m){
        File arquivo = new File(MOVES_FILE);

        try {
            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(
                    m.getID() + "<;>" 
                    + m.getName() + "<;>"
                    + m.getLevel() + "<;>"
                    + m.getCooldown() + "<;>"
                    + m.getDamage() + "<;>"
                    + m.getType() + "<;>"
                    + m.getStatus() + "<;>"
                    + m.getDescription() + "<;>"
            );
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/

    public static void writePokemon(Pokemon p){
        File arquivo = new File(POKEMONS_FILE);

        try {
            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }

            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(
                      p.getNumber()         + "<;>" 
                    + p.getName()           + "<;>"
                    + p.getLevel()          + "<;>"
                    + p.getHabilitiesinString() + "<;>"
                    + p.getTypeInString()   + "<;>"
                    + p.getPrice()          + "<;>"
                    + p.getBoost()          + "<;>"
                    + p.getWeakness()       + "<;>"
                    + p.getEvolutionID()      + "<;>"
                    + p.getDescription()    + "<;>"
                    + p.hasShiny()          + "<;>"
            );
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    
}