import java.nio.file.NotLinkException;

public static enum Hability {
    NONE         ( (byte)  0, "NONE"        ),
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

    public Hability value(String s) {
        byte id = (byte) 0;
        switch (s) {
            case "CUT":          return Hability.CUT;          break;
            case "DIG":          return Hability.DIG;          break;
            case "LIGHT":        return Hability.LIGHT;        break;
            case "ROCKSMASH":    return Hability.ROCKSMASH;    break;
            case "HEADBUTT":     return Hability.HEADBUTT;     break;
            case "RIDE":         return Hability.RIDE;         break;
            case "SURF":         return Hability.SURF;         break;
            case "FLY":          return Hability.FLY;          break;
            case "TELEPORT":     return Hability.TELEPORT;     break;
            case "CONTROLMINDS": return Hability.CONTROLMINDS; break;
            case "BLINK":        return Hability.BLINK;        break;
            default:             return Hability.NONE;         break;
        }
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
