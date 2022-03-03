package Monster;

public class CookieMonster implements IMonster {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public CookieMonster(String name){
        this.name = name;
    }

    @Override
    public String attack(){
        return getName() + " attack with cookie!";
    }
}
