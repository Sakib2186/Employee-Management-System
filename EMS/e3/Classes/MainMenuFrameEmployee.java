package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MainMenuFrameEmployee extends JFrame {

	private JPanel contentPane;
	private JLabel idnotetxt;
	static MainMenuFrameEmployee frame = new MainMenuFrameEmployee();

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
	public void setIdNotetxt()
	{
		Login i = new Login();
		idnotetxt.setText(i.getIdnote());
	}
	public MainMenuFrameEmployee() {
		setResizable(false);
		setTitle("EMS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuFrame.class.getResource("/e3/Classes/Images/icons8-employee-64.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1276, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/HOME2.png")));
		lblNewLabel_4.setBounds(535, 40, 64, 128);
		contentPane.add(lblNewLabel_4);
		
		contentPane.setLayout(null);
		JLabel lblNewLabel_3_1 = new JLabel("HOME");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(609, 92, 122, 52);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainMenuFrameEmployee.class.getResource("/e3/Classes/Images/file.png")));
		lblNewLabel.setBounds(235, 285, 122, 128);
		contentPane.add(lblNewLabel);
		
		JButton viewinfobtn = new JButton("VIEW INFORMATION");
		viewinfobtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee a = new Employee();
				a.searchEmployeeForViewEmployeeFrame();
				ViewInformationEmployeeFrame.frame.setVisible(true);
				ViewInformationEmployeeFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		viewinfobtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		viewinfobtn.setBackground(UIManager.getColor("Button.shadow"));
		viewinfobtn.setBounds(190, 417, 221, 21);
		contentPane.add(viewinfobtn);
		
		JButton editinfobtn = new JButton("EDIT INFORMATION");
		editinfobtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Employee o = new Employee();
				o.displayEmployee();
				EditInformationEmployeeFrame.frame.setVisible(true);
				EditInformationEmployeeFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		editinfobtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		editinfobtn.setBackground(UIManager.getColor("Button.shadow"));
		editinfobtn.setBounds(497, 417, 221, 21);
		contentPane.add(editinfobtn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainMenuFrameEmployee.class.getResource("/e3/Classes/Images/edit.png")));
		lblNewLabel_1.setBounds(561, 285, 128, 128);
		contentPane.add(lblNewLabel_1);
		
		JButton btnUpdatePassword = new JButton("UPDATE PASSWORD");
		btnUpdatePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UpdatePasswordEmployeeFrame.frame.setVisible(true);
				UpdatePasswordEmployeeFrame.RecApt();
				UpdatePasswordEmployeeFrame.frame.setLocationRelativeTo(null);
				UpdatePasswordEmployeeFrame.frame.setID();
				frame.setVisible(false);
				
				
			}
		});
		btnUpdatePassword.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnUpdatePassword.setBackground(UIManager.getColor("Button.shadow"));
		btnUpdatePassword.setBounds(804, 417, 221, 21);
		contentPane.add(btnUpdatePassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(MainMenuFrameEmployee.class.getResource("/e3/Classes/Images/password.png")));
		lblNewLabel_1_1.setBounds(852, 285, 134, 128);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginFrame.frame.setVisible(true);
				LoginFrame.frame.setLocationRelativeTo(null);
				MainMenuFrameEmployee.frame.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnLogout.setBackground(UIManager.getColor("Button.shadow"));
		btnLogout.setBounds(1128, 630, 111, 21);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(MainMenuFrameEmployee.class.getResource("/e3/Classes/Images/logout.png")));
		lblNewLabel_1_2.setBounds(1147, 556, 86, 70);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ID:");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_3_1_1.setBounds(997, 92, 55, 52);
		contentPane.add(lblNewLabel_3_1_1);
		
		idnotetxt = new JLabel("");
		idnotetxt.setHorizontalAlignment(SwingConstants.RIGHT);
		idnotetxt.setForeground(Color.WHITE);
		idnotetxt.setFont(new Font("Arial Black", Font.BOLD, 30));
		idnotetxt.setBounds(997, 92, 246, 52);
		contentPane.add(idnotetxt);
	}
}
