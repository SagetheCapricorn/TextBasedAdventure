package Weapons;

public class MerlinsStaff implements Weapon {
    @Override
    public int GetStrength()
    {
        return 200;
    }
    @Override
    public String toString()
    {
        return "The very staff Merlin the Wizard used to cast spells";
    }
}

