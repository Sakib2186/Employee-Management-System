package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

public class ViewInformationEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JLabel fnametxt;
	private JLabel lnametxt;
	private JLabel gendertxt;
	private JLabel dateofbtxt;
	private JLabel pnumtxt;
	private JLabel idtxt;
	private JLabel depttxt;
	private JLabel addresstxt;
	static ViewInformationEmployeeFrame frame = new ViewInformationEmployeeFrame();
	public void setClear()
	{
		fnametxt.setText("");
		lnametxt.setText("");
		gendertxt.setText("");
		dateofbtxt.setText("");
		pnumtxt.setText("");
		depttxt.setText("");
		idtxt.setText("");
		addresstxt.setText("");
	}
	public void setfnametxt(String n)
	{
		fnametxt.setText(n);
	}
	public void setlnametxt(String n)
	{
		lnametxt.setText(n);
	}
	public void setgendertxt(String n)
	{
		gendertxt.setText(n);
	}
	public void setdateofbtxt(String n)
	{
		dateofbtxt.setText(n);
	}
	public void setpnumtxt(String n)
	{
		pnumtxt.setText(n);
	}
	public void setdepttxt(String n)
	{
		depttxt.setText(n);
	}
	public void setidtxt(String n)
	{
		idtxt.setText(n);
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
	public ViewInformationEmployeeFrame() {
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel("FIRST NAME:");
		lblNewLabel_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(35, 43, 135, 27);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("LAST NAME:");
		lblNewLabel_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(35, 144, 125, 27);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("GENDER:");
		lblNewLabel_1_4_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(282, 43, 94, 27);
		panel_1.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_2_1_1_2_1 = new JLabel("DATE OF BIRTH:");
		lblNewLabel_1_2_1_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_2_1.setBounds(282, 144, 176, 27);
		panel_1.add(lblNewLabel_1_2_1_1_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("PHONE NUMBER:");
		lblNewLabel_1_4.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(521, 43, 176, 27);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_2_1_1_2_1_1 = new JLabel("DEPARTMENT:");
		lblNewLabel_1_2_1_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_2_1_1.setBounds(521, 144, 176, 27);
		panel_1.add(lblNewLabel_1_2_1_1_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(35, 81, 176, 27);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		fnametxt = new JLabel("");
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setBounds(0, 0, 176, 27);
		panel_2.add(fnametxt);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(35, 186, 176, 27);
		panel_1.add(panel_2_1);
		
		lnametxt = new JLabel("");
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.setBounds(0, 0, 176, 27);
		panel_2_1.add(lnametxt);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(282, 81, 176, 27);
		panel_1.add(panel_2_1_1);
		
	    gendertxt = new JLabel("");
		gendertxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		gendertxt.setBounds(0, 0, 176, 27);
		panel_2_1_1.add(gendertxt);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1.setBounds(282, 182, 176, 27);
		panel_1.add(panel_2_1_1_1);
		
		dateofbtxt = new JLabel("");
		dateofbtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		dateofbtxt.setBounds(0, 0, 176, 27);
		panel_2_1_1_1.add(dateofbtxt);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1.setBounds(521, 81, 176, 27);
		panel_1.add(panel_2_1_1_1_1);
		
	    pnumtxt = new JLabel("");
		pnumtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		pnumtxt.setBounds(0, 0, 176, 27);
		panel_2_1_1_1_1.add(pnumtxt);
		
		JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBackground(Color.WHITE);
		panel_2_1_1_1_1_1.setBounds(521, 182, 176, 27);
		panel_1.add(panel_2_1_1_1_1_1);
		
		depttxt = new JLabel("");
		depttxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		depttxt.setBounds(0, 0, 176, 27);
		panel_2_1_1_1_1_1.add(depttxt);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("ADDRESS:");
		lblNewLabel_1_2_1_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(35, 243, 128, 27);
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBackground(Color.WHITE);
		panel_3_1_2.setBounds(137, 243, 321, 27);
		panel_1.add(panel_3_1_2);
		
		addresstxt = new JLabel("");
		addresstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		addresstxt.setBounds(0, 0, 320, 27);
		panel_3_1_2.add(addresstxt);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuFrameEmployee.frame.setVisible(true);
				MainMenuFrameEmployee.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
				frame.setClear();
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(979, 335, 103, 26);
		panel.add(backbtn);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("ID:");
		lblNewLabel_1_4_2.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_4_2.setBounds(720, 21, 50, 27);
		panel.add(lblNewLabel_1_4_2);
		
		idtxt = new JLabel("");
		idtxt.setHorizontalAlignment(SwingConstants.RIGHT);
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 25));
		idtxt.setBounds(760, 21, 168, 27);
		panel.add(idtxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("YOUR INFORMATIONS");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(594, 112, 429, 43);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewInformationEmployeeFrame.class.getResource("/e3/Classes/Images/project.png")));
		lblNewLabel.setBounds(450, 50, 160, 128);
		contentPane.add(lblNewLabel);
	}
}
