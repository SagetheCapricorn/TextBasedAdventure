package Rooms;

import People.Person;

public class Dovecoats extends Room {
    public Dovecoats(int x, int y) {
        super(x, y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have entered the dovecoat. You look around and see walla littered with cubbyholes. Inside each cubbyhole is a unique bird.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    @Override public String toString()
    {
        return"D";
    }
}
//in this one i want to randomly select a color and type of bird fpr the userr top  get whenever they enter a dovecoat