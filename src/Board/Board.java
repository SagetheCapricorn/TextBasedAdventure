package Board;

import Rooms.Room;

public class Board {
    private Room[][] place;
    private Room[][] betterroom;

    public Board(Room[][] place) {

        this.place = place;
    }
    public void Print()
    {
        for (int i = 0; i < place.length; i++)
        {
            for(int w = 0; w < place[i].length;w++)
            {
                System.out.print(place[i][w]);
            }
            System.out.println();
        }
    }
}
