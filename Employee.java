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
public class Employee implements Serializable{
    
    private  String name;
    private  String designation;
    private  int ID;
    private  int cnic;
    private  int phoneNo;
    int pay;
public Employee()
{
    
}

    public Employee(String name, String designation,int ID, int cnic, int phoneNo, int pay) {
        this.name = name;
        this.designation=designation;
        this.ID = ID;
        this.cnic = cnic;
        this.phoneNo = phoneNo;
        this.pay = pay;
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

    public int getPay() {
        return pay;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
    

public static ArrayList<Employee> readFromFile( )
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
       
        try
        {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Employee Record"));
            
                
            list = (ArrayList <Employee>) input.readObject();
           
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

public static void writeToFile( Employee em )
    {
        
        ArrayList<Employee> list = readFromFile();
        list.add(em);
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Employee Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
        
    }

 public static boolean searchEmployee (String name)
    {
        ArrayList<Employee> list = readFromFile();
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(name))
                return true;
            
        }
        return false;
        
    }
 public static void updateEmployee(String name,String name1)
    {
        ArrayList<Employee> list = readFromFile();
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(name))
                list.get(i).setName(name1);
            break;
        }
        
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Employee Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
        
    }
 public static void deleteEmployee(Employee em)
    {
        ArrayList<Employee> list = readFromFile();
        
        for (int i=0; i<list.size();i++)
        {
            if (list.get(i).getName().equals(em.getName()))
                list.remove(i);
            break;
        }
        try
        {
        ObjectOutputStream output = new ObjectOutputStream ( new FileOutputStream ( "Employee Record"));
        output.writeObject(list);
        output.close();
        }
        catch (IOException e)
        {
            
        }
    }
  public static void displayEmployee()
       {
           ArrayList<Employee> list = readFromFile();
           for (Employee em: list)
           {
               System.out.println(em.getName() + "   "+ em.getDesignation()+ "   "+em.getID()+ "   "+ em.getCnic()+ "   "+em.getPhoneNo()+ "   "+em.getPay());
           }
          
        
    
       }
 
    

    
}
