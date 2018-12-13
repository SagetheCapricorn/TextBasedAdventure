package Rooms;

import People.Person;

public class Garderobe extends Room {
    public Garderobe(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println(" You have entered the garderobe. You look around the room and you see a small smugged opposite a a dirty un-flushed toilet.");
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