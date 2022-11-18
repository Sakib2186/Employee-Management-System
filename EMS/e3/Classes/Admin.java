package e3.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Admin {
	private String FName;
	private String LName;
	private String ID;
	private String Password;
	ArrayList<Admin> list = new ArrayList<>();
    ArrayList<Admin> list2 = new ArrayList<>();
    Login l = new Login();
	File fileobj = new File("EMS/e3/Datas/AdminInfo.txt");
	File fileobj2 = new File("EMS/e3/Datas/LoginInfo.txt");
	
	public Admin() {}
	public Admin(String ID,String Password)
	{
		this.ID=ID;
		this.Password=Password;
	}
	
	public Admin(String FName,String LName,String ID,String Password)
	{
		this.FName=FName;
		this.LName=LName;
		this.ID=ID;
		this.Password=Password;
		
	}
	public void setFName(String fname)
	{
		FName=fname;
	}
	public void setLName(String lname)
	{
		LName=lname;
	}
	public void setID(String id)
	{
		ID=id;
	}
	public void setPassword(String pass)
	{
		Password = pass;
	}
	public String getFName()
	{
		return FName;
	}
	public String getLName()
	{
		return LName;
	}
	public String getID()
	{
		return ID;
	}
	public String getPassword()
	{
		return Password;
	}
	
	public void addAdmin()
	{
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				list.add(new Admin(fname,lname,id,pass));
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		
		list.add(new Admin(FName,LName,ID,Password));
		PrintWriter output;
		try {
			output = new PrintWriter(fileobj);
			for(int i=0;i<list.size();i++)
			{
				Admin a = list.get(i);
				String fname,lname,id,pass;
				fname = a.FName;
				lname = a.LName;
				id=a.ID;
				pass = a.Password;
				
				output.print(fname+" ");
				output.print(lname+" ");
				output.print(id+" ");
				output.println(pass);
					
				
			}
			output.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		
		try {
			Scanner input2 = new Scanner(fileobj2);
					while(input2.hasNext())
					{
						String id = input2.next();
						String pass = input2.next();
						list2.add(new Admin(id,pass));
					}
					input2.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		list2.add(new Admin(ID,Password));
		PrintWriter output2;
		try
		{
			output2 = new PrintWriter(fileobj2);
			for(int i=0;i<list2.size();i++)
			{
				Admin b = list2.get(i);
				String id,pass;
				id= b.ID;
				pass=b.Password;
				output2.print(id+" ");
				output2.println(pass);
			}
			output2.close();
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "No File Found");
		
	}
		JOptionPane.showMessageDialog(null, "Admin Added");	
		AddAdminFrame.frame.setVariable();
		AddAdminFrame.frame.setEmpty();
	}
	
	public void updatePassword(String Password,String oldpass)
	{
		Login l = new Login();
		String ID=l.getIdnote();
		list.clear();
		boolean found=false,found2=false;
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				list.add(new Admin(fname,lname,id,pass));	
			}
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		PrintWriter output;
		try {
			output = new PrintWriter(fileobj);
			for(int i=0;i<list.size();i++)
			{
				Admin a = list.get(i);
				String fname = a.FName;
				String lname = a.LName;
				String id = a.ID;
				String pass = a.Password;
				
				if(ID.equals(id))
				{
					found=true;
					if(oldpass.equals(pass))
					{
						found2=true;
						pass= Password;
						output.print(fname+" ");
						output.print(lname+" ");
						output.print(id+" ");
						output.println(pass);
						continue;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Old password doesn't match");
						UpdatePassword.frame.setoldpass();
						output.print(fname+" ");
						output.print(lname+" ");
						output.print(id+" ");
						output.println(pass);
						
					}
				}
				else
				{
					output.print(fname+" ");
					output.print(lname+" ");
					output.print(id+" ");
					output.println(pass);
					continue;
				}
			}
			if(!found)
			{
				JOptionPane.showMessageDialog(null, "No ID found");
				UpdatePassword.frame.setEmpty();
				
			}
			output.close();
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		if(found && found2)
		{
		list2.clear();
		try {
			Scanner input2 = new Scanner(fileobj2);
			while(input2.hasNext())
			{
				String Id = input2.next();
				String pass = input2.next();
				list2.add(new Admin(Id,pass));
			}
			input2.close();
				
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No File Found");
			e.printStackTrace();
		}
		PrintWriter output2;
		try {
			
		 output2 = new PrintWriter(fileobj2);
		 for(int i=0;i<list2.size();i++)
		 {
			 Admin b = list2.get(i);
			 String id = b.ID;
			 String pass = b.Password;
			 if(id.equals(ID))
			 {
				 pass = Password;
				 output2.print(id+" ");
				 output2.println(pass);
				 continue;
			 }
			 output2.print(id+" ");
			 output2.println(pass);
			 
			 	 
		 }
		 output2.close();
		
		}
		 catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "No File Found");
				e.printStackTrace();
			}
		JOptionPane.showMessageDialog(null, "Updated");
		UpdatePassword.frame.setVariable();
		UpdatePassword.frame.setEmpty();
		
		}
		
		
	}
	
	public void deleteAdmin(String ID1)
	{
		boolean found=false,found2=false;
		list.clear();
		Login l =new Login();
		String ID2=l.getIdnote();
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				list.add(new Admin(fname,lname,id,pass));
			}
			input.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		PrintWriter output;
		try {
			output = new PrintWriter(fileobj);
			for(int i=0;i<list.size();i++)
			{
				Admin a = list.get(i);
				String fname = a.FName;
				String lname = a.LName;
				String id=a.ID;
				String pass = a.Password;
				
				if(ID1.equals(id))
				{
					if(ID1.equals(ID2))
					{
						found2=true;
						found=true;
						continue;
					}
					else
					{
						found=true;
						continue;
					}
					
				}
				else
				{
					output.print(fname+" ");
					output.print(lname+" ");
					output.print(id+" ");
					output.println(pass);
				}
			}
			output.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
			
		}
		if(found) {
		list2.clear();
		try {
			Scanner input2 = new Scanner(fileobj2);
			while(input2.hasNext())
			{
				String id = input2.next();
				String pass = input2.next();
				list2.add(new Admin(id,pass));
			}
			input2.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		PrintWriter output2;
		try {
			output2 = new PrintWriter(fileobj2);
			for(int i=0;i<list2.size();i++)
			{
				Admin a = list2.get(i);
				String id = a.ID;
				String pass = a.Password;
				
				if(ID1.equals(id))
				{
					if(ID1.equals(ID2))
					{
						continue;
					}
					else
					{
						continue;
					}
				}
				else
				{
					output2.print(id+" ");
					output2.println(pass);
				}
			}
			output2.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
			
		}
		JOptionPane.showMessageDialog(null, "Deleted");
		DeleteAdminFrame.frame.setEmptyAll();
	}
	if(found2)
	{
		LoginFrame.frame.setVisible(true);
		LoginFrame.frame.setLocationRelativeTo(null);
		DeleteAdminFrame.frame.setVisible(false);
		DeleteAdminFrame.frame.setVariable();
		DeleteAdminFrame.frame.setEmptyAll();
	}
	if(!found)
	{
		JOptionPane.showMessageDialog(null, "No ID found");
		DeleteAdminFrame.frame.setEmptyId();
	}
	}

	public void searchAdmin(String ID1)
	{
		boolean found=false;
		list.clear();
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				list.add(new Admin(fname,lname,id,pass));
			}
			input.close();
			
			for(int i=0;i<list.size();i++)
			{
				Admin c = list.get(i);
				if(ID1.equals(c.ID))
				{
					found=true;
					DeleteAdminFrame.frame.setfname(c.FName);
					DeleteAdminFrame.frame.setlname(c.LName);
					break;
				}
			}
			if(!found)
			{
				JOptionPane.showMessageDialog(null, "No ID found");
				DeleteAdminFrame.frame.setEmptyId();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
			
		}
		
	}
	
	
	
}
