package Rooms;

import Games.Runner;
import People.Person;

public class ExitRoom extends Room{
    public ExitRoom(int x, int y) {
        super(x,y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Valiant traveler your days of toil and adventure have led you to the exit of this fine castle. Take your riches and rejoice!");
        Runner.gameOff();
    }
    @Override public String toString()
    {
        return"BYE";
    }


}
