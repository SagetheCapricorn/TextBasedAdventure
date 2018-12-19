package Weapons;

public class TomeOfSorcery implements Weapon {
    @Override
    public int GetStrength()
    {
        return 60;
    }
    @Override
    public String toString()
    {
        return "The spell book of a noble wizard";
    }
}

