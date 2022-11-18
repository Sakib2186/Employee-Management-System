package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdatePasswordEmployeeFrame extends JFrame {
	static UpdatePasswordEmployeeFrame frame = new UpdatePasswordEmployeeFrame();
	private JPanel contentPane;
	private JPasswordField oldpasstxt;
	private JPasswordField newpasstxt;
	private JPasswordField newpassconftxt;
	private static JLabel recap;
	private JLabel idtxt;
	private JTextField recaptchatxt;
	private static String n;	
	private String oldpass,newpass,recaptcha;
	private String confpass;

	public void setVariable()
	{
		oldpasstxt.setText("");
		newpasstxt.setText("");
		newpassconftxt.setText("");
		recaptchatxt.setText("");
		recap.setText("");
		
		
	}
	public void setRecaptcha()
	{
		recaptcha=null;
		recaptchatxt.setText("");
	}
	public void setoldpasstxt()
	{
		oldpasstxt.setText("");
		oldpass=null;
	}
	public void setNull()
	{
		oldpass=null;
	    newpass=null;
	    confpass=null;
	    recaptcha=null;
	}
	public void setID()
	{
		Login i = new Login();
		String id = i.getIdnote();
		idtxt.setText(id);
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

	public static void RecApt()
	{
		int num = (int)(1000+Math.random()*90000);
	    n = String.valueOf(num);
		recap.setText(n);
	}
	public UpdatePasswordEmployeeFrame() {
		
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
		
		JLabel lblNewLabel_1_2_1 = new JLabel("OLD PASSWORD:");
		lblNewLabel_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(35, 45, 170, 27);
		panel_1.add(lblNewLabel_1_2_1);
		
		oldpasstxt = new JPasswordField();
		oldpasstxt.setToolTipText("OLD PASSWORD");
		oldpasstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				oldpass = String.valueOf(oldpasstxt.getPassword());
			}
		});
		oldpasstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		oldpasstxt.setBounds(35, 90, 170, 27);
		panel_1.add(oldpasstxt);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("NEW PASSWORD:");
		lblNewLabel_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(266, 45, 170, 27);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		newpasstxt = new JPasswordField();
		newpasstxt.setToolTipText("NEW PASSWORD");
		newpasstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				newpass= String.valueOf(newpasstxt.getPassword());
			}
		});
		newpasstxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		newpasstxt.setBounds(266, 90, 170, 27);
		panel_1.add(newpasstxt);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("CONFIRM PASSWORD:");
		lblNewLabel_1_2_1_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1_1.setBounds(266, 159, 232, 27);
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		newpassconftxt = new JPasswordField();
		newpassconftxt.setToolTipText("CONFIRM PASSWORD");
		newpassconftxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				confpass = String.valueOf(newpassconftxt.getPassword());
			}
		});
		newpassconftxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		newpassconftxt.setBounds(266, 202, 170, 27);
		panel_1.add(newpassconftxt);
		
		recap = new JLabel("");
		recap.setHorizontalAlignment(SwingConstants.CENTER);
		recap.setVerticalAlignment(SwingConstants.BOTTOM);
		recap.setFont(new Font("HelvLight", Font.BOLD | Font.ITALIC, 30));
		recap.setBounds(617, 55, 238, 148);
		panel_1.add(recap);
		
		recaptchatxt = new JTextField();
		recaptchatxt.setToolTipText("RECAPTCHA");
		recaptchatxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				recaptcha = recaptchatxt.getText();
			}
		});
		recaptchatxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		recaptchatxt.setBounds(617, 224, 225, 27);
		panel_1.add(recaptchatxt);
		recaptchatxt.setColumns(10);
		
		JButton updatebtn = new JButton("UPDATE");
		updatebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee o = new Employee();
				if(oldpass==null || newpass==null || confpass==null ||
						recaptcha==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter all fields");
				}
				else
				{
					int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(k==JOptionPane.YES_OPTION)
					{
						if(frame.CheckRec(recaptcha))
						{
							if(newpass.equals(confpass))
							{
								o.updatePassword(newpass,oldpass);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Password doesn't match");
								UpdatePasswordEmployeeFrame.RecApt();
								recaptchatxt.setText("");
								recaptcha=null;
								newpassconftxt.setText("");
								newpasstxt.setText("");
								newpass=null;
								confpass=null;
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Recaptcha doesn't match");
							UpdatePasswordEmployeeFrame.RecApt();
							recaptchatxt.setText("");
							recaptcha=null;
						}
					}
					if(k==JOptionPane.NO_OPTION)
					{

					}
				}
			}
		});
		updatebtn.setForeground(Color.BLACK);
		updatebtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		updatebtn.setBackground(UIManager.getColor("Button.shadow"));
		updatebtn.setBounds(979, 260, 103, 26);
		panel.add(updatebtn);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVariable();
				frame.setNull();
				UpdatePasswordEmployeeFrame.RecApt();
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnClear.setBackground(UIManager.getColor("Button.shadow"));
		btnClear.setBounds(979, 297, 103, 26);
		panel.add(btnClear);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVariable();
				frame.setNull();
				UpdatePasswordEmployeeFrame.RecApt();
				MainMenuFrameEmployee.frame.setVisible(true);
				MainMenuFrameEmployee.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
				
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnBack.setBackground(UIManager.getColor("Button.shadow"));
		btnBack.setBounds(979, 335, 103, 26);
		panel.add(btnBack);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("ID:");
		lblNewLabel_1_4_2.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_4_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_4_2.setBounds(721, 21, 44, 27);
		panel.add(lblNewLabel_1_4_2);
		
		idtxt = new JLabel("");
		idtxt.setHorizontalAlignment(SwingConstants.RIGHT);
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 25));
		idtxt.setBounds(760, 21, 168, 27);
		panel.add(idtxt);
		
		JLabel lblNewLabel_1_3 = new JLabel("CHANGE PASSWORD");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(594, 112, 429, 43);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UpdatePasswordEmployeeFrame.class.getResource("/e3/Classes/Images/changepass.png")));
		lblNewLabel.setBounds(450, 50, 160, 128);
		contentPane.add(lblNewLabel);
	}
	
	public boolean CheckRec(String D)
	{
		if(D.equals(n))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
