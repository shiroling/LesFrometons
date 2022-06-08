package modèleAnous;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class visu_fromage_detail {

	private JFrame frame;
	private JTextField textField;
	private JList list;
	private Articles ListeFromage;
	private List<Fromage> liste1;
	
	
	
	public static final Color[] COULEURS= {
			 new Color(255,255,255), new Color(204,204,255), new Color(102,102,255),
			 new Color(102,0,255), new Color(102,0,204), new Color(255,204,255),
			 new Color(255,102,255), new Color(204,0,204), new Color(153,0,153),
			 new Color(255,204,204), new Color(255,51,51), new Color(204,0,51),new Color(153,0,0),
			 new Color(255,255,204), new Color(255,255,102), new Color(255,255,0),
			 new Color(153,153,0), new Color(204,255,204), new Color(51,255,51),
			 new Color(0,204,51), new Color(0,102,0), new Color(204,204,204),
			 new Color(153,153,153), new Color(102,102,102),new Color(51,51,51),
			 new Color(255,204,102), new Color(255,204,102), new Color(255,153,0),
			 new Color(153,102,0), new Color(204,255,255),new Color(102,204,255),
			 new Color(0,102,255), new Color(0,0,204), new Color(0,0,0),
			 new Color(51,255,255), new Color(0,204,204), new Color(0,153,153)
	};
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					visu_fromage_detail window = new visu_fromage_detail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public visu_fromage_detail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ListeFromage = GenerationFromages.générationBaseFromages();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_2, BorderLayout.NORTH);
		
		JButton btnVache = new JButton("");
		btnVache.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list = new JList(ListeFromage.getListeFromagesVache().toArray());
				list.updateUI();
			}
		});
		btnVache.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Bureau\\kisspng-the-laughing-cow-cattle-cheese-spread-babybel-5c02451b636533.4020705315436526354071 (1) (1) (1).png"));
		
		JButton btnBrebis = new JButton("");
		btnBrebis.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Bureau\\brebis-merinos.jpg"));
		
		JButton btnChevre = new JButton("");
		btnChevre.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Bureau\\vecteezy_goat-cartoon-animal-character_ (1).jpg"));
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton btn_all = new JButton("*");
		btn_all.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				list = new JList(ListeFromage.getListeFromages().toArray());
				list.updateUI();
			}
		});
		panel_2.add(btn_all);
		btn_all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_all.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(btnVache);
		panel_2.add(btnBrebis);
		panel_2.add(btnChevre);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7, BorderLayout.EAST);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Ajouter au Panier");
		panel_7.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_8.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_8.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6, BorderLayout.EAST);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\natha\\OneDrive\\Bureau\\panier (2).png"));
		panel_6.add(btnNewButton);
		
		JPanel panel_5 = 	new JPanel();
		panel_1.add(panel_5, BorderLayout.CENTER);
	}

}
