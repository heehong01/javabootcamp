package Monster;

public class FireMonster implements IMonster {
    @Override
    public String getName() {
        return name;
    }

    private String name;
    public FireMonster(String name) {
        this.name = name;
    }
    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
