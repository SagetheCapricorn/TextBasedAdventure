package Weapons;

public class DualSword implements Weapon {
    @Override
    public int GetStrength()
    {
        return 100;
    }
    @Override
    public String toString()
    {
        return "Dual Sword forged in fire";
    }
}
