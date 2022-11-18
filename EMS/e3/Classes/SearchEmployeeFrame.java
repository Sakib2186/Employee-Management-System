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
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class SearchEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JLabel fnametxt;
	private JTextField idtxt;
	private JLabel lnametxt;
	private JLabel gendertxt;
	private JLabel dateofbtxt;
	private JLabel pnumtxt;
	private JLabel depttxt;
	private JLabel idtxt2;
	private JLabel addresstxt;
	static SearchEmployeeFrame frame = new SearchEmployeeFrame();
	private String id;
	public void setVariable()
	{
		idtxt.setText("");
		fnametxt.setText("");
		lnametxt.setText("");
		gendertxt.setText("");
		dateofbtxt.setText("");
		depttxt.setText("");
		pnumtxt.setText("");
		idtxt2.setText("");
		addresstxt.setText("");
	}
	public void setidempty()
	{
		id=null;
		idtxt.setText("");
	}
	public void setEmpty()
	{
		id=null;
	}
	public void setfnametxt(String n)
	{
		fnametxt.setText(n);
	}
	public void setlnametxt(String n)
	{
		lnametxt.setText(n);
	}
	public void setid2txt(String n)
	{
		idtxt2.setText(n);
	}
	public void setgendertxt(String n)
	{
		gendertxt.setText(n);
	}
	public void setdateofbtxt(String n)
	{
		dateofbtxt.setText(n);
	}
	public void setdeptxt(String n)
	{
		depttxt.setText(n);
	}
	public void setpnumtxt(String n)
	{
		pnumtxt.setText(n);
	}
	public void setaddresstxt(String n)
	{
		addresstxt.setText(n);
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
	public SearchEmployeeFrame() {
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
		
		JLabel lblNewLabel_1_2 = new JLabel("ID:");
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(32, 50, 33, 27);
		panel.add(lblNewLabel_1_2);
		
		idtxt = new JTextField();
		idtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				id = idtxt.getText();
			}
		});
		idtxt.setToolTipText("ID");
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		idtxt.setColumns(10);
		idtxt.setBounds(32, 79, 273, 27);
		panel.add(idtxt);
		
		JButton searchbtn = new JButton("SEARCH");
		searchbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee a = new Employee();
				if(id==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter ID field");
				}
				else
				{
					if(id.length()==8)
					{
						
						a.searchEmployee(id);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "ID must be 8 digits");
						idtxt.setText("");
					}
				}
			}
		});
		searchbtn.setForeground(Color.BLACK);
		searchbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		searchbtn.setBackground(UIManager.getColor("Button.shadow"));
		searchbtn.setBounds(315, 79, 103, 26);
		panel.add(searchbtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(32, 130, 386, 237);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("FIRST NAME:");
		lblNewLabel_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(10, 27, 176, 27);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("LAST NAME:");
		lblNewLabel_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(10, 98, 176, 27);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 60, 176, 27);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		fnametxt = new JLabel("");
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setBounds(0, 0, 176, 27);
		panel_3.add(fnametxt);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(10, 136, 176, 27);
		panel_1.add(panel_3_1);
		
		lnametxt = new JLabel("");
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.setBounds(0, 0, 176, 27);
		panel_3_1.add(lnametxt);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("ADDRESS:");
		lblNewLabel_1_2_1_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(10, 188, 128, 27);
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBackground(Color.WHITE);
		panel_3_1_2.setBounds(112, 188, 176, 27);
		panel_1.add(panel_3_1_2);
		
		addresstxt = new JLabel("");
		addresstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		addresstxt.setBounds(0, 0, 176, 27);
		panel_3_1_2.add(addresstxt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(467, 56, 550, 311);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("GENDER:");
		lblNewLabel_1_4_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(10, 33, 94, 27);
		panel_2.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1_2_1 = new JLabel("DATE OF BIRTH:");
		lblNewLabel_1_2_1_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_2_1.setBounds(10, 87, 176, 27);
		panel_2.add(lblNewLabel_1_2_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1_2_1_1 = new JLabel("DEPARTMENT:");
		lblNewLabel_1_2_1_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_2_1_1.setBounds(10, 175, 176, 27);
		panel_2.add(lblNewLabel_1_2_1_1_2_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("PHONE NUMBER:");
		lblNewLabel_1_4.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(216, 87, 176, 27);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("ID:");
		lblNewLabel_1_4_2.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_4_2.setBounds(216, 175, 176, 27);
		panel_2.add(lblNewLabel_1_4_2);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVariable();
				frame.setEmpty();
				
			}
		});
		clearbtn.setForeground(Color.BLACK);
		clearbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		clearbtn.setBackground(UIManager.getColor("Button.shadow"));
		clearbtn.setBounds(313, 274, 103, 26);
		panel_2.add(clearbtn);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
				frame.setVariable();
				frame.setEmpty();
				frame.setVisible(false);
				
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(426, 274, 103, 26);
		panel_2.add(backbtn);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setBounds(99, 33, 94, 27);
		panel_2.add(panel_3_1_1);
		
		gendertxt = new JLabel("");
		gendertxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		gendertxt.setBounds(0, 0, 94, 27);
		panel_3_1_1.add(gendertxt);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setLayout(null);
		panel_3_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1.setBounds(10, 125, 168, 27);
		panel_2.add(panel_3_1_1_1);
		
		dateofbtxt = new JLabel("");
		dateofbtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		dateofbtxt.setBounds(0, 0, 168, 27);
		panel_3_1_1_1.add(dateofbtxt);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1.setBounds(216, 125, 168, 27);
		panel_2.add(panel_3_1_1_1_1);
		
		pnumtxt = new JLabel("");
		pnumtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		pnumtxt.setBounds(0, 0, 168, 27);
		panel_3_1_1_1_1.add(pnumtxt);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1.setBounds(10, 213, 168, 27);
		panel_2.add(panel_3_1_1_1_1_1);
		
		depttxt = new JLabel("");
		depttxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		depttxt.setBounds(0, 0, 168, 27);
		panel_3_1_1_1_1_1.add(depttxt);
		
		JPanel panel_3_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1.setLayout(null);
		panel_3_1_1_1_1_1_1.setBackground(Color.WHITE);
		panel_3_1_1_1_1_1_1.setBounds(216, 213, 168, 27);
		panel_2.add(panel_3_1_1_1_1_1_1);
		
		idtxt2 = new JLabel("");
		idtxt2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		idtxt2.setBounds(0, 0, 168, 27);
		panel_3_1_1_1_1_1_1.add(idtxt2);
		
		JLabel lblNewLabel_1_3 = new JLabel("SEARCH EMPLOYEE");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(594, 112, 375, 43);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SearchEmployeeFrame.class.getResource("/e3/Classes/Images/look-for.png")));
		lblNewLabel.setBounds(450, 50, 160, 128);
		contentPane.add(lblNewLabel);
	}
}
