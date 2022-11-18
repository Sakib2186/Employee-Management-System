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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class AddAdminFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField idtxt;
	private JPasswordField passtxt;
	private JPasswordField passconfirmtxt;
	private String Fname,Lname,Id,pass,passconfirm;
	public static AddAdminFrame frame = new AddAdminFrame();
	public void setVariable()
	{
		Fname=null;
		Lname=null;
		Id=null;
		pass=null;
		passconfirm=null;
	}
	public void setEmpty()
	{
		fnametxt.setText("");
		lnametxt.setText("");
		idtxt.setText("");
		passtxt.setText("");
		passconfirmtxt.setText("");
		
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
	public AddAdminFrame() {
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
		
		JLabel addadminpicturelabel = new JLabel("");
		addadminpicturelabel.setIcon(new ImageIcon(AddAdminFrame.class.getResource("/e3/Classes/Images/admin.png")));
		addadminpicturelabel.setBounds(450, 50, 160, 128);
		contentPane.add(addadminpicturelabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(68, 240, 1116, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel fnamelabel = new JLabel("FIRST NAME:");
		fnamelabel.setBounds(32, 50, 176, 27);
		fnamelabel.setForeground(SystemColor.controlShadow);
		fnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel.add(fnamelabel);
		
		fnametxt = new JTextField();
		fnametxt.setToolTipText("FIRST NAME");
		fnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Fname = fnametxt.getText();
			}
		});
		fnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnametxt.setColumns(10);
		fnametxt.setBounds(32, 88, 273, 27);
		panel.add(fnametxt);
		
		JLabel lnamelabel = new JLabel("LAST NAME:");
		lnamelabel.setForeground(SystemColor.controlShadow);
		lnamelabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lnamelabel.setBounds(388, 50, 176, 27);
		panel.add(lnamelabel);
		
		lnametxt = new JTextField();
		lnametxt.setToolTipText("LAST NAME");
		lnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Lname = lnametxt.getText();
			}
		});
		lnametxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnametxt.setColumns(10);
		lnametxt.setBounds(388, 88, 273, 27);
		panel.add(lnametxt);
		
		JLabel idlabel = new JLabel("ID:");
		idlabel.setForeground(SystemColor.controlShadow);
		idlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		idlabel.setBounds(32, 151, 33, 27);
		panel.add(idlabel);
		
		idtxt = new JTextField();
		idtxt.setToolTipText("ID");
		idtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Id = idtxt.getText();
			}
		});
		idtxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		idtxt.setColumns(10);
		idtxt.setBounds(32, 187, 273, 27);
		panel.add(idtxt);
		
		JLabel passwordlabel = new JLabel("PASSWORD:");
		passwordlabel.setForeground(SystemColor.controlShadow);
		passwordlabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		passwordlabel.setBounds(32, 242, 176, 27);
		panel.add(passwordlabel);
		
		passtxt = new JPasswordField();
		passtxt.setToolTipText("PASSWORD");
		passtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				pass = String.valueOf(passtxt.getPassword());
			}
		});
		passtxt.setBounds(32, 280, 273, 27);
		panel.add(passtxt);
		
		JLabel confirmpasslabel = new JLabel("CONFIRM PASSWORD:");
		confirmpasslabel.setForeground(SystemColor.controlShadow);
		confirmpasslabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		confirmpasslabel.setBounds(388, 242, 273, 27);
		panel.add(confirmpasslabel);
		
		passconfirmtxt = new JPasswordField();
		passconfirmtxt.setToolTipText("CONFIRM PASSWORD");
		passconfirmtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				passconfirm = String.valueOf(passconfirmtxt.getPassword());
			}
		});
		passconfirmtxt.setBounds(388, 280, 273, 27);
		panel.add(passconfirmtxt);
		
		JButton Addbtn = new JButton("ADD");
		Addbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Fname==null || Lname==null || Id==null || pass==null ||
						passconfirm==null )
				{
					JOptionPane.showMessageDialog(null, "Please enter all fields");
				}
				else
				{
					int k=JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
					if(k==JOptionPane.YES_OPTION)
					{
						if(Id.length()==8)
						{
							if(pass.equals(passconfirm))
							{
								Admin a = new Admin(Fname,Lname,Id,pass);
								a.addAdmin();
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Password does not match");
								passtxt.setText("");
								passconfirmtxt.setText("");
								pass=null;
								passconfirm=null;
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "ID must be contain 8 digits");
							idtxt.setText("");
						}
					}
					if(k==JOptionPane.NO_OPTION)
					{
						
					}
				}
				
				
			}
		});
		Addbtn.setForeground(Color.BLACK);
		Addbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		Addbtn.setBackground(UIManager.getColor("Button.shadow"));
		Addbtn.setBounds(760, 192, 103, 26);
		panel.add(Addbtn);
		
		JButton clearbtn = new JButton("CLEAR");
		clearbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fnametxt.setText("");
				lnametxt.setText("");
				idtxt.setText("");
				passtxt.setText("");
				passconfirmtxt.setText("");
				frame.setVariable();
			}
		});
		clearbtn.setForeground(Color.BLACK);
		clearbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
		clearbtn.setBackground(UIManager.getColor("Button.shadow"));
		clearbtn.setBounds(873, 192, 103, 26);
		panel.add(clearbtn);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fnametxt.setText("");
				lnametxt.setText("");
				idtxt.setText("");
				passtxt.setText("");
				frame.setVariable();
				passconfirmtxt.setText("");
				MainMenuFrame.frame.setVisible(true);
				MainMenuFrame.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
				
				
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnBack.setBackground(UIManager.getColor("Button.shadow"));
		btnBack.setBounds(986, 192, 103, 26);
		panel.add(btnBack);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(22, 36, 686, 328);
		panel.add(panel_1);
		
		JLabel hedinglabel = new JLabel("ADD ADMIN");
		hedinglabel.setForeground(Color.WHITE);
		hedinglabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		hedinglabel.setBounds(594, 112, 375, 43);
		contentPane.add(hedinglabel);
	}
}
