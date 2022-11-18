package e3.Classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class ViewAllEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	static ViewAllEmployeeFrame frame = new ViewAllEmployeeFrame();
	
	/**
	 * Launch the application.
	 */
	public JTable gettable()
	{
		return table;
	}
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
	public ViewAllEmployeeFrame() {
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
		panel.setBounds(70, 219, 1116, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setFont(new Font("Segoe UI", Font.BOLD, 15));
		scrollPane.setBackground(SystemColor.menu);
		scrollPane.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setBounds(10, 48, 1096, 356);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		JButton backbtn = new JButton("BACK");
		backbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(1003, 11, 103, 26);
		panel.add(backbtn);
		
		JLabel lblNewLabel_1_3 = new JLabel("ALL EMPLOYEES");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(594, 112, 375, 43);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ViewAllEmployeeFrame.class.getResource("/e3/Classes/Images/select-all.png")));
		lblNewLabel.setBounds(450, 50, 160, 128);
		contentPane.add(lblNewLabel);
	}
}
