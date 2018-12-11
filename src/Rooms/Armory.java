package Rooms;

import People.Person;

public class Armory extends Room {
    public Armory(int x, int y) {
        super(x, y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have found the armory! Surrounding you are locked chests containing weapons.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
//in this room i want the user to finda type of weapon