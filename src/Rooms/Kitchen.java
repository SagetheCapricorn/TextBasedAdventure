package Rooms;

import People.Person;

public class Kitchen extends Room {
    public Kitchen(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println(" You have entered the kitchen. You look around and see servants bustling aboput preparing for tonight's dinner.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    @Override public String toString()
    {
        return"K";
    }
}