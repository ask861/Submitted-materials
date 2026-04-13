package week2_xu_mingcheng.practice2;

public class Armor implements Item {

    private String name;
    private int defenceValue;

    public Armor(String name, int defenceValue) {
        this.name = name;
        this.defenceValue = defenceValue;
    }

    public String getName() {
        return name;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

    @Override
    public void use() {
        System.out.println(name + "を身に着けた");
        System.out.println("守備力が" + defenceValue + "上がった");
    }
}