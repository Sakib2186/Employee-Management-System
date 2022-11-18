package e3.Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JPasswordField txtpasswordField;
	public Login i;
	private String password,ID;
	public static LoginFrame frame = new LoginFrame();
	private JLabel clocktxt;
	Threadclock cl =new Threadclock();
	public void setTxtfieldpass()
	{
		textFieldID.setText("");
		txtpasswordField.setText("");
	}
	public  void setVariable()
	{
		password=null;
		ID=null;
		
	}
	public void setidempty()
	{
		textFieldID.setText("");
	}
	public void setidnull()
	{
		ID=null;
	}
	public void setpassempty()
	{
		txtpasswordField.setText("");
	}
	public void setpassnull()
	{
		password=null;
	}
	public String getID()
	{
		return ID;
	}
	public String getpass()
	{
		return password;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	
	class Threadclock extends Thread
	{
		public void run()
		{
			for(;;)
			{
				try {
					frame.clock();
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void clock()
	{
	
		Calendar cal = new GregorianCalendar();
		int second = cal.get(Calendar.SECOND);
		int minute = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		clocktxt.setText(hour+":"+minute+":"+second);
		
		
		
	}
	public LoginFrame() {
		cl.start();
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/e3/Classes/Images/icons8-employee-64.png")));
		setResizable(false);
		setTitle("EMS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1276, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.textHighlight, null, null, null));
		contentPane.setBackground(new Color(0, 102, 153));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(673, 45, 501, 581);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel loginlabel = new JLabel("LOGIN");
		loginlabel.setFont(new Font("Segoe UI", Font.BOLD, 50));
		loginlabel.setForeground(SystemColor.controlShadow);
		loginlabel.setBounds(176, 42, 162, 85);
		panel.add(loginlabel);
		
		JLabel idlabel = new JLabel("ID:");
		idlabel.setForeground(SystemColor.controlShadow);
		idlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		idlabel.setBounds(96, 248, 162, 41);
		panel.add(idlabel);
		
		textFieldID = new JTextField();
		textFieldID.setToolTipText("ID");
		textFieldID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 ID = textFieldID.getText();
			}
		});
		textFieldID.setFont(new Font("Segoe UI", Font.BOLD, 15));
		textFieldID.setBounds(96, 299, 273, 26);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
		
		JLabel passwordlabel = new JLabel("PASSWORD:");
		passwordlabel.setForeground(SystemColor.controlShadow);
		passwordlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		passwordlabel.setBounds(96, 348, 162, 41);
		panel.add(passwordlabel);
		
		txtpasswordField = new JPasswordField();
		txtpasswordField.setToolTipText("PASSWORD");
		txtpasswordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				password = String.valueOf(txtpasswordField.getPassword());
			}
		});
		txtpasswordField.setFont(new Font("Segoe UI", Font.BOLD, 15));
		txtpasswordField.setBounds(96, 399, 273, 26);
		panel.add(txtpasswordField);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.setBackground(UIManager.getColor("Button.shadow"));
		Loginbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				i=new Login(ID,password);
				i.loginmatch();
				
				
				
			}
		});
		Loginbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Loginbtn.setForeground(SystemColor.desktop);
		Loginbtn.setBounds(124, 470, 103, 26);
		panel.add(Loginbtn);
		
		JButton Clearbtn = new JButton("Clear");
		Clearbtn.setBackground(UIManager.getColor("Button.shadow"));
		Clearbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldID.setText("");
				txtpasswordField.setText("");
				frame.setVariable();
			}
		});
		Clearbtn.setForeground(SystemColor.desktop);
		Clearbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Clearbtn.setBounds(250, 470, 101, 26);
		panel.add(Clearbtn);
		
		JLabel loginlabelpicture = new JLabel("");
		loginlabelpicture.setIcon(new ImageIcon(LoginFrame.class.getResource("/e3/Classes/Images/icons8-login-64 (1).png")));
		loginlabelpicture.setBounds(219, 112, 174, 136);
		panel.add(loginlabelpicture);
		
		JLabel headinglabel = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		headinglabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		headinglabel.setForeground(SystemColor.window);
		headinglabel.setBounds(31, 509, 676, 52);
		contentPane.add(headinglabel);
		
		JLabel EMSpicturelabel = new JLabel("");
		EMSpicturelabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/e3/Classes/Images/team-management.png")));
		EMSpicturelabel.setBounds(189, 134, 284, 364);
		contentPane.add(EMSpicturelabel);
		
		JLabel logolabel = new JLabel("LTD");
		logolabel.setForeground(new Color(255, 255, 255));
		logolabel.setFont(new Font("Arial Black", Font.BOLD, 13));
		logolabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/e3/Classes/Images/icons8-cow-68.png")));
		logolabel.setBounds(10, 11, 173, 55);
		contentPane.add(logolabel);
		
		clocktxt = new JLabel("");
		clocktxt.setFont(new Font("Tahoma", Font.BOLD, 30));
		clocktxt.setForeground(Color.WHITE);
		clocktxt.setBounds(31, 572, 284, 54);
		contentPane.add(clocktxt);
	}
}
