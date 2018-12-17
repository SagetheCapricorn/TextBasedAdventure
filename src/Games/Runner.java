package Games;

import Board.Board;
import People.Person;
import Rooms.*;

import java.util.Scanner;

public class Runner
{
    //returns index of number in array
    public static int indexInArray(int[]array, int number)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == number)
            {
                return i;
            }
        }
        return -1;
    }
    //returns false if num is on list
    public static boolean check(int[]list, int num)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == num)
            {
                return false;
            }
        }
        return true;
    }
    Room[][] building = new Room[10][10];
    private static Room Randroom(int x,int y)
    {
                int roomnumber=(int)(Math.random()*10);
                switch(roomnumber){
                    case 1: return new  Kitchen(x,y);


                    case 2:return new Garderobe(x,y);


                    case 3:return new Armory(x,y);


                    case 4: return new Dovecoats(x,y);


                    case 5: return new Solar(x,y);


                    case 6: return new Chapel(x,y);


                    case 7: return new Cellar(x,y);


                    case 8: return new Lodge(x,y);


                    case 9: return new Dungeon(x,y);


                    case 0: return new GreatHall(x,y);



    }
        return Randroom(x,y);}



    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Room[][] building = new Room[10][10];

        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = Randroom(x,y);
                }
            }



        //Create a random winning room which will cause the game to exit.
        int e = (int)(Math.random()*building.length);
        int r = (int)(Math.random()*building.length);
        building[e][r] = new ExitRoom(e, r);

        Board map = new Board(building);
        int s = (int)(Math.random()*building.length);
        int p = (int)(Math.random()*building.length);






        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        building[s][p].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            map.Print();
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */
    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }



}

