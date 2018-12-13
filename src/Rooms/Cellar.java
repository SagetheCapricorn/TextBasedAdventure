package Rooms;

import People.Person;

public class Cellar extends Room {
    public Cellar(int x, int y) {
        super(x, y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have entered the cellar. You look around and almost shed a tear. \nAll around you are bottles upon bottles of wine whiskey and mead. Enough to keep you full for a life time.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
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
//in this room i want the user to be able to get a type of potion