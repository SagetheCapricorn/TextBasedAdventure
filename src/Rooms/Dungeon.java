package Rooms;

import People.Person;

public class Dungeon extends Room {
    public Dungeon(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println(" You have entered the dungeon. You look around and see cobwebs in every corner, spiders and all types of insects wander the room. Spread across the floor is a small collection of human bones and ripped clothes.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    @Override public String toString()
    {
        return"Dun";
    }

}
//in this room i want the player to get a chance to pillage jewelry from a skeleton