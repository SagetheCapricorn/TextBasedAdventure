package Rooms;

import People.Person;

public class Dovecoats extends Room {
    public Dovecoats(int x, int y) {
        super(x, y);
    }


    public void enterRoom(Person x) {
        System.out.println(" You have entered the dovecoat. You look around and see walla littered with cubbyholes. \nInside each cubbyhole is a unique bird.\n You put your hand in and grab one. You received:"+BirdFinder());
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    private static String BirdFinder()
    {
        int birdgetter=(int)(Math.random()*10);
        switch(birdgetter) {
            case 1:
                return "Blue jay";



            case 2:
                return "Parakeet";


            case 3:
                return "Pigeon";



            case 4:
                return "Humming Bird";

            case 5:
                return "Red Robin";


            case 6:
                return "Parrot";


            case 7:
                return "Eagle";

            case 8:
                return "Canary";


            case 9:
                return "Ostrich";


            case 0:
                return "Canadian Goose";


        }
        return BirdFinder();
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
//in this one i want to randomly select a color and type of bird fpr the userr top  get whenever they enter a dovecoat