package Monster;

public class WaterMonster implements IMonster {
    @Override
    public String getName() {
        return name;
    }

    private String name;
    public WaterMonster(String name) {this.name = name;
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
