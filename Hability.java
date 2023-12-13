public enum Hability {
    CUT          ( (byte)  1, "CUT"         ),
    DIG          ( (byte)  2, "DIG"         ),
    LIGHT        ( (byte)  3, "LIGHT"       ),
    ROCKSMASH    ( (byte)  4, "ROCKSMASH"   ),
    HEADBUTT     ( (byte)  5, "HEADBUTT"    ),
    RIDE         ( (byte)  6, "RIDE"        ),
    SURF         ( (byte)  7, "SURF"        ),
    FLY          ( (byte)  8, "FLY"         ),
    TELEPORT     ( (byte)  9, "TELEPORT"    ),
    CONTROLMINDS ( (byte) 10, "CONTROLMINDS"),
    BLINK        ( (byte) 11, "BLINK"       );

    private final byte id;
    private final String name;

    Hability(byte id, String name) {
        this.id = id;
        this.name = name;
    }

    public static byte value(String s) {
        byte id = (byte) 0;
        switch (s) {
            case "CUT":          id = CUT.id;          break;
            case "DIG":          id = DIG.id;          break;
            case "LIGHT":        id = LIGHT.id;        break;
            case "ROCKSMASH":    id = ROCKSMASH.id;    break;
            case "HEADBUTT":     id = HEADBUTT.id;     break;
            case "RIDE":         id = RIDE.id;         break;
            case "SURF":         id = SURF.id;         break;
            case "FLY":          id = FLY.id;          break;
            case "TELEPORT":     id = TELEPORT.id;     break;
            case "CONTROLMINDS": id = CONTROLMINDS.id; break;
            case "BLINK":        id = BLINK.id;        break;
        }

        return id;
    }

    public static String value(byte id) {
        String s = "";

        switch (id) {
            case  1: s = CUT.name;          break;
            case  2: s = DIG.name;          break;
            case  3: s = LIGHT.name;        break;
            case  4: s = ROCKSMASH.name;    break;
            case  5: s = HEADBUTT.name;     break;
            case  6: s = RIDE.name;         break;
            case  7: s = SURF.name;         break;
            case  8: s = FLY.name;          break;
            case  9: s = TELEPORT.name;     break;
            case 10: s = CONTROLMINDS.name; break;
            case 11: s = BLINK.name;        break;
        }

        return s;
    }
}