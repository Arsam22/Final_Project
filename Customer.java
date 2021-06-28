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
public class Customer implements Serializable {
    private  String name;
    private  int ID;
    private  int cnic;
    private  int phoneNo;
    
    
    public Customer()
{
    
}

    public Customer(String name, int ID, int cnic, int phoneNo) {
        this.name = name;
        this.ID = ID;
        this.cnic = cnic;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public static ArrayList<Customer> readFromFile( )
    {
        ArrayList<Customer> list = new ArrayList<Customer>();
       
        try
        {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Customer Record"));
            
                
            list = (ArrayList <Customer>) input.readObject();
           
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

public static void writeToFile( Customer c )
    {
        
        ArrayList<Customer> list = readFromFile();
        list.add(c);
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Customer Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
        
    }

 public static boolean searchCustomer (String name)
    {
        ArrayList<Customer> list = readFromFile();
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(name))
                return true;
            
        }
        return false;
        
    }
 public static void updateCustomer(String name,String name1)
    {
        ArrayList<Customer> list = readFromFile();
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(name))
                list.get(i).setName(name1);
            break;
        }
        
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Customer Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
        
    }
 public static void deleteCustomer(Customer em)
    {
        ArrayList<Customer> list = readFromFile();
        
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(em.getName()))
                list.remove(i);
            break;
        }
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Customer Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
    }
  public static void displayCustomer()
       {
           ArrayList<Customer> list = readFromFile();
           for (Customer c: list)
           {
               System.out.println(c.getName() + "   "+ c.getID()+ "   "+ c.getCnic()+ "   "+c.getPhoneNo()+ "   ");
           }
           
       }
    
}
