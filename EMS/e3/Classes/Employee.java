package e3.Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Employee {
	
	private String FName;
	private String LName;
	private String ID;
	private String Password;
	private String Gender;
	private String Day,Month,Year;
	private String PNumber;
	private String Department;
	private String Address;
	ArrayList<Employee> list = new ArrayList<>();
	ArrayList<Employee> list2 = new ArrayList<>();
	File fileobj = new File("EMS/e3/Datas/EmployeeInfo.txt");
	File fileobj2 = new File("EMS/e3/Datas/LoginInfo.txt");
	
	public Employee() {}
	public Employee(String fname, String lname,String gender,String day,
			String month, String year,String pnum,String dept,String add)
	{
		FName =fname;
		LName = lname;
		Gender = gender;
		Day = day;
		Month=month;
		Year=year;
		PNumber = pnum;
		Department = dept;
		Address = add;
	}
	public Employee(String ID,String Password)
	{
		this.ID=ID;
		this.Password=Password;
	}
	public Employee(String FName,String LName,String ID,String Password,String Gender,String Day,String Month,String Year,
			String Department,String PNumber,String Address)
	{
		this.FName=FName;
		this.LName=LName;
		this.Gender=Gender;
		this.Day=Day;
		this.Month=Month;
		this.Year=Year;
		this.Department=Department;
		this.PNumber=PNumber;
		this.Address=Address;
		this.ID=ID;
		this.Password=Password;
		
	}
	public void setAddress(String add)
	{
		Address = add;
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
	public void setGender(String g)
	{
		Gender=g;
	}
	public void setBirthdayDay(String day)
	{
		Day=day;
	}
	public void setBirthdayMonth(String month)
	{
		Month=month;
	}
	public void setBirthdayYear(String year)
	{
		Year=year;
	}
	public void setNumber(String n)
	{
		PNumber=n;
	}
	public void setDept(String dep)
	{
		Department=dep;
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
	public String getGender()
	{
		return Gender;
	}
	public String getDay()
	{
		return Day;
	}
	public String getMonth()
	{
		return Month;
	}
	public String getYear()
	{
		return Year;
	}
	public String getPNumber()
	{
		return PNumber;
	}
	public String getDept()
	{
		return Department;
	}
	public String getAddress()
	{
		return Address;
	}
	public void addEmployee()
	{
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				String gender = input.next();
				String day = input.next();
				String month=input.next();
				String year=input.next();
				String pnum = input.next();
				String dept = input.next();
				String add=input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		list.add(new Employee(FName,LName,ID,Password,Gender,Day,Month,Year,Department,PNumber,Address));
		PrintWriter output;
		try {
			output = new PrintWriter(fileobj);
			for(int i=0;i<list.size();i++)
			{
				Employee a = list.get(i);
				String fname,lname,id,pass,gender,day,month,year,pnum,dept,add;
				fname = a.FName;
				lname = a.LName;
				id=a.ID;
				pass = a.Password;
				gender = a.Gender;
				day=a.Day;
				month=a.Month;
				year=a.Year;
				pnum=a.PNumber;
				dept=a.Department;
				add=a.Address;
				
				output.print(fname+" ");
				output.print(lname+" ");
				output.print(id+" ");
				output.print(pass+" ");
				output.print(gender+" ");
				output.print(day+" ");
				output.print(month+" ");
				output.print(year+" ");
				output.print(pnum+" ");
				output.print(dept+" ");
				output.println(add);
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
						list2.add(new Employee(id,pass));
					}
					input2.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
		}
		list2.add(new Employee(ID,Password));
		PrintWriter output2;
		try
		{
			output2 = new PrintWriter(fileobj2);
			for(int i=0;i<list2.size();i++)
			{
				Employee b = list2.get(i);
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
		JOptionPane.showMessageDialog(null, "Employee Added");
		AddEmployeeFrame.frame.setVariable();
		AddEmployeeFrame.frame.setEmpty();
		
	}
	
	public void searchEmployee(String ID1)
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
				String gender = input.next() ;
				String day = input.next();
				String month=input.next();
				String year=input.next();
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
			}
			input.close();
			for(int i=0;i<list.size();i++)
			{
				Employee c = list.get(i);
				if(ID1.equals(c.ID))
				{
					found=true;
					SearchEmployeeFrame.frame.setfnametxt(c.FName);
					SearchEmployeeFrame.frame.setlnametxt(c.LName);
					SearchEmployeeFrame.frame.setid2txt(c.ID);
					SearchEmployeeFrame.frame.setgendertxt(c.Gender);
					SearchEmployeeFrame.frame.setdateofbtxt(c.Day+"."+c.Month+"."+c.Year);
					SearchEmployeeFrame.frame.setdeptxt(c.Department);
					SearchEmployeeFrame.frame.setpnumtxt(c.PNumber);
					SearchEmployeeFrame.frame.setaddresstxt(c.Address);
					break;
						
				}
			}
			if(!found)
			{
				JOptionPane.showMessageDialog(null, "No ID found");
				SearchEmployeeFrame.frame.setidempty();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");
			
		}
		
	}
	public void deleteEmployee(String ID1)
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
				String gender = input.next() ;
				String day = input.next();
				String month=input.next();
				String year=input.next();
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));
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
				Employee a = list.get(i);
				String fname,lname,id,pass,gender,day,month,year,pnum,dept,add;
				fname = a.FName;
				lname = a.LName;
				id=a.ID;
				pass = a.Password;
				gender = a.Gender;
				day=a.Day;
				month=a.Month;
				year=a.Year;
				pnum=a.PNumber;
				dept=a.Department;
				add=a.Address;
				if(ID1.equals(id))
				{
					found=true;
					continue;
				}
				else
				{
					output.print(fname+" ");
					output.print(lname+" ");
					output.print(id+" ");
					output.print(pass+" ");
					output.print(gender+" ");
					output.print(day+" ");
					output.print(month+" ");
					output.print(year+" ");
					output.print(pnum+" ");
					output.print(dept+" ");
					output.println(add);
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
				list2.add(new Employee(id,pass));
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
				Employee a = list2.get(i);
				String id = a.ID;
				String pass = a.Password;
				
				if(ID1.equals(id))
				{
					continue;
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
		DeleteEmployeeFrame.frame.setVariable();
		DeleteEmployeeFrame.frame.setEmpty();
		
	}
	if(!found)
	{
		JOptionPane.showMessageDialog(null, "No ID found");
		DeleteEmployeeFrame.frame.setIdEmpty();
	}
	}
	
	public void searchEmployeeForDeleteEmployeeFrame(String ID1)
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
				String gender = input.next() ;
				String day = input.next();
				String month=input.next();
				String year=input.next();
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
			}
			input.close();
			for(int i=0;i<list.size();i++)
			{
				Employee c = list.get(i);
				if(ID1.equals(c.ID))
				{
					found=true;
					DeleteEmployeeFrame.frame.setfnametxt(c.FName);
					DeleteEmployeeFrame.frame.setlnametxt(c.LName);
					DeleteEmployeeFrame.frame.setid2txt(c.ID);
					DeleteEmployeeFrame.frame.setgendertxt(c.Gender);
					DeleteEmployeeFrame.frame.setdateofbtxt(c.Day+"."+c.Month+"."+c.Year);
					DeleteEmployeeFrame.frame.setdeptxt(c.Department);
					DeleteEmployeeFrame.frame.setpnumtxt(c.PNumber);
					DeleteEmployeeFrame.frame.setaddresstxt(c.Address);
					break;
						
				}
			}
			if(!found)
			{
				JOptionPane.showMessageDialog(null, "No ID found");
				DeleteEmployeeFrame.frame.setIdEmpty();
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");	
		}
		
	}
	
	public void searchEmployeeForViewEmployeeFrame()
	{
		Login l = new Login();
		String ID1=l.getIdnote();
		list.clear();
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				String gender = input.next() ;
				String day = input.next();
				String month=input.next();
				String year=input.next();
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
			}
			input.close();
			for(int i=0;i<list.size();i++)
			{
				Employee c = list.get(i);
				if(ID1.equals(c.ID))
				{
					ViewInformationEmployeeFrame.frame.setfnametxt(c.FName);
					ViewInformationEmployeeFrame.frame.setlnametxt(c.LName);
					ViewInformationEmployeeFrame.frame.setidtxt(c.ID);
					ViewInformationEmployeeFrame.frame.setgendertxt(c.Gender);
					ViewInformationEmployeeFrame.frame.setdateofbtxt(c.Day+"."+c.Month+"."+c.Year);
					ViewInformationEmployeeFrame.frame.setdepttxt(c.Department);
					ViewInformationEmployeeFrame.frame.setpnumtxt(c.PNumber);
					ViewInformationEmployeeFrame.frame.setaddresstxt(c.Address);
					break;
						
				}
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No File Found");	
		}
		
	}
	
	public void displayEmployee()
	{
		list.clear();
		Login l = new Login();
		String ID1=l.getIdnote();
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				String gender = input.next();
				String day = input.next();
				String month = input.next();
				String year = input.next(); 
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
			}
			input.close();
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<list.size();i++)
		{
			Employee c = list.get(i);
			if(ID1.equals(c.ID))
			{
				EditInformationEmployeeFrame.frame.setfname(c.FName);
				EditInformationEmployeeFrame.frame.setlname(c.LName);
				EditInformationEmployeeFrame.frame.setid(c.ID);
				EditInformationEmployeeFrame.frame.setgender(c.Gender);
				EditInformationEmployeeFrame.frame.setdaybox(c.Day);
				EditInformationEmployeeFrame.frame.setmonthbox(c.Month);
				EditInformationEmployeeFrame.frame.setyearbox(c.Year);
				EditInformationEmployeeFrame.frame.setdeptbox(c.Department);
				EditInformationEmployeeFrame.frame.setpnum(c.PNumber);
				EditInformationEmployeeFrame.frame.setaddresstxt(c.Address);
				break;			
			}
		}
	
	}
	
	public void updateEmployee()
	{
		list.clear();
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				String gender = input.next();
				String day = input.next();
				String month = input.next();
				String year = input.next(); 
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
			}
			input.close();
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Login l = new Login();
		String ID1=l.getIdnote();
		PrintWriter o;
		try {
			o = new PrintWriter(fileobj);
			for(int i=0;i<list.size();i++)
			{
				Employee c = list.get(i);
				if(ID1.equals(c.ID))
				{
					o.print(FName+" ");
					o.print(LName+" ");
					o.print(c.ID+" ");
					o.print(c.Password+" ");
					o.print(Gender+" ");
					o.print(Day+" ");
					o.print(Month+" ");
					o.print(Year+" ");
					o.print(PNumber+" ");
					o.print(Department+" ");
					o.println(Address);
				}
				else
				{
					o.print(c.FName+" ");
					o.print(c.LName+" ");
					o.print(c.ID+" ");
					o.print(c.Password+" ");
					o.print(c.Gender+" ");
					o.print(c.Day+" ");
					o.print(c.Month+" ");
					o.print(c.Year+" ");
					o.print(c.PNumber+" ");
					o.print(c.Department+" ");
					o.println(c.Address);
				}
			}
			o.close();
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "No File Found");
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Updated");
		
		
	}
	
	public void updatePassword(String Password,String oldpass)
	{
		list.clear();
		Login l = new Login();
		String ID=l.getIdnote();
		boolean found=false,found2=false;
		try {
			Scanner input = new Scanner(fileobj);
			while(input.hasNext())
			{
				String fname = input.next();
				String lname = input.next();
				String id = input.next();
				String pass = input.next();
				String gender = input.next();
				String day = input.next();
				String month = input.next();
				String year = input.next();
				String pnum = input.next();
				String dept = input.next();
				String add = input.next();
				list.add(new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add));	
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
				Employee a = list.get(i);
				String fname = a.FName;
				String lname = a.LName;
				String id = a.ID;
				String pass = a.Password;
				String gender = a.Gender;
				String day = a.Day;
				String month = a.Month;
				String year = a.Year;
				String pnum = a.PNumber;
				String dept = a.Department;
				String add = a.Address;
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
						output.print(pass+" ");
						output.print(gender+" ");
						output.print(day+" ");
						output.print(month+" ");
						output.print(year+" ");
						output.print(pnum+" ");
						output.print(dept+" ");
						output.println(add);
						continue;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Old password doesn't match");
						UpdatePasswordEmployeeFrame.frame.setoldpasstxt();
						UpdatePasswordEmployeeFrame.frame.RecApt();
						UpdatePasswordEmployeeFrame.frame.setRecaptcha();
						output.print(fname+" ");
						output.print(lname+" ");
						output.print(id+" ");
						output.print(pass+" ");
						output.print(gender+" ");
						output.print(day+" ");
						output.print(month+" ");
						output.print(year+" ");
						output.print(pnum+" ");
						output.print(dept+" ");
						output.println(add);
						
					}
				}
				else
				{
					output.print(fname+" ");
					output.print(lname+" ");
					output.print(id+" ");
					output.print(pass+" ");
					output.print(gender+" ");
					output.print(day+" ");
					output.print(month+" ");
					output.print(year+" ");
					output.print(pnum+" ");
					output.print(dept+" ");
					output.println(add);
					continue;
				}
			}
			if(!found)
			{
				JOptionPane.showMessageDialog(null, "No ID found");
				
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
				list2.add(new Employee(Id,pass));
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
			 Employee b = list2.get(i);
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
		UpdatePasswordEmployeeFrame.frame.setVariable();
		UpdatePasswordEmployeeFrame.frame.setNull();
		UpdatePasswordEmployeeFrame.RecApt();
		
		}
		
		
	}
	
}
