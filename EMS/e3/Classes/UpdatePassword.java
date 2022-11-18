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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class UpdatePassword extends JFrame {
	
	
	
	public static UpdatePassword frame = new UpdatePassword();
	private JPanel contentPane;
	private JPasswordField passwordtxt;
	private JPasswordField confirmpasstxt;
	private JPasswordField oldpasstxt;
	private String oldpass,pass,conpass;
	private JLabel idtxt;
	public Admin o;
	Login i = new Login();
	public void setVariable()
	{
		oldpass=pass=conpass=null;
	}
	public void setID()
	{
		idtxt.setText(i.getIdnote());
	}
	public void setEmpty()
	{
		passwordtxt.setText("");
		confirmpasstxt.setText("");
		oldpasstxt.setText("");
	}
	public void setoldpass()
	{
		oldpasstxt.setText("");
		oldpass=null;
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
	public UpdatePassword() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UpdatePassword.class.getResource("/e3/Classes/Images/refresh.png")));
		lblNewLabel.setBounds(444, 48, 199, 128);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UPDATE PASSWORD");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(585, 88, 375, 43);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(68, 241, 1116, 395);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID:");
		lblNewLabel_1_2.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(789, 21, 34, 27);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_2_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(32, 178, 176, 27);
		panel.add(lblNewLabel_1_2_1);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setToolTipText("PASSWORD");
		passwordtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pass =String.valueOf(passwordtxt.getPassword());
			}
		});
		passwordtxt.setBounds(32, 225, 273, 27);
		panel.add(passwordtxt);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("CONFIRM PASSWORD:");
		lblNewLabel_1_2_1_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(348, 178, 273, 27);
		panel.add(lblNewLabel_1_2_1_1);
		
		confirmpasstxt = new JPasswordField();
		confirmpasstxt.setToolTipText("CONFIRMPASSWORD");
		confirmpasstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				conpass = String.valueOf(confirmpasstxt.getPassword());
			}
		});
		confirmpasstxt.setBounds(348, 225, 273, 27);
		panel.add(confirmpasstxt);
		
		JButton updatebtn = new JButton("UPDATE");
		updatebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				o = new Admin();
				if(oldpass==null || pass==null || conpass==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter all fields");
				}
				else
				{
					int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(k==JOptionPane.YES_OPTION)
					{
							if(pass.equals(conpass))
							{
								o.updatePassword(pass, oldpass);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Password doesn't match");
								confirmpasstxt.setText("");
								passwordtxt.setText("");
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
		updatebtn.setBounds(720, 185, 103, 26);
		panel.add(updatebtn);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordtxt.setText("");
				confirmpasstxt.setText("");
				oldpasstxt.setText("");
				idtxt.setText("");
				frame.setVariable();
				
			}
		});
		clearbtn.setForeground(Color.BLACK);
		clearbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		clearbtn.setBackground(UIManager.getColor("Button.shadow"));
		clearbtn.setBounds(843, 185, 103, 26);
		panel.add(clearbtn);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordtxt.setText("");
				idtxt.setText("");
				confirmpasstxt.setText("");
				oldpasstxt.setText("");
				frame.setVariable();
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(966, 185, 103, 26);
		panel.add(backbtn);
		
		idtxt = new JLabel("");
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 25));
		idtxt.setBounds(833, 21, 273, 27);
		panel.add(idtxt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(20, 57, 660, 286);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		oldpasstxt = new JPasswordField();
		oldpasstxt.setBounds(10, 75, 273, 27);
		panel_1.add(oldpasstxt);
		oldpasstxt.setToolTipText("OLDPASSWORD");
		
		JLabel oldpsw = new JLabel("OLD PASSWORD:");
		oldpsw.setBounds(10, 37, 273, 27);
		panel_1.add(oldpsw);
		oldpsw.setForeground(SystemColor.controlShadow);
		oldpsw.setFont(new Font("Segoe UI", Font.BOLD, 20));
		oldpasstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				oldpass= String.valueOf(oldpasstxt.getPassword());
			}
		});
		
	}
}
