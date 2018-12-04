package Games;

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

    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Room[][] building = new Room[10][10];

        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Room(x,y);
            }
        }


        //Create a random winning room which will cause the game to exit.
        int x = (int)(Math.random()*building.length);
        int y = (int)(Math.random()*building.length);
        building[x][y] = new ExitRoom(x, y);
        int w = 0;
        int [] xList = new int[10];
        int [] yList = new int[10];

        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Chapel(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Dungeon(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Solar(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Cellar(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Dovecoats(x, y);
                w++;
            }
        }

        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Armory(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Kitchen(x, y);
                w++;
            }
        }
        while(w< 9) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Garderobe(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Lodge(x, y);
                w++;
            }
        }
        while(w< 10) {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (check(xList, x) || check(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new Room(x, y);
                w++;
            } else if (indexInArray(xList, x) != indexInArray(yList, y)) {
                xList[w] = x;
                yList[w] = y;
                building[x][y] = new GreatHall(x, y);
                w++;
            }
        }




        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        building[0][1].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
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

