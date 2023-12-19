public class Home{

    public static void main(String[] args) {
        System.out.println("New pokemon: ");

        Type[] t = {Type.GRASS, Type.POISON};
        Hability[] h = {Hability.HEADBUTT};
        Pokemon venusaur = new Pokemon
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
        venusaur.setHabilities(h);
        venusaur.seePokemon();

        System.out.println("New pokemon: ");
        Pokemon ivysaur = new Pokemon
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
        ivysaur.setEvolution(venusaur);
        ivysaur.setHabilities(h);
        ivysaur.seePokemon();
        
        ivysaur.savePokemon();
        venusaur.savePokemon();

        Pokemon p = new Pokemon();
        p.readPokemon(1);
    }
}
