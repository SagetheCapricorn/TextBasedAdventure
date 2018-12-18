package Rooms;

import People.Person;

public class Armory extends Room {
    public Armory(int x, int y) {
        super(x, y);
    }
    int w = 0;


    public void enterRoom(Person x) {
        System.out.println(" You have found the armory! Surrounding you are locked chests containing weapons.");
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
    public String toString(String occupant){
        if (occupant != null){
            return "P";
        }
        else{
            w +=1;
            return"*";
        }



    }


}
//in this room i want the user to finda type of weapon