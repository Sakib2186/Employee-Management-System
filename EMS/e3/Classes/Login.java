package e3.Classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login {
	
	private String ID;
	private String Password;
	private boolean found=false;
	private static String idnote;
	
	File fileobj = new File("EMS/e3/Datas/LoginInfo.txt");
	public Login()
	{
		
	}
	public String getIdnote()
	{
		return idnote;
	}
	public Login(String Id,String Password)
	{
		
		ID=Id;
		this.Password=Password;
		
	}
	public void loginmatch()
	{
		int count=0;
		idnote=null;
		if(LoginFrame.frame.getID()!=null)
		{
			if(ID.length()==8)
			{
				for(int i=0;i<8;i++)
				{
					if(Character.isDigit(ID.charAt(i)))
					{
						count++;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid ID");
						LoginFrame.frame.setidempty();
						LoginFrame.frame.setidnull();
						LoginFrame.frame.setpassempty();
						LoginFrame.frame.setpassnull();
						return;
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid ID");
				LoginFrame.frame.setidempty();
				LoginFrame.frame.setidnull();
				LoginFrame.frame.setpassempty();
				LoginFrame.frame.setpassnull();
				return;
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No ID entered");
			return;
		}
		
		
	if(count==8) {
	try {
	Scanner input = new Scanner(fileobj);
	while(input.hasNext())
	{
		String id = input.next();
		if(id.equals(ID))
		{
			found=true;
		}
		if(found)
		{
			
			if(ID.charAt(5)=='6' && ID.charAt(6)=='3' && ID.charAt(7)=='0')
			{
				if(LoginFrame.frame.getpass()!=null)
				{
					String pass = input.next();
					if(pass.equals(Password))
					{
						idnote = ID.substring(0);
						JOptionPane.showMessageDialog(null,"Welcome");
						LoginFrame.frame.setTxtfieldpass();
						MainMenuFrame.frame.setIdNotetxt();
						MainMenuFrame.frame.setVisible(true);
						MainMenuFrame.frame.setLocationRelativeTo(null);
						LoginFrame.frame.setVisible(false);
						LoginFrame.frame.setVariable();
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect Password");
						LoginFrame.frame.setpassempty();
						LoginFrame.frame.setpassnull();
						break;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No password entered");
					break;
				}
				
			}
			if(ID.charAt(5)=='1' && ID.charAt(6)=='2' && ID.charAt(7)=='8')
			{
				String pass = input.next();
				if(LoginFrame.frame.getpass()!=null)
				{
					if(pass.equals(Password))
					{
						idnote = ID.substring(0);
						JOptionPane.showMessageDialog(null ,"Welcome");
						MainMenuFrameEmployee.frame.setVisible(true);
						MainMenuFrameEmployee.frame.setLocationRelativeTo(null);
						MainMenuFrameEmployee.frame.setIdNotetxt();
						LoginFrame.frame.setVisible(false);
						LoginFrame.frame.setTxtfieldpass();
						LoginFrame.frame.setVariable();
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect Password");
						LoginFrame.frame.setpassempty();
						LoginFrame.frame.setpassnull();
						
						break;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No password entered");
					break;
				}
				
			}
		}
		else
		{
			continue;
		}
	}
	if(!found)
	{
		JOptionPane.showMessageDialog(null,"ID Not Registered");
		LoginFrame.frame.setidempty();
		LoginFrame.frame.setidnull();
		LoginFrame.frame.setpassempty();
		LoginFrame.frame.setpassnull();
	}
	input.close();

	}
	catch(FileNotFoundException e)
	{
		JOptionPane.showMessageDialog(null,"No File Found!");
	}
	
	
	
	}
}
}


