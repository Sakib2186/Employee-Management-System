package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class EditInformationEmployeeFrame extends JFrame {

	private JPanel contentPane;
	static EditInformationEmployeeFrame frame = new EditInformationEmployeeFrame();
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField pnumtxt;
	private JLabel idtxt;
	private JComboBox genderbox;
	private JComboBox daybox;
	private JComboBox monthbox;
	private JComboBox yearbox;
	private JComboBox departmentbox;
	private String fname2,lname2,pnum2,add2;
	private String fname,lname,gender,day,month,year,pnum,dept,add;
	private JTextField addresstxt;
	
	public void setid(String n)
	{
		idtxt.setText(n);
	}
	public void setfname(String n)
	{
		fnametxt.setText(n);
		fname2=n;
	}
	public void setlname(String n)
	{
		lnametxt.setText(n);
		lname2 = n;
	}
	public void setaddresstxt(String n)
	{
		addresstxt.setText(n);
		add2=n;
	}
	public void setgender(String n)
	{
		genderbox.setSelectedItem(n);
	}
	public void setdaybox(String n)
	{
		daybox.setSelectedItem(n);
	}
	public void setmonthbox(String n)
	{
		monthbox.setSelectedItem(n);
	}
	public void setyearbox(String n)
	{
		yearbox.setSelectedItem(n);
	}
	public void setpnum(String n)
	{
		pnumtxt.setText(n);
		pnum2=n;
	}
	public void setdeptbox(String n)
	{
		departmentbox.setSelectedItem(n);
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
	public EditInformationEmployeeFrame() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(38, 53, 890, 308);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel fnamelabel = new JLabel("FIRST NAME:");
		fnamelabel.setForeground(SystemColor.controlShadow);
		fnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		fnamelabel.setBounds(35, 45, 135, 27);
		panel_1.add(fnamelabel);
		
		fnametxt = new JTextField();
		fnametxt.setToolTipText("FIRST NAME");
		fnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				fname = fnametxt.getText();
			}
		});
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setBounds(35, 81, 176, 27);
		panel_1.add(fnametxt);
		fnametxt.setColumns(10);
		
		JLabel lnamelabel = new JLabel("LAST NAME:");
		lnamelabel.setForeground(SystemColor.controlShadow);
		lnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lnamelabel.setBounds(35, 144, 135, 27);
		panel_1.add(lnamelabel);
		
		lnametxt = new JTextField();
		lnametxt.setToolTipText("LAST NAME");
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				lname = lnametxt.getText();
				if(lname.equals(null))
				{
					lname=lname2;
				}

			}
		});
		lnametxt.setColumns(10);
		lnametxt.setBounds(35, 186, 176, 27);
		panel_1.add(lnametxt);
		
		JLabel genderlabel = new JLabel("GENDER:");
		genderlabel.setForeground(SystemColor.controlShadow);
		genderlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		genderlabel.setBounds(282, 43, 94, 27);
		panel_1.add(genderlabel);
		
		JLabel dateofblabel = new JLabel("DATE OF BIRTH:");
		dateofblabel.setForeground(SystemColor.controlShadow);
		dateofblabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		dateofblabel.setBounds(282, 144, 176, 27);
		panel_1.add(dateofblabel);
		
		JLabel pnumlabel = new JLabel("PHONE NUMBER:");
		pnumlabel.setForeground(SystemColor.controlShadow);
		pnumlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		pnumlabel.setBounds(560, 45, 176, 27);
		panel_1.add(pnumlabel);
		
		pnumtxt = new JTextField();
		pnumtxt.setToolTipText("PHONE NUMBER");
		pnumtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		pnumtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pnum = pnumtxt.getText();
				if(pnum.equals(null))
				{
					pnum=pnum2;
				}
			}
		});
		pnumtxt.setColumns(10);
		pnumtxt.setBounds(560, 81, 176, 27);
		panel_1.add(pnumtxt);
		
		JLabel deptlabel = new JLabel("DEPARTMENT:");
		deptlabel.setForeground(SystemColor.controlShadow);
		deptlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		deptlabel.setBounds(560, 144, 176, 27);
		panel_1.add(deptlabel);
		
		daybox = new JComboBox();
		daybox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day =(String)daybox.getSelectedItem();
			}
		});
		daybox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		daybox.setSelectedIndex(0);
		daybox.setMaximumRowCount(31);
		daybox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		daybox.setBounds(282, 186, 64, 22);
		panel_1.add(daybox);
		
		monthbox = new JComboBox();
		monthbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month = (String)monthbox.getSelectedItem();
			}
		});
		monthbox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		monthbox.setSelectedIndex(0);
		monthbox.setMaximumRowCount(12);
		monthbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		monthbox.setBounds(356, 186, 91, 22);
		panel_1.add(monthbox);
		
		yearbox = new JComboBox();
		yearbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year =(String)yearbox.getSelectedItem();
			}
		});
		yearbox.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));
		yearbox.setSelectedIndex(0);
		yearbox.setMaximumRowCount(32);
		yearbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		yearbox.setBounds(457, 186, 71, 22);
		panel_1.add(yearbox);
		
		departmentbox = new JComboBox();
		departmentbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dept = (String)departmentbox.getSelectedItem();
			}
		});
		departmentbox.setMaximumRowCount(7);
		departmentbox.setModel(new DefaultComboBoxModel(new String[] {"Finance", "Marketing", "HR", "IT", "Production", "Management"}));
		departmentbox.setSelectedIndex(0);
		departmentbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		departmentbox.setBounds(560, 186, 135, 27);
		panel_1.add(departmentbox);
		
	    genderbox = new JComboBox();
	    genderbox.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		gender = (String)genderbox.getSelectedItem();
	    	}
	    });
	    genderbox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		genderbox.setMaximumRowCount(3);
		genderbox.setForeground(Color.BLACK);
		genderbox.setFont(new Font("Segoe UI", Font.BOLD, 15));
		genderbox.setBounds(282, 81, 83, 22);
		panel_1.add(genderbox);
		
		JLabel addresslabel = new JLabel("ADDRESS:");
		addresslabel.setForeground(SystemColor.controlShadow);
		addresslabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		addresslabel.setBounds(35, 245, 128, 27);
		panel_1.add(addresslabel);
		
		addresstxt = new JTextField();
		addresstxt.setToolTipText("ADDRESS");
		addresstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				add = addresstxt.getText();
			}
		});
		addresstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		addresstxt.setColumns(10);
		addresstxt.setBounds(136, 245, 311, 27);
		panel_1.add(addresstxt);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuFrameEmployee.frame.setVisible(true);
				MainMenuFrameEmployee.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(978, 335, 103, 26);
		panel.add(backbtn);
		
		JButton backbtn_1 = new JButton("UPDATE");
		backbtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
				if(k==JOptionPane.YES_OPTION)
				{
					if(fname==null)
					{
						fname=fname2;
					}
					if(pnum==null)
					{
						pnum=pnum2;
					}
					if(lname==null)
					{
						lname=lname2;
					}
					if(add==null)
					{
						add=add2;
					}
					if(AddEmployeeFrame.checker(pnum))
					{
						Employee o =  new Employee(fname,lname,gender,day,month,year,pnum,dept,add); 
						o.updateEmployee();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Phone number must be 11 digits");
					}
				}
				if(k==JOptionPane.NO_OPTION)
				{
					
				}
			}
		});
		backbtn_1.setForeground(Color.BLACK);
		backbtn_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn_1.setBackground(UIManager.getColor("Button.shadow"));
		backbtn_1.setBounds(978, 298, 103, 26);
		panel.add(backbtn_1);
		
		JLabel idlabel = new JLabel("ID:");
		idlabel.setForeground(SystemColor.controlShadow);
		idlabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		idlabel.setBounds(715, 21, 48, 27);
		panel.add(idlabel);
		
	    idtxt = new JLabel("");
	    idtxt.setHorizontalAlignment(SwingConstants.RIGHT);
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 25));
		idtxt.setBounds(760, 21, 168, 27);
		panel.add(idtxt);
		
		JLabel headerlabel = new JLabel("EDIT INFORMATIONS");
		headerlabel.setForeground(Color.WHITE);
		headerlabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		headerlabel.setBounds(594, 112, 429, 43);
		contentPane.add(headerlabel);
		
		JLabel headerpicturelabel = new JLabel("");
		headerpicturelabel.setIcon(new ImageIcon(EditInformationEmployeeFrame.class.getResource("/e3/Classes/Images/resume.png")));
		headerpicturelabel.setBounds(450, 50, 160, 128);
		contentPane.add(headerpicturelabel);
	}
	
}
