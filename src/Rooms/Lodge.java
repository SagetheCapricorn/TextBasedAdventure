package Rooms;

import People.Person;

public class Lodge extends Room {
    public Lodge(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println(" You have entered the lodge. The walls are decorated with the heads of various animals and the floors are covered with belts from all types of rare beast. This is where the knights spend most of their free time.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
//in this room i want the player to find some kind of armor