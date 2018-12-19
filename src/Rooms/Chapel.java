package Rooms;


import People.Person;

public class Chapel extends Room {
    public Chapel(int x, int y) {
        super(x, y);

        }


    public void enterRoom(Person x) {
        System.out.println("You enter a large chapel. The room is adorned with ceiling high tapestries depicting religious events. \nThere are two large stained glass windows on either side of you bearing a cross. The room has rows of pews each made of thick mahogany wood complemented by velvet seats. \nDirectly in front of you there is a pulpit decorated with all kinds of jewels. You reach out to touch one and it falls off the wall.\n You have received: "+jewelfinder());
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);

    }
    private static String jewelfinder()
    {
        int birdgetter=(int)(Math.random()*10);
        switch(birdgetter) {
            case 1:
                return "Ruby";



            case 2:
                return "Saphire";


            case 3:
                return "Emerald";



            case 4:
                return "Opal";

            case 5:
                return "Chambersite";


            case 6:
                return "Taafeite";


            case 7:
                return "Zektzerite";

            case 8:
                return "Poudretteite";


            case 9:
                return "Musgravite";


            case 0:
                return "Hibonite";


        }
        return jewelfinder();
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