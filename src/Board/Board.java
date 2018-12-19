package Board;

import Rooms.Room;

public class Board {
    private Room[][] place;
    private int row;
    private int collumn;
    //This constructs the board
    public Board(Room[][] place) {

        this.place = place;
    }
    //This is a second way tp construct the board
    public Board(int row, int collumn){
        this.row = row;
        this.collumn = collumn;
        this.place = new Room[row][collumn];
        fillRooms();
    }

    //This is the print method that prints the map for the user
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
    private void fillRooms(){
        //Fill the building with normal rooms
        for (int x = 0; x<this.place.length; x++)
        {
            for (int y = 0; y < this.place[x].length; y++)
            {
                    this.place[x][y] = new Room(x, y);
                }
            }
        }
}
