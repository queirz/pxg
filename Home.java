public class Home{

    public static void main(String[] args) {
        System.out.println("New pokemon: ");

        Type[] t = {Type.GRASS, Type.POISON};
        Pokemon p = new Pokemon
            (
                3
                , "Venusaur"
                , (byte) 80
                , t
                , 120000f
                , (byte) 3
                , "Há uma grande flor nas costas do Venusaur. Diz-se que a flor adquire cores vivas, caso receba muita nutrição e luz solar. O aroma da flor acalma as emoções das pessoas."
                , true
            );
            
            Pokemon p2 = new Pokemon
            (
                2
                , "Ivysaur"
                , (byte) 80
                , t
                , 120000f
                , (byte) 3
                , "Há uma grande flor nas costas do Venusaur. Diz-se que a flor adquire cores vivas, caso receba muita nutrição e luz solar. O aroma da flor acalma as emoções das pessoas."
                , true
            );
            p2.setEvolution(p);
        
            MyFile.writePokemon(p);
            MyFile.writePokemon(p2);

    }
}