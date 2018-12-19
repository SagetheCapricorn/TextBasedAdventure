package Rooms;
import Weapons.Weapon;
import People.Person;
import Weapons.DualSword;
import Weapons.MerlinsStaff;
import Weapons.RustyAxe;
import Weapons.TomeOfSorcery;

public class Armory extends Room {
    public Armory(int x, int y) {
        super(x, y);
    }
    Weapon[] weapons = {new DualSword(), new MerlinsStaff(), new RustyAxe(), new TomeOfSorcery()};
    int w = (int)(Math.random()*weapons.length);




    public void enterRoom(Person x) {
        System.out.println(" You have found the armory! Surrounding you are locked chests containing weapons.\n You walk around and see a broken locker. You look inside and find a :"+weapons[w]);
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.arsenal.add(weapons[w]);
    }

    @Override
    public String toString() {
        if (occupant != null) {
            return "P";
        } else {
            return "*";
        }

    }

}
//in this room i want the user to finda type of weapon