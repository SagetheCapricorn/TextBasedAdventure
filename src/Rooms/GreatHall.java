package Rooms;

import People.Person;

public class GreatHall extends Room {
    public GreatHall(int x, int y) {
        super(x , y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have entered the Great Hall. The ceiling is covered with immaculate tapestries depicting the biblical events and the walls are addorned with shiny suits of armor.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
