package Players;

public enum Race {

    DWARF (dwarf),
    BARBARIAN (barbarian),
    KNIGHT (knight),
    WARLOCK (warlock),
    WIZARD (wizard),
    CLERIC (cleric);

    private final String type;

    private Race(String type) {
        this.type = type;
    }

    public String getValue(){
        return this.type;
    }

}
