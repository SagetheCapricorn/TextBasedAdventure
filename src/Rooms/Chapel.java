package Rooms;


import People.Person;

public class Chapel extends Room {
    public Chapel(int x, int y) {
        super(x, y);


        }


    public void enterRoom(Person x) {
        System.out.println("You enter a large chapel. The room is adorned with ceiling high tapestries depicting religious events. There are two larg stained glas windows on either side of yopu bearing a cross. The room has rows of pews each made of thick mahogany wood complemented by velvet seats. Directly in front of you there is a pulpit decorated with all kinds of jewels. ");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
}
}