package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class AddEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField idtxt;
	private JPasswordField psstxt;
	private JPasswordField confirmpsstxt;
	private JTextField phonenumtxt;
	private String fname,lname,id,gender,pass,passconf,day,month,year,dept,pnum,add;
	static AddEmployeeFrame frame = new AddEmployeeFrame();
	private JComboBox genderbox;
	private JComboBox daybox;
	private JComboBox monthbox;
	private JComboBox yearbox;
	private JComboBox departmentbox;
	private JTextField addresstxt;
	
	public void setVariable()
	{
		fname=null;
		lname=null;
		id=null;
		pass=null;
		passconf=null;
		day=null;
		month=null;
		year=null;
		dept=null;
		pnum=null;
		add=null;
	}
	public void setEmpty()
	{
		fnametxt.setText("");
		lnametxt.setText("");
		idtxt.setText("");
		psstxt.setText("");
		confirmpsstxt.setText("");
		phonenumtxt.setText("");
		genderbox.setSelectedIndex(0);
		daybox.setSelectedIndex(0);
		monthbox.setSelectedIndex(0);
		yearbox.setSelectedIndex(0);
		departmentbox.setSelectedIndex(0);
		addresstxt.setText("");
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddEmployeeFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/e3/Classes/Images/icons8-employee-64.png")));
		setResizable(false);
		setTitle("EMS");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1276, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(68, 240, 1116, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel fnamelabel = new JLabel("FIRST NAME:");
		fnamelabel.setForeground(SystemColor.controlShadow);
		fnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		fnamelabel.setBounds(32, 50, 176, 27);
		panel.add(fnamelabel);
		
		fnametxt = new JTextField();
		fnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				fname = fnametxt.getText();
				
			}
		});
		fnametxt.setToolTipText("FIRST NAME");
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setColumns(10);
		fnametxt.setBounds(32, 88, 273, 27);
		panel.add(fnametxt);
		
		JLabel lnamelabel = new JLabel("LAST NAME:");
		lnamelabel.setForeground(SystemColor.controlShadow);
		lnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lnamelabel.setBounds(32, 140, 176, 27);
		panel.add(lnamelabel);
		
		lnametxt = new JTextField();
		lnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lname = lnametxt.getText();
			}
		});
		lnametxt.setToolTipText("LAST NAME");
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.setColumns(10);
		lnametxt.setBounds(32, 180, 273, 27);
		panel.add(lnametxt);
		
		JLabel idlabel = new JLabel("ID:");
		idlabel.setForeground(SystemColor.controlShadow);
		idlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		idlabel.setBounds(32, 229, 34, 27);
		panel.add(idlabel);
		
		idtxt = new JTextField();
		idtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				id=idtxt.getText();
			}
		});
		idtxt.setToolTipText("ID");
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		idtxt.setColumns(10);
		idtxt.setBounds(32, 267, 273, 27);
		panel.add(idtxt);
		
		JLabel genderlabel = new JLabel("GENDER:");
		genderlabel.setForeground(SystemColor.controlShadow);
		genderlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		genderlabel.setBounds(32, 315, 95, 27);
		panel.add(genderlabel);
		
		genderbox = new JComboBox();
		genderbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = (String)genderbox.getSelectedItem();
				if(gender.equals("SELECT"))
				{
					gender=null;
				}
			}
		});
		
		genderbox.setMaximumRowCount(4);
		genderbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		genderbox.setForeground(Color.BLACK);
		genderbox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Male", "Female", "Others"}));
		genderbox.setBounds(137, 319, 83, 22);
		panel.add(genderbox);
		
		JLabel passwordlabel = new JLabel("PASSWORD:");
		passwordlabel.setForeground(SystemColor.controlShadow);
		passwordlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		passwordlabel.setBounds(350, 50, 176, 27);
		panel.add(passwordlabel);
		
		psstxt = new JPasswordField();
		psstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pass = String.valueOf(psstxt.getPassword());
			}
		});
		psstxt.setToolTipText("PASSWORD");
		psstxt.setBounds(350, 88, 273, 27);
		panel.add(psstxt);
		
		JLabel confirmpasswordlabel = new JLabel("CONFIRM PASSWORD:");
		confirmpasswordlabel.setForeground(SystemColor.controlShadow);
		confirmpasswordlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		confirmpasswordlabel.setBounds(350, 140, 273, 27);
		panel.add(confirmpasswordlabel);
		
		confirmpsstxt = new JPasswordField();
		confirmpsstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				passconf = String.valueOf(confirmpsstxt.getPassword());
			}
		});
		confirmpsstxt.setToolTipText("CONFIRM PASSWORD");
		confirmpsstxt.setBounds(350, 180, 273, 27);
		panel.add(confirmpsstxt);
		
		JLabel dateofblabel = new JLabel("DATE OF BIRTH:");
		dateofblabel.setForeground(SystemColor.controlShadow);
		dateofblabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		dateofblabel.setBounds(350, 229, 176, 27);
		panel.add(dateofblabel);
		
		daybox = new JComboBox();
		daybox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day = (String)daybox.getSelectedItem();
				if(day.equals("DAY"))
				{
					day=null;
				}
			}
		});
		daybox.setModel(new DefaultComboBoxModel(new String[] {"DAY", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		daybox.setSelectedIndex(0);
		daybox.setMaximumRowCount(32);
		daybox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		daybox.setBounds(350, 267, 64, 22);
		panel.add(daybox);
		
		monthbox = new JComboBox();
		monthbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month = (String)monthbox.getSelectedItem();
				if(month.equals("MONTH"))
				{
					month=null;
				}
			}
		});
		monthbox.setModel(new DefaultComboBoxModel(new String[] {"MONTH", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		monthbox.setSelectedIndex(0);
		monthbox.setMaximumRowCount(13);
		monthbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		monthbox.setBounds(424, 267, 91, 22);
		panel.add(monthbox);
		
		 yearbox = new JComboBox();
		yearbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year=(String)yearbox.getSelectedItem();
				if(year.equals("YEAR"))
				{
					year=null;
				}
			}
		});
		yearbox.setModel(new DefaultComboBoxModel(new String[] {"YEAR", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));
		yearbox.setSelectedIndex(0);
		yearbox.setMaximumRowCount(33);
		yearbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		yearbox.setBounds(525, 267, 64, 22);
		panel.add(yearbox);
		
		JLabel departmentlabel = new JLabel("DEPARTMENT:");
		departmentlabel.setForeground(SystemColor.controlShadow);
		departmentlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		departmentlabel.setBounds(350, 315, 146, 27);
		panel.add(departmentlabel);
		
		JLabel phonenumberlabel = new JLabel("PHONE NUMBER:");
		phonenumberlabel.setForeground(SystemColor.controlShadow);
		phonenumberlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		phonenumberlabel.setBounds(668, 50, 176, 27);
		panel.add(phonenumberlabel);
		
		phonenumtxt = new JTextField();
		phonenumtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pnum = phonenumtxt.getText();
			}
		});
		phonenumtxt.setToolTipText("PHONE NUMBER");
		phonenumtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		phonenumtxt.setColumns(10);
		phonenumtxt.setBounds(668, 88, 273, 27);
		panel.add(phonenumtxt);
		
		departmentbox = new JComboBox();
		departmentbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dept = (String)departmentbox.getSelectedItem();
				if(dept.equals("SELECT"))
				{
					dept=null;
				}
			}
		});
		departmentbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		departmentbox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "Finance", "Marketing", "HR", "IT", "Production", "Management"}));
		departmentbox.setSelectedIndex(0);
		departmentbox.setBounds(493, 319, 96, 22);
		panel.add(departmentbox);
		
		JButton addbtn = new JButton("ADD");
		addbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fname==null || lname==null || id==null || pass==null ||
						passconf==null || day==null || month==null || year ==null ||
						dept==null || pnum==null || add==null)
					
				{
					JOptionPane.showMessageDialog(null, "Please enter all fields");
				}
				else
				{
					int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(k==JOptionPane.YES_OPTION)
					{
						if(id.length()==8)
						{
							
							if(pnum.length()==11 && AddEmployeeFrame.checker(pnum))
							{
								if(pass.equals(passconf))
								{
									Employee a = new Employee(fname,lname,id,pass,gender,day,month,year,dept,pnum,add);
									a.addEmployee();
								}
								else
								{
									JOptionPane.showMessageDialog(null, "Password doesn't match");
									psstxt.setText("");
									confirmpsstxt.setText("");
									pass=null;
									passconf=null;
									
								}
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Phonenumber must be digits, of length 11");
								phonenumtxt.setText("");
								pnum=null;
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "ID must be contain 8 digits");
							idtxt.setText("");
							id=null;
						}
					}
					if(k==JOptionPane.NO_OPTION)
					{
						
					}
				}
				
			}
		});
		addbtn.setForeground(Color.BLACK);
		addbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		addbtn.setBackground(UIManager.getColor("Button.shadow"));
		addbtn.setBounds(668, 265, 103, 26);
		panel.add(addbtn);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fnametxt.setText("");
				lnametxt.setText("");
				idtxt.setText("");
				psstxt.setText("");
				confirmpsstxt.setText("");
				phonenumtxt.setText("");
				genderbox.setSelectedIndex(0);
				daybox.setSelectedIndex(0);
				monthbox.setSelectedIndex(0);
				yearbox.setSelectedIndex(0);
				departmentbox.setSelectedIndex(0);
				frame.setVariable();
				
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnClear.setBackground(UIManager.getColor("Button.shadow"));
		btnClear.setBounds(792, 265, 103, 26);
		panel.add(btnClear);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fnametxt.setText("");
				lnametxt.setText("");
				idtxt.setText("");
				psstxt.setText("");
				confirmpsstxt.setText("");
				phonenumtxt.setText("");
				genderbox.setSelectedIndex(0);
				daybox.setSelectedIndex(0);
				monthbox.setSelectedIndex(0);
				yearbox.setSelectedIndex(0);
				departmentbox.setSelectedIndex(0);
				frame.setVariable();
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
				
				
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnBack.setBackground(UIManager.getColor("Button.shadow"));
		btnBack.setBounds(914, 265, 103, 26);
		panel.add(btnBack);
		
		JLabel addresslabel = new JLabel("ADDRESS:");
		addresslabel.setForeground(SystemColor.controlShadow);
		addresslabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		addresslabel.setBounds(668, 140, 176, 27);
		panel.add(addresslabel);
		
		addresstxt = new JTextField();
		addresstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				add = addresstxt.getText();
			}
		});
		addresstxt.setToolTipText("PHONE NUMBER");
		addresstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		addresstxt.setColumns(10);
		addresstxt.setBounds(668, 180, 273, 27);
		panel.add(addresstxt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(21, 32, 619, 333);
		panel.add(panel_1);
		
		JLabel headerlabel = new JLabel("ADD EMPLOYEE");
		headerlabel.setForeground(Color.WHITE);
		headerlabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		headerlabel.setBounds(594, 112, 375, 43);
		contentPane.add(headerlabel);
		
		JLabel headerpicturelabel = new JLabel("");
		headerpicturelabel.setIcon(new ImageIcon(AddEmployeeFrame.class.getResource("/e3/Classes/Images/id-card.png")));
		headerpicturelabel.setBounds(450, 50, 160, 128);
		contentPane.add(headerpicturelabel);
	
	}
	
	public static boolean checker(String D)
	{
		int i,count=0;
		for(i=0;i<D.length();i++)
		{
			if(Character.isDigit(D.charAt(i)))
			{
				count++;
			}
		}
		if(count==11)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
