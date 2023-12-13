public class Pokemon {
    private int number;
    private String name;
    private byte level;
    private Hability[] habilities;
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

    // Métodos de integridade - GET
    public int          getNumber()             { return number;                                          }
    public String       getName()               { return name;                                            }
    public byte         getLevel()              { return level;                                           }
    public Hability[]   getHabilities()         { return habilities;                                      }
    public String       getHabilitiesinStrng()  {
        String s = "";
        
        for(Hability h: this.habilities) { s += h.name(); s += "-"; }
        s = s.substring(0, s.length()-1);
        return s;
    }
    public Type[]       getType()               { return type;                                            }
    public String       getTypeInString()       {
        String s = "";
        
        for(Type t: this.type) { s += t.name(); s += "-"; }
        s = s.substring(0, s.length()-1);
        return s;
    }
    public float        getPrice()              { return price;                                           }
    public byte         getBoost()              { return boost;                                           }
    public Type[]       getWeakness()           { return weakness;                                        }
    public Pokemon      getEvolution()          { return evolution;                                       }
    public int          getEvolutionID()        { return (evolution != null) ? evolution.getNumber() : 0; }
    public String       getDescription()        { return description;                                     }
    public boolean      hasShiny()              { return shiny;                                           }
    
    // Métodos de integridade - SET
    public void setNumber(int number)                { this.number = number;           }
    public void setName(String name)                 { this.name = name;               }
    public void setLevel(byte level)                 { this.level = level;             }
    public void setHabilities(Hability[] habilities) { this.habilities = habilities;   }
    public void setType(Type[] type)                 { this.type = type;               }
    public void setPrice(float price)                { this.price = price;             }
    public void setBoost(byte boost)                 { this.boost = boost;             }
    public void setWeakness(Type[] weakness)         { this.weakness = weakness;       }
    public void setEvolution(Pokemon evolution)      { this.evolution = evolution;     }
    public void setDescription(String description)   { this.description = description; }
    public void setShiny(boolean shiny)              { this.shiny = shiny;             }

    // Demais métodos
    public void seePokemon() {
        System.out.println("#" + getNumber() + ": " + getName());
        System.out.println("É do tipo:" + getTypeInString());
        System.out.println("Habilidades:" + getHabilitiesinStrng());
        if(getEvolutionID() != 0) System.out.println("Sua evolução é " + getEvolution().getName() + ".");
        System.out.println("Tem nível " + getLevel() + " e preço $" + getPrice() + ".");
        System.out.println(getDescription());
        System.out.println("");
    }

    public void savePokemon(){
        MyFile.writePokemon(
            new Pokemon(
                    getNumber(),
                    getName(),
                    getLevel(),
                    getType(),
                    getPrice(),
                    getBoost(),
                    getDescription(),
                    hasShiny()
                )
        );
        System.out.println("Pokemon salvo.");
    }
}
