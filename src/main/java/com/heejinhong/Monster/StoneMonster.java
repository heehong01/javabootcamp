package Monster;
public class StoneMonster implements IMonster {
    @Override
    public String getName() {
        return name;
    }

    private String name;

    public StoneMonster(String name) {
        this.name = name;
    }
    @Override
    public String attack(){
        return "Attack with stones!";

    }
/*public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with stones!";

    }*/
}
