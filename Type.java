public enum Type {
    FIRE     ( (byte)  1, "FIRE"    ),
    ELECTRIC ( (byte)  2, "ELECTRIC"),
    GROUND   ( (byte)  3, "GROUND"  ),
    ROCK     ( (byte)  4, "ROCK"    ),
    GRASS    ( (byte)  5, "GRASS"   ),
    BUG      ( (byte)  6, "BUG"     ),
    NORMAL   ( (byte)  7, "NORMAL"  ),
    FIGHTING ( (byte)  8, "FIGHTING"),
    STEEL    ( (byte)  9, "STEEL"   ),
    FLYING   ( (byte) 10, "FLYING"  ),
    DRAGON   ( (byte) 11, "DRAGON"  ),
    PSYCHIC  ( (byte) 12, "PSYCHIC" ),
    FAIRY    ( (byte) 13, "FAIRY"   ),
    WATER    ( (byte) 14, "WATER"   ),
    ICE      ( (byte) 15, "ICE"     ),
    GHOST    ( (byte) 16, "GHOST"   ),
    DARK     ( (byte) 17, "DARK"    ),
    POISON   ( (byte) 18, "POISON"  );

    private final byte id;
    private final String name;

    Type(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    public static byte value(String s) {
        byte id = (byte) 0;
        switch (s) {
            case "FIRE":     id = FIRE.id;           break;
            case "ELECTRIC": id = ELECTRIC.id;       break;
            case "GROUND":   id = GROUND.id;         break;
            case "ROCK":     id = ROCK.id;           break;
            case "GRASS":    id = GRASS.id;          break;
            case "BUG":      id = BUG.id;            break;
            case "NORMAL":   id = NORMAL.id;         break;
            case "FIGHTING": id = FIGHTING.id;       break;
            case "STEEL":    id = STEEL.id;          break;
            case "FLYING":   id = FLYING.id;         break;
            case "DRAGON":   id = DRAGON.id;         break;
            case "PSYCHIC":  id = PSYCHIC.id;        break;
            case "FAIRY":    id = FAIRY.id;          break;
            case "WATER":    id = WATER.id;          break;
            case "ICE":      id = ICE.id;            break;
            case "GHOST":    id = GHOST.id;          break;
            case "DARK":     id = DARK.id;           break;
            case "POISON":   id = POISON.id;         break;
        }

        return id;
    }

    public static String value(byte id) {
        String s = "";

        switch (id) {
            case 1:     s = FIRE.name;     break;
            case 2: s = ELECTRIC.name; break;
            case 3:   s = GROUND.name;   break;
            case 4:     s = ROCK.name;     break;
            case 5:    s = GRASS.name;    break;
            case 6:      s = BUG.name;      break;
            case 7:   s = NORMAL.name;   break;
            case 8: s = FIGHTING.name; break;
            case 9:    s = STEEL.name;    break;
            case 10:   s = FLYING.name;   break;
            case 11:   s = DRAGON.name;   break;
            case 12:  s = PSYCHIC.name;   break;
            case 13:    s = FAIRY.name;    break;
            case 14:    s = WATER.name;    break;
            case 15:      s = ICE.name;      break;
            case 16:    s = GHOST.name;    break;
            case 17:     s = DARK.name;     break;
            case 18:   s = POISON.name;   break;
        }

        return s;
    }
}