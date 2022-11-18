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
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class DeleteAdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idtxt;
	public static DeleteAdminFrame frame = new DeleteAdminFrame();
	private JLabel fnametxt;
	private JLabel lnametxt;
	private String id;
	public void setVariable()
	{
		id=null;
	}
	public void setEmptyId()
	{
		idtxt.setText("");
		id=null;
	}
	public void setEmptyAll()
	{
		
		idtxt.setText("");
		fnametxt.setText("");
		lnametxt.setText("");
		id=null;
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

	public void setfname(String n)
	{
		fnametxt.setText(n);
	}
	public void setlname(String n)
	{
		lnametxt.setText(n);
	}
	public DeleteAdminFrame() {
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
		
		JLabel headerpicturelabel = new JLabel("");
		headerpicturelabel.setIcon(new ImageIcon(DeleteAdminFrame.class.getResource("/e3/Classes/Images/delete-user.png")));
		headerpicturelabel.setBounds(450, 50, 160, 128);
		contentPane.add(headerpicturelabel);
		
		JLabel headerlabel = new JLabel("DELETE ADMIN");
		headerlabel.setForeground(Color.WHITE);
		headerlabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		headerlabel.setBounds(594, 112, 375, 43);
		contentPane.add(headerlabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(73, 240, 1111, 395);
		contentPane.add(panel);
		
		JLabel idlabel = new JLabel("ID:");
		idlabel.setToolTipText("");
		idlabel.setForeground(SystemColor.controlShadow);
		idlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		idlabel.setBounds(32, 178, 33, 27);
		panel.add(idlabel);
		
		idtxt = new JTextField();
		idtxt.setToolTipText("ID");
		idtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				id = idtxt.getText();
				
			}
		});
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		idtxt.setColumns(10);
		idtxt.setBounds(65, 178, 273, 27);
		panel.add(idtxt);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idtxt.setText("");
				fnametxt.setText("");
				lnametxt.setText("");
				frame.setVariable();
			}
		});
		clearbtn.setForeground(Color.BLACK);
		clearbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		clearbtn.setBackground(UIManager.getColor("Button.shadow"));
		clearbtn.setBounds(233, 216, 103, 26);
		panel.add(clearbtn);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("INFORMATION");
		lblNewLabel_1_3_1.setForeground(SystemColor.controlShadow);
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_3_1.setBounds(638, 11, 375, 43);
		panel.add(lblNewLabel_1_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(467, 56, 550, 311);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel fnamelabel = new JLabel("FIRST NAME:");
		fnamelabel.setForeground(SystemColor.controlShadow);
		fnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		fnamelabel.setBounds(53, 123, 176, 27);
		panel_1.add(fnamelabel);
		
		JLabel lnamelabel = new JLabel("LAST NAME:");
		lnamelabel.setForeground(SystemColor.controlShadow);
		lnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lnamelabel.setBounds(305, 123, 176, 27);
		panel_1.add(lnamelabel);
		
		JButton deletebtn = new JButton("DELETE");
		deletebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Admin a = new Admin();
				if(id==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter ID field");
				}
				else
				{
					if(id.length()==8)
					{
						int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
						if(k==JOptionPane.YES_OPTION)
						{
							a.deleteAdmin(id);
						}
						if(k==JOptionPane.NO_OPTION)
						{
							
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "ID must be 8 digits");
						idtxt.setText("");
						id=null;
					}
					
				}
				
			}
		});
		deletebtn.setForeground(Color.BLACK);
		deletebtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		deletebtn.setBackground(UIManager.getColor("Button.shadow"));
		deletebtn.setBounds(223, 223, 103, 26);
		panel_1.add(deletebtn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(53, 161, 176, 27);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		fnametxt = new JLabel("");
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setBounds(0, 0, 176, 27);
		panel_2.add(fnametxt);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(305, 161, 176, 27);
		panel_1.add(panel_2_1);
		
		lnametxt = new JLabel("");
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.setBounds(0, 0, 176, 27);
		panel_2_1.add(lnametxt);
		
		JButton searchbtn = new JButton("SEARCH");
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter ID field");
				}
				else
				{
					if(id.length()==8)
					{
						Admin a = new Admin();
						a.searchAdmin(id);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "ID must be 8 digits");
						idtxt.setText("");
						id=null;
					}
				}
				
			}
		});
		searchbtn.setForeground(Color.BLACK);
		searchbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		searchbtn.setBackground(UIManager.getColor("Button.shadow"));
		searchbtn.setBounds(348, 178, 103, 26);
		panel.add(searchbtn);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fnametxt.setText("");
				lnametxt.setText("");
				idtxt.setText("");
				frame.setVariable();
				frame.setVisible(false);
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
			}
		});
		backbtn.setForeground(Color.BLACK);
		backbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setBounds(120, 216, 103, 26);
		panel.add(backbtn);
	}
}
