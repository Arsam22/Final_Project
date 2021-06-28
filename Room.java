/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kashif Ahmad
 */
public class Room implements Serializable{
    private int roomNo;
    private int rent;
    private String floor;
   
    Room(){
        
    }

    public Room(int roomNo, int rent, String floor) {
        this.roomNo = roomNo;
        this.rent = rent;
        this.floor = floor;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    public static ArrayList<Room> readFromFile( )
    {
        ArrayList<Room> list = new ArrayList<Room>();
       
        try
        {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Room Record"));
            
                
            list = (ArrayList <Room>) input.readObject();
           
        }
        
        catch ( ClassNotFoundException c)
        {
            
        }
        catch ( ClassCastException c)
        {
            
        }
         catch ( IOException e)
        {
            
        }
        return list;
    }

public static void writeToFile( Room r )
    {
        
        ArrayList<Room> list = readFromFile();
        list.add(r);
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Room Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
        
    }

 public static boolean searchRoom (int roomNo)
    {
        ArrayList<Room> list = readFromFile();
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).roomNo==roomNo)
                return true;
            
        }
        return false;
        
    }

  public static void displayRoom()
       {
           ArrayList<Room> list = readFromFile();
           for (Room r: list)
           {
               System.out.println(r.getRoomNo()+"\t"+r.getFloor()+"\t"+r.getRent());
           }
           
       }
}
