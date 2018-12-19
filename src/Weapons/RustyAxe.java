package Weapons;

public class RustyAxe implements Weapon {
    @Override
    public int GetStrength()
    {
        return 120;
    }
    @Override
    public String toString()
    {
        return "An old rusty Axe";
    }
}
