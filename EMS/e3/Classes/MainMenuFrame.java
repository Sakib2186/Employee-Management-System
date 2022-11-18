package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class MainMenuFrame extends JFrame {
	private JLabel idnotetxt;
	private JPanel contentPane;
	public static MainMenuFrame frame = new MainMenuFrame();
	private File fileobj = new File("EMS/e3/Datas/EmployeeInfo.txt");

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

	public MainMenuFrame() {
		setResizable(false);
		setTitle("EMS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuFrame.class.getResource("/e3/Classes/Images/icons8-employee-64.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1276, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/businessman.png")));
		lblNewLabel.setBounds(68, 254, 126, 130);
		contentPane.add(lblNewLabel);
		
		JButton btnAddadmin = new JButton("ADD ADMIN");
		btnAddadmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddAdminFrame.frame.setVisible(true);
				MainMenuFrame.frame.setVisible(false);
				AddAdminFrame.frame.setLocationRelativeTo(null);
			}
		});
		btnAddadmin.setBackground(UIManager.getColor("Button.shadow"));
		btnAddadmin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnAddadmin.setBounds(68, 395, 137, 21);
		contentPane.add(btnAddadmin);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginFrame.frame.setVisible(true);
				LoginFrame.frame.setLocationRelativeTo(null);
				MainMenuFrame.frame.setVisible(false);
				
			}
		});
		
		btnLogout.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnLogout.setBackground(UIManager.getColor("Button.shadow"));
		btnLogout.setBounds(1128, 630, 111, 21);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/logout.png")));
		lblNewLabel_1.setBounds(1147, 556, 86, 70);
		contentPane.add(lblNewLabel_1);
		
		JButton btnUpdateAdmin = new JButton("UPDATE PASSWORD");
		btnUpdateAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UpdatePassword.frame.setID();
				UpdatePassword.frame.setVisible(true);
				UpdatePassword.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnUpdateAdmin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnUpdateAdmin.setBackground(UIManager.getColor("Button.shadow"));
		btnUpdateAdmin.setBounds(270, 395, 192, 21);
		contentPane.add(btnUpdateAdmin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/password.png")));
		lblNewLabel_2.setBounds(300, 254, 151, 138);
		contentPane.add(lblNewLabel_2);
		
		JButton btnDeleteAdmin = new JButton("DELETE ADMIN");
		btnDeleteAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteAdminFrame.frame.setVisible(true);
				DeleteAdminFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnDeleteAdmin.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnDeleteAdmin.setBackground(UIManager.getColor("Button.shadow"));
		btnDeleteAdmin.setBounds(527, 395, 151, 21);
		contentPane.add(btnDeleteAdmin);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/user.png")));
		lblNewLabel_3.setBounds(543, 262, 126, 130);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/HOME2.png")));
		lblNewLabel_4.setBounds(535, 40, 64, 128);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("HOME");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(609, 92, 122, 52);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnaddEmployee = new JButton("ADD EMPLOYEE");
		btnaddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				AddEmployeeFrame.frame.setVisible(true);
				AddEmployeeFrame.frame.setLocationRelativeTo(null);
			}
		});
		btnaddEmployee.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnaddEmployee.setBackground(UIManager.getColor("Button.shadow"));
		btnaddEmployee.setBounds(743, 395, 151, 21);
		contentPane.add(btnaddEmployee);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/united.png")));
		lblNewLabel_3_2.setBounds(754, 254, 126, 130);
		contentPane.add(lblNewLabel_3_2);
		
		JButton btnViewEmployee = new JButton("SEARCH EMPLOYEE");
		btnViewEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchEmployeeFrame.frame.setVisible(true);
				SearchEmployeeFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnViewEmployee.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnViewEmployee.setBackground(UIManager.getColor("Button.shadow"));
		btnViewEmployee.setBounds(959, 395, 186, 21);
		contentPane.add(btnViewEmployee);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/search.png")));
		lblNewLabel_3_2_1.setBounds(997, 254, 126, 130);
		contentPane.add(lblNewLabel_3_2_1);
		
		JButton btnDeleteEmployee = new JButton("DELETE EMPLOYEE");
		btnDeleteEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteEmployeeFrame.frame.setVisible(true);
				DeleteEmployeeFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnDeleteEmployee.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnDeleteEmployee.setBackground(UIManager.getColor("Button.shadow"));
		btnDeleteEmployee.setBounds(415, 605, 172, 21);
		contentPane.add(btnDeleteEmployee);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/unfollow.png")));
		lblNewLabel_3_3.setBounds(438, 464, 126, 130);
		contentPane.add(lblNewLabel_3_3);
		
		JButton btnEmployee = new JButton("VIEW ALL EMPLOYEE");
		btnEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable table = ViewAllEmployeeFrame.frame.gettable();
				try {
					BufferedReader br = new BufferedReader(new FileReader(fileobj));
					String[] columnNames = {"First Name","Last Name","ID","Gender",
							"Date of Birth","Phone Number","Department","Address"};
					DefaultTableModel model  =  (DefaultTableModel)table.getModel();
					model.setRowCount(0);
					model.setColumnIdentifiers(columnNames);
					
					Object[] tablelines = br.lines().toArray();
					for(int i=0;i<tablelines.length;i++)
					{
						String line = tablelines[i].toString();
						String[] datarow = line.split(" ");
						String DateofBirth = datarow[5]+"."+datarow[6]+"."+datarow[7];
						String[] datarow2 = {datarow[0],datarow[1],datarow[2],datarow[4],
								DateofBirth,datarow[8],datarow[9],datarow[10]};
						model.addRow(datarow2);
						
						
						
					}
					
				} catch (FileNotFoundException e2) {
					
					e2.printStackTrace();
				}
				ViewAllEmployeeFrame.frame.setVisible(true);
				ViewAllEmployeeFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnEmployee.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnEmployee.setBackground(UIManager.getColor("Button.shadow"));
		btnEmployee.setBounds(633, 605, 192, 21);
		contentPane.add(btnEmployee);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/e3/Classes/Images/qualitative-research.png")));
		lblNewLabel_3_3_1.setBounds(653, 464, 137, 130);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ID:");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_3_1_1.setBounds(997, 92, 55, 52);
		contentPane.add(lblNewLabel_3_1_1);
		
	    idnotetxt = new JLabel("");
		idnotetxt.setForeground(Color.WHITE);
		idnotetxt.setFont(new Font("Arial Black", Font.BOLD, 30));
		idnotetxt.setHorizontalAlignment(SwingConstants.RIGHT);
		idnotetxt.setBounds(997, 92, 246, 52);
		contentPane.add(idnotetxt);

	}
}

