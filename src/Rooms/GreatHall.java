package Rooms;

import People.Person;

public class GreatHall extends Room {
    public GreatHall(int x, int y) {
        super(x , y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have entered the Great Hall. The ceiling is covered with immaculate tapestries depicting the biblical \nevents and the walls are adorned with shiny suits of armor.");
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
