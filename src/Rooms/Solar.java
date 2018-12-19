package Rooms;


import People.Person;

public class Solar extends Room {
    public Solar(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x) {
        System.out.println(" You enter a grand suite. You look left and see an elaborately decorated living room\n adorned with gold furnished chairs and sofa's. The walls are lined with elaborate ");
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
