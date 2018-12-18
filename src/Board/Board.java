package Board;

import Rooms.Room;

public class Board {
    private Room[][] place;
    private Room[][] goodstart;
    private int row;
    private int collumn;

    public Board(Room[][] place) {

        this.place = place;
    }
    public Board(int x, int y){
        this.row = row;
        this.collumn = collumn;
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
