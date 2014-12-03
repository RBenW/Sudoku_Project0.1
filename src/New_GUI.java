import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Component;

import javax.swing.border.BevelBorder;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class New_GUI implements ActionListener {
	private String userName = "";
	private JFrame frame;
	private JTextField textUserName;
	private JPanel EnterPanel;
	private JPanel UserPanel;
	private JPanel DifficultyPanel;
	private JPanel EasyPuzzlePanel;
	private JTextField textUser;
	private JTextArea selected2;
	private JTextField noUserText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_GUI window = new New_GUI();
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
	public New_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 529, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		final JPanel EnterPanel = new JPanel();
		EnterPanel.setBackground(new Color(0, 102, 51));
		EnterPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		frame.getContentPane().add(EnterPanel, "name_371237336903701");
		EnterPanel.setLayout(null);
		EnterPanel.setVisible(true);

		final JPanel UserPanel = new JPanel();
		UserPanel.setBackground(new Color(0, 102, 51));
		frame.getContentPane().add(UserPanel, "name_371239693946302");
		UserPanel.setLayout(null);
		UserPanel.setVisible(false);

		final JPanel DifficultyPanel = new JPanel();
		DifficultyPanel.setBackground(new Color(0, 102, 51));
		frame.getContentPane().add(DifficultyPanel, "name_371241815534654");
		DifficultyPanel.setLayout(null);
		DifficultyPanel.setVisible(false);

		final JPanel GamePanel = new JPanel();
		GamePanel.setBackground(new Color(0, 102, 51));
		frame.getContentPane().add(GamePanel, "name_371246022116004");
		GamePanel.setLayout(null);

		JButton GameBackbutton = new JButton("<-Back");
		GameBackbutton.setBackground(new Color(51, 102, 51));
		GameBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DifficultyPanel.setVisible(true);
				GamePanel.setVisible(false);
			}
		});
		GameBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null));
		GameBackbutton.setBounds(0, 0, 89, 23);
		GamePanel.add(GameBackbutton);

		JLabel label_4 = new JLabel("SUDOKU");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.ORANGE);
		label_4.setFont(new Font("Yu Mincho", Font.ITALIC, 54));
		label_4.setBounds(88, 11, 328, 47);
		GamePanel.add(label_4);

		JPanel PuzzlePanel = new JPanel();
		PuzzlePanel.setBorder(new LineBorder(new Color(255, 200, 0), 2));
		PuzzlePanel.setBounds(66, 55, 375, 375);
		GamePanel.add(PuzzlePanel);
		PuzzlePanel.setLayout(new GridLayout(9, 9, 0, 0));

		final JTextArea Cell_1_1 = new JTextArea();
		final JTextArea Cell_1_2 = new JTextArea();
		final JTextArea Cell_1_3 = new JTextArea();
		final JTextArea Cell_1_4 = new JTextArea();
		final JTextArea Cell_1_5 = new JTextArea();
		final JTextArea Cell_1_6 = new JTextArea();
		final JTextArea Cell_1_7 = new JTextArea();
		final JTextArea Cell_1_8 = new JTextArea();
		final JTextArea Cell_1_9 = new JTextArea();

		final JTextArea Cell_2_1 = new JTextArea();
		final JTextArea Cell_2_2 = new JTextArea();
		final JTextArea Cell_2_3 = new JTextArea();
		final JTextArea Cell_2_4 = new JTextArea();
		final JTextArea Cell_2_5 = new JTextArea();
		final JTextArea Cell_2_6 = new JTextArea();
		final JTextArea Cell_2_7 = new JTextArea();
		final JTextArea Cell_2_8 = new JTextArea();
		final JTextArea Cell_2_9 = new JTextArea();

		final JTextArea Cell_3_1 = new JTextArea();
		final JTextArea Cell_3_2 = new JTextArea();
		final JTextArea Cell_3_3 = new JTextArea();
		final JTextArea Cell_3_4 = new JTextArea();
		final JTextArea Cell_3_5 = new JTextArea();
		final JTextArea Cell_3_6 = new JTextArea();
		final JTextArea Cell_3_7 = new JTextArea();
		final JTextArea Cell_3_8 = new JTextArea();
		final JTextArea Cell_3_9 = new JTextArea();

		final JTextArea Cell_4_1 = new JTextArea();
		final JTextArea Cell_4_2 = new JTextArea();
		final JTextArea Cell_4_3 = new JTextArea();
		final JTextArea Cell_4_4 = new JTextArea();
		final JTextArea Cell_4_5 = new JTextArea();
		final JTextArea Cell_4_6 = new JTextArea();
		final JTextArea Cell_4_7 = new JTextArea();
		final JTextArea Cell_4_8 = new JTextArea();
		final JTextArea Cell_4_9 = new JTextArea();

		final JTextArea Cell_5_1 = new JTextArea();
		final JTextArea Cell_5_2 = new JTextArea();
		final JTextArea Cell_5_3 = new JTextArea();
		final JTextArea Cell_5_4 = new JTextArea();
		final JTextArea Cell_5_5 = new JTextArea();
		final JTextArea Cell_5_6 = new JTextArea();
		final JTextArea Cell_5_7 = new JTextArea();
		final JTextArea Cell_5_8 = new JTextArea();
		final JTextArea Cell_5_9 = new JTextArea();

		final JTextArea Cell_6_1 = new JTextArea();
		final JTextArea Cell_6_2 = new JTextArea();
		final JTextArea Cell_6_3 = new JTextArea();
		final JTextArea Cell_6_4 = new JTextArea();
		final JTextArea Cell_6_5 = new JTextArea();
		final JTextArea Cell_6_6 = new JTextArea();
		final JTextArea Cell_6_7 = new JTextArea();
		final JTextArea Cell_6_8 = new JTextArea();
		final JTextArea Cell_6_9 = new JTextArea();

		final JTextArea Cell_7_1 = new JTextArea();
		final JTextArea Cell_7_2 = new JTextArea();
		final JTextArea Cell_7_3 = new JTextArea();
		final JTextArea Cell_7_4 = new JTextArea();
		final JTextArea Cell_7_5 = new JTextArea();
		final JTextArea Cell_7_6 = new JTextArea();
		final JTextArea Cell_7_7 = new JTextArea();
		final JTextArea Cell_7_8 = new JTextArea();
		final JTextArea Cell_7_9 = new JTextArea();

		final JTextArea Cell_8_1 = new JTextArea();
		final JTextArea Cell_8_2 = new JTextArea();
		final JTextArea Cell_8_3 = new JTextArea();
		final JTextArea Cell_8_4 = new JTextArea();
		final JTextArea Cell_8_5 = new JTextArea();
		final JTextArea Cell_8_6 = new JTextArea();
		final JTextArea Cell_8_7 = new JTextArea();
		final JTextArea Cell_8_8 = new JTextArea();
		final JTextArea Cell_8_9 = new JTextArea();

		final JTextArea Cell_9_1 = new JTextArea();
		final JTextArea Cell_9_2 = new JTextArea();
		final JTextArea Cell_9_3 = new JTextArea();
		final JTextArea Cell_9_4 = new JTextArea();
		final JTextArea Cell_9_5 = new JTextArea();
		final JTextArea Cell_9_6 = new JTextArea();
		final JTextArea Cell_9_7 = new JTextArea();
		final JTextArea Cell_9_8 = new JTextArea();
		final JTextArea Cell_9_9 = new JTextArea();

		Cell_1_1.setLineWrap(true);
		Cell_1_1.setEditable(false);
		Cell_1_1.setBackground(Color.WHITE);
		Cell_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_1.isEnabled()){
				Cell_1_1.setBackground(new Color(255,255,255));
				selected2 = Cell_1_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_1.isEnabled()){
				Cell_1_1.setBackground(Color.CYAN);
				selected2 = Cell_1_1;
				}
			}
		});
		
		Cell_1_2.setLineWrap(true);
		Cell_1_2.setEditable(false);
		Cell_1_2.setBackground(Color.WHITE);
		Cell_1_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_2.isEnabled()){
				Cell_1_2.setBackground(new Color(255,255,255));
				selected2 = Cell_1_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_2.isEnabled()){
				Cell_1_2.setBackground(Color.CYAN);
				selected2 = Cell_1_2;
				}
			}
		});
		
		Cell_1_3.setLineWrap(true);
		Cell_1_3.setEditable(false);
		Cell_1_3.setBackground(Color.WHITE);
		Cell_1_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_3.isEnabled()){
				Cell_1_3.setBackground(new Color(255,255,255));
				selected2 = Cell_1_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_3.isEnabled()){
				Cell_1_3.setBackground(Color.CYAN);
				selected2 = Cell_1_3;
				}
			}
		});
		
		Cell_1_4.setLineWrap(true);
		Cell_1_4.setEditable(false);
		Cell_1_4.setBackground(Color.WHITE);
		Cell_1_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_4.isEnabled()){
				Cell_1_4.setBackground(new Color(255,255,255));
				selected2 = Cell_1_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_4.isEnabled()){
				Cell_1_4.setBackground(Color.CYAN);
				selected2 = Cell_1_4;
				}
			}
		});
		
		Cell_1_5.setLineWrap(true);
		Cell_1_5.setEditable(false);
		Cell_1_5.setBackground(Color.WHITE);
		Cell_1_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_5.isEnabled()){
				Cell_1_5.setBackground(new Color(255,255,255));
				selected2 = Cell_1_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_5.isEnabled()){
				Cell_1_5.setBackground(Color.CYAN);
				selected2 = Cell_1_5;
				}
			}
		});
		
		Cell_1_6.setLineWrap(true);
		Cell_1_6.setEditable(false);
		Cell_1_6.setBackground(Color.WHITE);
		Cell_1_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_6.isEnabled()){
				Cell_1_6.setBackground(new Color(255,255,255));
				selected2 = Cell_1_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_6.isEnabled()){
				Cell_1_6.setBackground(Color.CYAN);
				selected2 = Cell_1_6;
				}
			}
		});
		
		Cell_1_7.setLineWrap(true);
		Cell_1_7.setEditable(false);
		Cell_1_7.setBackground(Color.WHITE);
		Cell_1_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_7.isEnabled()){
				Cell_1_7.setBackground(new Color(255,255,255));
				selected2 = Cell_1_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_7.isEnabled()){
				Cell_1_7.setBackground(Color.CYAN);
				selected2 = Cell_1_7;
				}
			}
		});
		
		Cell_1_8.setLineWrap(true);
		Cell_1_8.setEditable(false);
		Cell_1_8.setBackground(Color.WHITE);
		Cell_1_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_8.isEnabled()){
				Cell_1_8.setBackground(new Color(255,255,255));
				selected2 = Cell_1_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_8.isEnabled()){
				Cell_1_8.setBackground(Color.CYAN);
				selected2 = Cell_1_8;
				}
			}
		});

		Cell_1_9.setLineWrap(true);
		Cell_1_9.setEditable(false);
		Cell_1_9.setBackground(Color.WHITE);
		Cell_1_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_1_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_1_9.isEnabled()){
				Cell_1_9.setBackground(new Color(255,255,255));
				selected2 = Cell_1_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_1_9.isEnabled()){
				Cell_1_9.setBackground(Color.CYAN);
				selected2 = Cell_1_9;
				}
			}
		});
		
		Cell_2_1.setLineWrap(true);
		Cell_2_1.setEditable(false);
		Cell_2_1.setBackground(Color.WHITE);
		Cell_2_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_1.isEnabled()){
				Cell_2_1.setBackground(new Color(255,255,255));
				selected2 = Cell_2_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_1.isEnabled()){
				Cell_2_1.setBackground(Color.CYAN);
				selected2 = Cell_2_1;
				}
			}
		});
		
		Cell_2_2.setLineWrap(true);
		Cell_2_2.setEditable(false);
		Cell_2_2.setBackground(Color.WHITE);
		Cell_2_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_2.isEnabled()){
				Cell_2_2.setBackground(new Color(255,255,255));
				selected2 = Cell_2_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_2.isEnabled()){
				Cell_2_2.setBackground(Color.CYAN);
				selected2 = Cell_2_2;
				}
			}
		});
		
		Cell_2_3.setLineWrap(true);
		Cell_2_3.setEditable(false);
		Cell_2_3.setBackground(Color.WHITE);
		Cell_2_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_3.isEnabled()){
				Cell_2_3.setBackground(new Color(255,255,255));
				selected2 = Cell_2_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_3.isEnabled()){
				Cell_2_3.setBackground(Color.CYAN);
				selected2 = Cell_2_3;
				}
			}
		});
		
		Cell_2_4.setLineWrap(true);
		Cell_2_4.setEditable(false);
		Cell_2_4.setBackground(Color.WHITE);
		Cell_2_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_4.isEnabled()){
				Cell_2_4.setBackground(new Color(255,255,255));
				selected2 = Cell_2_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_4.isEnabled()){
				Cell_2_4.setBackground(Color.CYAN);
				selected2 = Cell_2_4;
				}
			}
		});
		
		Cell_2_5.setLineWrap(true);
		Cell_2_5.setEditable(false);
		Cell_2_5.setBackground(Color.WHITE);
		Cell_2_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_5.isEnabled()){
				Cell_2_5.setBackground(new Color(255,255,255));
				selected2 = Cell_2_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_5.isEnabled()){
				Cell_2_5.setBackground(Color.CYAN);
				selected2 = Cell_2_5;
				}
			}
		});
		
		Cell_2_6.setLineWrap(true);
		Cell_2_6.setEditable(false);
		Cell_2_6.setBackground(Color.WHITE);
		Cell_2_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_6.isEnabled()){
				Cell_2_6.setBackground(new Color(255,255,255));
				selected2 = Cell_2_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_6.isEnabled()){
				Cell_2_6.setBackground(Color.CYAN);
				selected2 = Cell_2_6;
				}
			}
		});
		
		Cell_2_7.setLineWrap(true);
		Cell_2_7.setEditable(false);
		Cell_2_7.setBackground(Color.WHITE);
		Cell_2_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_7.isEnabled()){
				Cell_2_7.setBackground(new Color(255,255,255));
				selected2 = Cell_2_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_7.isEnabled()){
				Cell_2_7.setBackground(Color.CYAN);
				selected2 = Cell_2_7;
				}
			}
		});
		
		Cell_2_8.setLineWrap(true);
		Cell_2_8.setEditable(false);
		Cell_2_8.setBackground(Color.WHITE);
		Cell_2_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_8.isEnabled()){
				Cell_2_8.setBackground(new Color(255,255,255));
				selected2 = Cell_2_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_8.isEnabled()){
				Cell_2_8.setBackground(Color.CYAN);
				selected2 = Cell_2_8;
				}
			}
		});
		
		Cell_2_9.setLineWrap(true);
		Cell_2_9.setEditable(false);
		Cell_2_9.setBackground(Color.WHITE);
		Cell_2_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_2_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_2_9.isEnabled()){
				Cell_2_9.setBackground(new Color(255,255,255));
				selected2 = Cell_2_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_2_9.isEnabled()){
				Cell_2_9.setBackground(Color.CYAN);
				selected2 = Cell_2_9;
				}
			}
		});
		
		Cell_3_1.setLineWrap(true);
		Cell_3_1.setEditable(false);
		Cell_3_1.setBackground(Color.WHITE);
		Cell_3_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_1.isEnabled()){
				Cell_3_1.setBackground(new Color(255,255,255));
				selected2 = Cell_3_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_1.isEnabled()){
				Cell_3_1.setBackground(Color.CYAN);
				selected2 = Cell_3_1;
				}
			}
		});
		
		Cell_3_2.setLineWrap(true);
		Cell_3_2.setEditable(false);
		Cell_3_2.setBackground(Color.WHITE);
		Cell_3_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_2.isEnabled()){
				Cell_3_2.setBackground(new Color(255,255,255));
				selected2 = Cell_3_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_2.isEnabled()){
				Cell_3_2.setBackground(Color.CYAN);
				selected2 = Cell_3_2;
				}
			}
		});
		
		Cell_3_3.setLineWrap(true);
		Cell_3_3.setEditable(false);
		Cell_3_3.setBackground(Color.WHITE);
		Cell_3_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_3.isEnabled()){
				Cell_3_3.setBackground(new Color(255,255,255));
				selected2 = Cell_3_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_3.isEnabled()){
				Cell_3_3.setBackground(Color.CYAN);
				selected2 = Cell_3_3;
				}
			}
		});
		
		Cell_3_4.setLineWrap(true);
		Cell_3_4.setEditable(false);
		Cell_3_4.setBackground(Color.WHITE);
		Cell_3_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_4.isEnabled()){
				Cell_3_4.setBackground(new Color(255,255,255));
				selected2 = Cell_3_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_4.isEnabled()){
				Cell_3_4.setBackground(Color.CYAN);
				selected2 = Cell_3_4;
				}
			}
		});
		
		Cell_3_5.setLineWrap(true);
		Cell_3_5.setEditable(false);
		Cell_3_5.setBackground(Color.WHITE);
		Cell_3_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_5.isEnabled()){
				Cell_3_5.setBackground(new Color(255,255,255));
				selected2 = Cell_3_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_5.isEnabled()){
				Cell_3_5.setBackground(Color.CYAN);
				selected2 = Cell_3_5;
				}
			}
		});
		
		Cell_3_6.setLineWrap(true);
		Cell_3_6.setEditable(false);
		Cell_3_6.setBackground(Color.WHITE);
		Cell_3_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_6.isEnabled()){
				Cell_3_6.setBackground(new Color(255,255,255));
				selected2 = Cell_3_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_6.isEnabled()){
				Cell_3_6.setBackground(Color.CYAN);
				selected2 = Cell_3_6;
				}
			}
		});
		
		Cell_3_7.setLineWrap(true);
		Cell_3_7.setEditable(false);
		Cell_3_7.setBackground(Color.WHITE);
		Cell_3_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_7.isEnabled()){
				Cell_3_7.setBackground(new Color(255,255,255));
				selected2 = Cell_3_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_7.isEnabled()){
				Cell_3_7.setBackground(Color.CYAN);
				selected2 = Cell_3_7;
				}
			}
		});
		
		Cell_3_8.setLineWrap(true);
		Cell_3_8.setEditable(false);
		Cell_3_8.setBackground(Color.WHITE);
		Cell_3_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_8.isEnabled()){
				Cell_3_8.setBackground(new Color(255,255,255));
				selected2 = Cell_3_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_8.isEnabled()){
				Cell_3_8.setBackground(Color.CYAN);
				selected2 = Cell_3_8;
				}
			}
		});
		
		Cell_3_9.setLineWrap(true);
		Cell_3_9.setEditable(false);
		Cell_3_9.setBackground(Color.WHITE);
		Cell_3_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_3_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_3_9.isEnabled()){
				Cell_3_9.setBackground(new Color(255,255,255));
				selected2 = Cell_3_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_3_9.isEnabled()){
				Cell_3_9.setBackground(Color.CYAN);
				selected2 = Cell_3_9;
				}
			}
		});
		
		Cell_4_1.setLineWrap(true);
		Cell_4_1.setEditable(false);
		Cell_4_1.setBackground(Color.WHITE);
		Cell_4_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_1.isEnabled()){
				Cell_4_1.setBackground(new Color(255,255,255));
				selected2 = Cell_4_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_1.isEnabled()){
				Cell_4_1.setBackground(Color.CYAN);
				selected2 = Cell_4_1;
				}
			}
		});
		
		Cell_4_2.setLineWrap(true);
		Cell_4_2.setEditable(false);
		Cell_4_2.setBackground(Color.WHITE);
		Cell_4_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_2.isEnabled()){
				Cell_4_2.setBackground(new Color(255,255,255));
				selected2 = Cell_4_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_2.isEnabled()){
				Cell_4_2.setBackground(Color.CYAN);
				selected2 = Cell_4_2;
				}
			}
		});
		
		Cell_4_3.setLineWrap(true);
		Cell_4_3.setEditable(false);
		Cell_4_3.setBackground(Color.WHITE);
		Cell_4_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_3.isEnabled()){
				Cell_4_3.setBackground(new Color(255,255,255));
				selected2 = Cell_4_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_3.isEnabled()){
				Cell_4_3.setBackground(Color.CYAN);
				selected2 = Cell_4_3;
				}
			}
		});
		
		Cell_4_4.setLineWrap(true);
		Cell_4_4.setEditable(false);
		Cell_4_4.setBackground(Color.WHITE);
		Cell_4_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_4.isEnabled()){
				Cell_4_4.setBackground(new Color(255,255,255));
				selected2 = Cell_4_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_4.isEnabled()){
				Cell_4_4.setBackground(Color.CYAN);
				selected2 = Cell_4_4;
				}
			}
		});
		
		Cell_4_5.setLineWrap(true);
		Cell_4_5.setEditable(false);
		Cell_4_5.setBackground(Color.WHITE);
		Cell_4_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_5.isEnabled()){
				Cell_4_5.setBackground(new Color(255,255,255));
				selected2 = Cell_4_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_5.isEnabled()){
				Cell_4_5.setBackground(Color.CYAN);
				selected2 = Cell_4_5;
				}
			}
		});
		
		Cell_4_6.setLineWrap(true);
		Cell_4_6.setEditable(false);
		Cell_4_6.setBackground(Color.WHITE);
		Cell_4_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_6.isEnabled()){
				Cell_4_6.setBackground(new Color(255,255,255));
				selected2 = Cell_4_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_6.isEnabled()){
				Cell_4_6.setBackground(Color.CYAN);
				selected2 = Cell_4_6;
				}
			}
		});
		
		Cell_4_7.setLineWrap(true);
		Cell_4_7.setEditable(false);
		Cell_4_7.setBackground(Color.WHITE);
		Cell_4_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_7.isEnabled()){
				Cell_4_7.setBackground(new Color(255,255,255));
				selected2 = Cell_4_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_7.isEnabled()){
				Cell_4_7.setBackground(Color.CYAN);
				selected2 = Cell_4_7;
				}
			}
		});
		
		Cell_4_8.setLineWrap(true);
		Cell_4_8.setEditable(false);
		Cell_4_8.setBackground(Color.WHITE);
		Cell_4_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_8.isEnabled()){
				Cell_4_8.setBackground(new Color(255,255,255));
				selected2 = Cell_4_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_8.isEnabled()){
				Cell_4_8.setBackground(Color.CYAN);
				selected2 = Cell_4_8;
				}
			}
		});
		
		Cell_4_9.setLineWrap(true);
		Cell_4_9.setEditable(false);
		Cell_4_9.setBackground(Color.WHITE);
		Cell_4_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_4_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_4_9.isEnabled()){
				Cell_4_9.setBackground(new Color(255,255,255));
				selected2 = Cell_4_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_4_9.isEnabled()){
				Cell_4_9.setBackground(Color.CYAN);
				selected2 = Cell_4_9;
				}
			}
		});
		
		Cell_5_1.setLineWrap(true);
		Cell_5_1.setEditable(false);
		Cell_5_1.setBackground(Color.WHITE);
		Cell_5_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_1.isEnabled()){
				Cell_5_1.setBackground(new Color(255,255,255));
				selected2 = Cell_5_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_1.isEnabled()){
				Cell_5_1.setBackground(Color.CYAN);
				selected2 = Cell_5_1;
				}
			}
		});
		
		Cell_5_2.setLineWrap(true);
		Cell_5_2.setEditable(false);
		Cell_5_2.setBackground(Color.WHITE);
		Cell_5_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_2.isEnabled()){
				Cell_5_2.setBackground(new Color(255,255,255));
				selected2 = Cell_5_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_2.isEnabled()){
				Cell_5_2.setBackground(Color.CYAN);
				selected2 = Cell_5_2;
				}
			}
		});
		
		Cell_5_3.setLineWrap(true);
		Cell_5_3.setEditable(false);
		Cell_5_3.setBackground(Color.WHITE);
		Cell_5_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_3.isEnabled()){
				Cell_5_3.setBackground(new Color(255,255,255));
				selected2 = Cell_5_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_3.isEnabled()){
				Cell_5_3.setBackground(Color.CYAN);
				selected2 = Cell_5_3;
				}
			}
		});
		
		Cell_5_4.setLineWrap(true);
		Cell_5_4.setEditable(false);
		Cell_5_4.setBackground(Color.WHITE);
		Cell_5_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_4.isEnabled()){
				Cell_5_4.setBackground(new Color(255,255,255));
				selected2 = Cell_5_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_4.isEnabled()){
				Cell_5_4.setBackground(Color.CYAN);
				selected2 = Cell_5_4;
				}
			}
		});
		
		Cell_5_5.setLineWrap(true);
		Cell_5_5.setEditable(false);
		Cell_5_5.setBackground(Color.WHITE);
		Cell_5_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_5.isEnabled()){
				Cell_5_5.setBackground(new Color(255,255,255));
				selected2 = Cell_5_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_5.isEnabled()){
				Cell_5_5.setBackground(Color.CYAN);
				selected2 = Cell_5_5;
				}
			}
		});
		
		Cell_5_6.setLineWrap(true);
		Cell_5_6.setEditable(false);
		Cell_5_6.setBackground(Color.WHITE);
		Cell_5_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_6.isEnabled()){
				Cell_5_6.setBackground(new Color(255,255,255));
				selected2 = Cell_5_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_6.isEnabled()){
				Cell_5_6.setBackground(Color.CYAN);
				selected2 = Cell_5_6;
				}
			}
		});
		
		Cell_5_7.setLineWrap(true);
		Cell_5_7.setEditable(false);
		Cell_5_7.setBackground(Color.WHITE);
		Cell_5_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_7.isEnabled()){
				Cell_5_7.setBackground(new Color(255,255,255));
				selected2 = Cell_5_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_7.isEnabled()){
				Cell_5_7.setBackground(Color.CYAN);
				selected2 = Cell_5_7;
				}
			}
		});
		
		Cell_5_8.setLineWrap(true);
		Cell_5_8.setEditable(false);
		Cell_5_8.setBackground(Color.WHITE);
		Cell_5_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_8.isEnabled()){
				Cell_5_8.setBackground(new Color(255,255,255));
				selected2 = Cell_5_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_8.isEnabled()){
				Cell_5_8.setBackground(Color.CYAN);
				selected2 = Cell_5_8;
				}
			}
		});
		
		Cell_5_9.setLineWrap(true);
		Cell_5_9.setEditable(false);
		Cell_5_9.setBackground(Color.WHITE);
		Cell_5_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_5_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_5_9.isEnabled()){
				Cell_5_9.setBackground(new Color(255,255,255));
				selected2 = Cell_5_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_5_9.isEnabled()){
				Cell_5_9.setBackground(Color.CYAN);
				selected2 = Cell_5_9;
				}
			}
		});
		
		Cell_6_1.setLineWrap(true);
		Cell_6_1.setEditable(false);
		Cell_6_1.setBackground(Color.WHITE);
		Cell_6_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_1.isEnabled()){
				Cell_6_1.setBackground(new Color(255,255,255));
				selected2 = Cell_6_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_1.isEnabled()){
				Cell_6_1.setBackground(Color.CYAN);
				selected2 = Cell_6_1;
				}
			}
		});
		
		Cell_6_2.setLineWrap(true);
		Cell_6_2.setEditable(false);
		Cell_6_2.setBackground(Color.WHITE);
		Cell_6_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_2.isEnabled()){
				Cell_6_2.setBackground(new Color(255,255,255));
				selected2 = Cell_6_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_2.isEnabled()){
				Cell_6_2.setBackground(Color.CYAN);
				selected2 = Cell_6_2;
				}
			}
		});
		
		Cell_6_3.setLineWrap(true);
		Cell_6_3.setEditable(false);
		Cell_6_3.setBackground(Color.WHITE);
		Cell_6_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_3.isEnabled()){
				Cell_6_3.setBackground(new Color(255,255,255));
				selected2 = Cell_6_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_3.isEnabled()){
				Cell_6_3.setBackground(Color.CYAN);
				selected2 = Cell_6_3;
				}
			}
		});
		
		Cell_6_4.setLineWrap(true);
		Cell_6_4.setEditable(false);
		Cell_6_4.setBackground(Color.WHITE);
		Cell_6_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_4.isEnabled()){
				Cell_6_4.setBackground(new Color(255,255,255));
				selected2 = Cell_6_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_4.isEnabled()){
				Cell_6_4.setBackground(Color.CYAN);
				selected2 = Cell_6_4;
				}
			}
		});
		
		Cell_6_5.setLineWrap(true);
		Cell_6_5.setEditable(false);
		Cell_6_5.setBackground(Color.WHITE);
		Cell_6_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_5.isEnabled()){
				Cell_6_5.setBackground(new Color(255,255,255));
				selected2 = Cell_6_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_5.isEnabled()){
				Cell_6_5.setBackground(Color.CYAN);
				selected2 = Cell_6_5;
				}
			}
		});
		
		Cell_6_6.setLineWrap(true);
		Cell_6_6.setEditable(false);
		Cell_6_6.setBackground(Color.WHITE);
		Cell_6_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_6.isEnabled()){
				Cell_6_6.setBackground(new Color(255,255,255));
				selected2 = Cell_6_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_6.isEnabled()){
				Cell_6_6.setBackground(Color.CYAN);
				selected2 = Cell_6_6;
				}
			}
		});
		
		Cell_6_7.setLineWrap(true);
		Cell_6_7.setEditable(false);
		Cell_6_7.setBackground(Color.WHITE);
		Cell_6_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_7.isEnabled()){
				Cell_6_7.setBackground(new Color(255,255,255));
				selected2 = Cell_6_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_7.isEnabled()){
				Cell_6_7.setBackground(Color.CYAN);
				selected2 = Cell_6_7;
				}
			}
		});
		
		Cell_6_8.setLineWrap(true);
		Cell_6_8.setEditable(false);
		Cell_6_8.setBackground(Color.WHITE);
		Cell_6_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_8.isEnabled()){
				Cell_6_8.setBackground(new Color(255,255,255));
				selected2 = Cell_6_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_8.isEnabled()){
				Cell_6_8.setBackground(Color.CYAN);
				selected2 = Cell_6_8;
				}
			}
		});
		
		Cell_6_9.setLineWrap(true);
		Cell_6_9.setEditable(false);
		Cell_6_9.setBackground(Color.WHITE);
		Cell_6_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_6_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_6_9.isEnabled()){
				Cell_6_9.setBackground(new Color(255,255,255));
				selected2 = Cell_6_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_6_9.isEnabled()){
				Cell_6_9.setBackground(Color.CYAN);
				selected2 = Cell_6_9;
				}
			}
		});
		
		Cell_7_1.setLineWrap(true);
		Cell_7_1.setEditable(false);
		Cell_7_1.setBackground(Color.WHITE);
		Cell_7_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_1.isEnabled()){
				Cell_7_1.setBackground(new Color(255,255,255));
				selected2 = Cell_7_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_1.isEnabled()){
				Cell_7_1.setBackground(Color.CYAN);
				selected2 = Cell_7_1;
				}
			}
		});
		
		Cell_7_2.setLineWrap(true);
		Cell_7_2.setEditable(false);
		Cell_7_2.setBackground(Color.WHITE);
		Cell_7_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_2.isEnabled()){
				Cell_7_2.setBackground(new Color(255,255,255));
				selected2 = Cell_7_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_2.isEnabled()){
				Cell_7_2.setBackground(Color.CYAN);
				selected2 = Cell_7_2;
				}
			}
		});
		
		Cell_7_3.setLineWrap(true);
		Cell_7_3.setEditable(false);
		Cell_7_3.setBackground(Color.WHITE);
		Cell_7_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_3.isEnabled()){
				Cell_7_3.setBackground(new Color(255,255,255));
				selected2 = Cell_7_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_3.isEnabled()){
				Cell_7_3.setBackground(Color.CYAN);
				selected2 = Cell_7_3;
				}
			}
		});
		
		Cell_7_4.setLineWrap(true);
		Cell_7_4.setEditable(false);
		Cell_7_4.setBackground(Color.WHITE);
		Cell_7_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_4.isEnabled()){
				Cell_7_4.setBackground(new Color(255,255,255));
				selected2 = Cell_7_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_4.isEnabled()){
				Cell_7_4.setBackground(Color.CYAN);
				selected2 = Cell_7_4;
				}
			}
		});
		
		Cell_7_5.setLineWrap(true);
		Cell_7_5.setEditable(false);
		Cell_7_5.setBackground(Color.WHITE);
		Cell_7_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_5.isEnabled()){
				Cell_7_5.setBackground(new Color(255,255,255));
				selected2 = Cell_7_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_5.isEnabled()){
				Cell_7_5.setBackground(Color.CYAN);
				selected2 = Cell_7_5;
				}
			}
		});
		
		Cell_7_6.setLineWrap(true);
		Cell_7_6.setEditable(false);
		Cell_7_6.setBackground(Color.WHITE);
		Cell_7_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_6.isEnabled()){
				Cell_7_6.setBackground(new Color(255,255,255));
				selected2 = Cell_7_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_6.isEnabled()){
				Cell_7_6.setBackground(Color.CYAN);
				selected2 = Cell_7_6;
				}
			}
		});
		
		Cell_7_7.setLineWrap(true);
		Cell_7_7.setEditable(false);
		Cell_7_7.setBackground(Color.WHITE);
		Cell_7_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_7.isEnabled()){
				Cell_7_7.setBackground(new Color(255,255,255));
				selected2 = Cell_7_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_7.isEnabled()){
				Cell_7_7.setBackground(Color.CYAN);
				selected2 = Cell_7_7;
				}
			}
		});
		
		Cell_7_8.setLineWrap(true);
		Cell_7_8.setEditable(false);
		Cell_7_8.setBackground(Color.WHITE);
		Cell_7_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_8.isEnabled()){
				Cell_7_8.setBackground(new Color(255,255,255));
				selected2 = Cell_7_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_8.isEnabled()){
				Cell_7_8.setBackground(Color.CYAN);
				selected2 = Cell_7_8;
				}
			}
		});
		
		Cell_7_9.setLineWrap(true);
		Cell_7_9.setEditable(false);
		Cell_7_9.setBackground(Color.WHITE);
		Cell_7_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_7_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_7_9.isEnabled()){
				Cell_7_9.setBackground(new Color(255,255,255));
				selected2 = Cell_7_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_7_9.isEnabled()){
				Cell_7_9.setBackground(Color.CYAN);
				selected2 = Cell_7_9;
				}
			}
		});
		
		Cell_8_1.setLineWrap(true);
		Cell_8_1.setEditable(false);
		Cell_8_1.setBackground(Color.WHITE);
		Cell_8_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_1.isEnabled()){
				Cell_8_1.setBackground(new Color(255,255,255));
				selected2 = Cell_8_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_1.isEnabled()){
				Cell_8_1.setBackground(Color.CYAN);
				selected2 = Cell_8_1;
				}
			}
		});
		
		Cell_8_2.setLineWrap(true);
		Cell_8_2.setEditable(false);
		Cell_8_2.setBackground(Color.WHITE);
		Cell_8_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_2.isEnabled()){
				Cell_8_2.setBackground(new Color(255,255,255));
				selected2 = Cell_8_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_2.isEnabled()){
				Cell_8_2.setBackground(Color.CYAN);
				selected2 = Cell_8_2;
				}
			}
		});
		
		Cell_8_3.setLineWrap(true);
		Cell_8_3.setEditable(false);
		Cell_8_3.setBackground(Color.WHITE);
		Cell_8_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_3.isEnabled()){
				Cell_8_3.setBackground(new Color(255,255,255));
				selected2 = Cell_8_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_3.isEnabled()){
				Cell_8_3.setBackground(Color.CYAN);
				selected2 = Cell_8_3;
				}
			}
		});
		
		Cell_8_4.setLineWrap(true);
		Cell_8_4.setEditable(false);
		Cell_8_4.setBackground(Color.WHITE);
		Cell_8_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_4.isEnabled()){
				Cell_8_4.setBackground(new Color(255,255,255));
				selected2 = Cell_8_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_4.isEnabled()){
				Cell_8_4.setBackground(Color.CYAN);
				selected2 = Cell_8_4;
				}
			}
		});
		
		Cell_8_5.setLineWrap(true);
		Cell_8_5.setEditable(false);
		Cell_8_5.setBackground(Color.WHITE);
		Cell_8_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_5.isEnabled()){
				Cell_8_5.setBackground(new Color(255,255,255));
				selected2 = Cell_8_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_5.isEnabled()){
				Cell_8_5.setBackground(Color.CYAN);
				selected2 = Cell_8_5;
				}
			}
		});
		
		Cell_8_6.setLineWrap(true);
		Cell_8_6.setEditable(false);
		Cell_8_6.setBackground(Color.WHITE);
		Cell_8_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_6.isEnabled()){
				Cell_8_6.setBackground(new Color(255,255,255));
				selected2 = Cell_8_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_6.isEnabled()){
				Cell_8_6.setBackground(Color.CYAN);
				selected2 = Cell_8_6;
				}
			}
		});
		
		Cell_8_7.setLineWrap(true);
		Cell_8_7.setEditable(false);
		Cell_8_7.setBackground(Color.WHITE);
		Cell_8_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_7.isEnabled()){
				Cell_8_7.setBackground(new Color(255,255,255));
				selected2 = Cell_8_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_7.isEnabled()){
				Cell_8_7.setBackground(Color.CYAN);
				selected2 = Cell_8_7;
				}
			}
		});
		
		Cell_8_8.setLineWrap(true);
		Cell_8_8.setEditable(false);
		Cell_8_8.setBackground(Color.WHITE);
		Cell_8_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_8.isEnabled()){
				Cell_8_8.setBackground(new Color(255,255,255));
				selected2 = Cell_8_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_8.isEnabled()){
				Cell_8_8.setBackground(Color.CYAN);
				selected2 = Cell_8_8;
				}
			}
		});
		
		Cell_8_9.setLineWrap(true);
		Cell_8_9.setEditable(false);
		Cell_8_9.setBackground(Color.WHITE);
		Cell_8_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_8_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_8_9.isEnabled()){
				Cell_8_9.setBackground(new Color(255,255,255));
				selected2 = Cell_8_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_8_9.isEnabled()){
				Cell_8_9.setBackground(Color.CYAN);
				selected2 = Cell_8_9;
				}
			}
		});
		
		Cell_9_1.setLineWrap(true);
		Cell_9_1.setEditable(false);
		Cell_9_1.setBackground(Color.WHITE);
		Cell_9_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_1.isEnabled()){
				Cell_9_1.setBackground(new Color(255,255,255));
				selected2 = Cell_9_1;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_1.isEnabled()){
				Cell_9_1.setBackground(Color.CYAN);
				selected2 = Cell_9_1;
				}
			}
		});
		
		Cell_9_2.setLineWrap(true);
		Cell_9_2.setEditable(false);
		Cell_9_2.setBackground(Color.WHITE);
		Cell_9_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_2.isEnabled()){
				Cell_9_2.setBackground(new Color(255,255,255));
				selected2 = Cell_9_2;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_2.isEnabled()){
				Cell_9_2.setBackground(Color.CYAN);
				selected2 = Cell_9_2;
				}
			}
		});
		
		Cell_9_3.setLineWrap(true);
		Cell_9_3.setEditable(false);
		Cell_9_3.setBackground(Color.WHITE);
		Cell_9_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_3.isEnabled()){
				Cell_9_3.setBackground(new Color(255,255,255));
				selected2 = Cell_9_3;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_3.isEnabled()){
				Cell_9_3.setBackground(Color.CYAN);
				selected2 = Cell_9_3;
				}
			}
		});
		
		Cell_9_4.setLineWrap(true);
		Cell_9_4.setEditable(false);
		Cell_9_4.setBackground(Color.WHITE);
		Cell_9_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_4.isEnabled()){
				Cell_9_4.setBackground(new Color(255,255,255));
				selected2 = Cell_9_4;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_4.isEnabled()){
				Cell_9_4.setBackground(Color.CYAN);
				selected2 = Cell_9_4;
				}
			}
		});
		
		Cell_9_5.setLineWrap(true);
		Cell_9_5.setEditable(false);
		Cell_9_5.setBackground(Color.WHITE);
		Cell_9_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_5.isEnabled()){
				Cell_9_5.setBackground(new Color(255,255,255));
				selected2 = Cell_9_5;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_5.isEnabled()){
				Cell_9_5.setBackground(Color.CYAN);
				selected2 = Cell_9_5;
				}
			}
		});
		
		Cell_9_6.setLineWrap(true);
		Cell_9_6.setEditable(false);
		Cell_9_6.setBackground(Color.WHITE);
		Cell_9_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_6.isEnabled()){
				Cell_9_6.setBackground(new Color(255,255,255));
				selected2 = Cell_9_6;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_6.isEnabled()){
				Cell_9_6.setBackground(Color.CYAN);
				selected2 = Cell_9_6;
				}
			}
		});
		
		Cell_9_7.setLineWrap(true);
		Cell_9_7.setEditable(false);
		Cell_9_7.setBackground(Color.WHITE);
		Cell_9_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_7.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_7.isEnabled()){
				Cell_9_7.setBackground(new Color(255,255,255));
				selected2 = Cell_9_7;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_7.isEnabled()){
				Cell_9_7.setBackground(Color.CYAN);
				selected2 = Cell_9_7;
				}
			}
		});
		
		Cell_9_8.setLineWrap(true);
		Cell_9_8.setEditable(false);
		Cell_9_8.setBackground(Color.WHITE);
		Cell_9_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_8.isEnabled()){
				Cell_9_8.setBackground(new Color(255,255,255));
				selected2 = Cell_9_8;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_8.isEnabled()){
				Cell_9_8.setBackground(Color.CYAN);
				selected2 = Cell_9_8;
				}
			}
		});
		
		Cell_9_9.setLineWrap(true);
		Cell_9_9.setEditable(false);
		Cell_9_9.setBackground(Color.WHITE);
		Cell_9_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Cell_9_9.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (Cell_9_9.isEnabled()){
				Cell_9_9.setBackground(new Color(255,255,255));
				selected2 = Cell_9_9;
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				if (Cell_9_9.isEnabled()){
				Cell_9_9.setBackground(Color.CYAN);
				selected2 = Cell_9_9;
				}
			}
		});
		
		Cell_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_1);

		Cell_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_2);

		Cell_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_3);

		Cell_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_1_4);

		Cell_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_1_5);

		Cell_1_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_1_6);

		Cell_1_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_7);

		Cell_1_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_8);

		Cell_1_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_1_9);

		Cell_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_1);

		Cell_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_2);

		Cell_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_3);

		Cell_2_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_2_4);

		Cell_2_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_2_5);

		Cell_2_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_2_6);

		Cell_2_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_7);

		Cell_2_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_8);

		Cell_2_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_2_9);

		Cell_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_1);

		Cell_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_2);

		Cell_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_3);

		Cell_3_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_3_4);

		Cell_3_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_3_5);

		Cell_3_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_3_6);

		Cell_3_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_7);

		Cell_3_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_8);

		Cell_3_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_3_9);

		Cell_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_1);

		Cell_4_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_2);

		Cell_4_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_3);

		Cell_4_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_4_4);

		Cell_4_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_4_5);

		Cell_4_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_4_6);

		Cell_4_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_7);

		Cell_4_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_8);

		Cell_4_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_4_9);

		Cell_5_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_1);

		Cell_5_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_2);

		Cell_5_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_3);

		Cell_5_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_5_4);

		Cell_5_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_5_5);

		Cell_5_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_5_6);

		Cell_5_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_7);

		Cell_5_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_8);

		Cell_5_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_5_9);

		Cell_6_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_1);

		Cell_6_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_2);

		Cell_6_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_3);

		Cell_6_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_6_4);

		Cell_6_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_6_5);

		Cell_6_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_6_6);

		Cell_6_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_7);

		Cell_6_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_8);

		Cell_6_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_6_9);

		Cell_7_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_1);

		Cell_7_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_2);

		Cell_7_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_3);

		Cell_7_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_7_4);

		Cell_7_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_7_5);

		Cell_7_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_7_6);

		Cell_7_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_7);

		Cell_7_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_8);

		Cell_7_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_7_9);

		Cell_8_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_1);

		Cell_8_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_2);

		Cell_8_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_3);

		Cell_8_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_8_4);

		Cell_8_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_8_5);

		Cell_8_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_8_6);

		Cell_8_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_7);

		Cell_8_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_8);

		Cell_8_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_8_9);

		Cell_9_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_1);

		Cell_9_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_2);

		Cell_9_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_3);

		Cell_9_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_9_4);

		Cell_9_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_9_5);

		Cell_9_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		PuzzlePanel.add(Cell_9_6);

		Cell_9_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_7);

		Cell_9_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_8);

		Cell_9_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PuzzlePanel.add(Cell_9_9);
		
		final JToggleButton pencil = new JToggleButton("");
		Image img = new ImageIcon(this.getClass().getResource("/pen.png")).getImage(); //set pen image
		pencil.setIcon(new ImageIcon(img));
		Image img2 = new ImageIcon(this.getClass().getResource("/pencil.png")).getImage(); //set pencil image
		pencil.setSelectedIcon(new ImageIcon(img2));
		pencil.setBounds(421, 436, 45, 39);
		GamePanel.add(pencil);
		GamePanel.setVisible(false);
		
		JButton btn1 = new JButton("");
		btn1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn1.setBackground(new Color(153, 102, 0));
		Image num1 = new ImageIcon(this.getClass().getResource("/1.png")).getImage(); //set button 1 image
		btn1.setIcon(new ImageIcon(num1));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(1));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						//selected2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
						String nums = selected2.getText();
						if(nums.contains("1")){
						}	
						else{
						selected2.setText(nums+Integer.toString(1)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn1.setBounds(43, 436, 39, 39);
		GamePanel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn2.setBackground(new Color(153, 102, 0));
		Image num2 = new ImageIcon(this.getClass().getResource("/2.png")).getImage(); //set button 2 image
		btn2.setIcon(new ImageIcon(num2));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(2));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						//selected2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
						String nums = selected2.getText();
						if(nums.contains("2")){
						}	
						else{
						selected2.setText(nums+Integer.toString(2)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn2.setBounds(85, 436, 39, 39);
		GamePanel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn3.setBackground(new Color(153, 102, 0));
		Image num3 = new ImageIcon(this.getClass().getResource("/3.png")).getImage(); //set button 3 image
		btn3.setIcon(new ImageIcon(num3));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(3));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("3")){
						}	
						else{
						selected2.setText(nums+Integer.toString(3)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn3.setBounds(127, 436, 39, 39);
		GamePanel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn4.setBackground(new Color(153, 102, 0));
		Image num4 = new ImageIcon(this.getClass().getResource("/4.png")).getImage(); //set button 4 image
		btn4.setIcon(new ImageIcon(num4));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(4));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("4")){
						}	
						else{
						selected2.setText(nums+Integer.toString(4)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn4.setBounds(169, 436, 39, 39);
		GamePanel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn5.setBackground(new Color(153, 102, 0));
		Image num5 = new ImageIcon(this.getClass().getResource("/5.png")).getImage(); //set button 5 image
		btn5.setIcon(new ImageIcon(num5));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(5));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("5")){
						}	
						else{
						selected2.setText(nums+Integer.toString(5)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn5.setBounds(211, 436, 39, 39);
		GamePanel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn6.setBackground(new Color(153, 102, 0));
		Image num6 = new ImageIcon(this.getClass().getResource("/6.png")).getImage(); //set button 6 image
		btn6.setIcon(new ImageIcon(num6));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(6));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("6")){
						}	
						else{
						selected2.setText(nums+Integer.toString(6)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn6.setBounds(253, 436, 39, 39);
		GamePanel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn7.setBackground(new Color(153, 102, 0));
		Image num7 = new ImageIcon(this.getClass().getResource("/7.png")).getImage(); //set button 7 image
		btn7.setIcon(new ImageIcon(num7));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(7));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("7")){
						}	
						else{
						selected2.setText(nums+Integer.toString(7)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn7.setBounds(295, 436, 39, 39);
		GamePanel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn8.setBackground(new Color(153, 102, 0));
		Image num8 = new ImageIcon(this.getClass().getResource("/8.png")).getImage(); //set button 8 image
		btn8.setIcon(new ImageIcon(num8));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(8));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("8")){
						}	
						else{
						selected2.setText(nums+Integer.toString(8)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn8.setBounds(337, 436, 39, 39);
		GamePanel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn9.setBackground(new Color(153, 102, 0));
		Image num9 = new ImageIcon(this.getClass().getResource("/9.png")).getImage(); //set button 9 image
		btn9.setIcon(new ImageIcon(num9));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){	
					if (pencil.isSelected()!= true){
						selected2.setFont(new Font("Times New Roman", Font.BOLD, 28));
						selected2.setText("  " + Integer.toString(9));
						//selected2.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
						selected2.setBackground(Color.LIGHT_GRAY);
						selected2.setDisabledTextColor(Color.BLACK);
						selected2.setEnabled(false);
					}
					else{
						String nums = selected2.getText();
						if(nums.contains("9")){
						}	
						else{
						selected2.setText(nums+Integer.toString(9)+ "  ");
						//selected2.setBorder(new LineBorder(Color.BLUE, 2));
						selected2.setBackground(Color.WHITE);
						selected2.setEditable(false);
						}
					}
				}
			}
		});
		btn9.setBounds(379, 436, 39, 39);
		GamePanel.add(btn9);
		
		JButton btnEraser = new JButton("");
		Image eraser = new ImageIcon(this.getClass().getResource("/eraser.png")).getImage(); //set button 9 image
		btnEraser.setIcon(new ImageIcon(eraser));
		btnEraser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selected2.isEnabled() == true){
					selected2.setText("");
					selected2.setBackground(Color.WHITE);
				}
			}
		});
		btnEraser.setBounds(468, 436, 39, 39);
		GamePanel.add(btnEraser);

		final JPanel SolutionPanel = new JPanel();
		frame.getContentPane().add(SolutionPanel, "name_371247993800605");
		SolutionPanel.setVisible(false);

		JButton btnEnter = new JButton("PLAY");
		Image play = new ImageIcon(this.getClass().getResource("/play.png")).getImage(); //set button 9 image
		btnEnter.setIcon(new ImageIcon(play));
		btnEnter.setBackground(Color.ORANGE);
		btnEnter.setForeground(new Color(0, 153, 0));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPanel.setVisible(true);
				EnterPanel.setVisible(false);
			}
		});
		btnEnter.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		btnEnter.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 18));
		btnEnter.setBounds(186, 355, 141, 47);
		EnterPanel.add(btnEnter);

		JLabel lblSudoku = new JLabel("SUDOKU");
		lblSudoku.setForeground(Color.ORANGE);
		lblSudoku.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudoku.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 70));
		lblSudoku.setBounds(71, 23, 383, 70);
		EnterPanel.add(lblSudoku);
		
		JLabel imageLabel = new JLabel("");
		Image enterImage = new ImageIcon(this.getClass().getResource("/SudokuIcon.png")).getImage(); //set image to label on enter screen
		imageLabel.setIcon(new ImageIcon(enterImage));
		imageLabel.setBounds(132, 88, 256, 256);
		EnterPanel.add(imageLabel);

		JLabel label = new JLabel("SUDOKU");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 70));
		label.setBounds(71, 23, 383, 70);
		UserPanel.add(label);

		JButton UPBackbutton = new JButton("<-Back");
		UPBackbutton.setBackground(new Color(51, 102, 51));
		UPBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,
				null));
		UPBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterPanel.setVisible(true);
				UserPanel.setVisible(false);
			}
		});
		UPBackbutton.setBounds(0, 0, 89, 23);
		UserPanel.add(UPBackbutton);

		JButton btnRegisterUser = new JButton("Register");
		btnRegisterUser.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegisterUser.setBackground(new Color(153, 102, 0));
		btnRegisterUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textUserName.getText().isEmpty())
				{
					String warning = "Enter valid username";
					noUserText.setText(warning);
					noUserText.setVisible(true);
					noUserText.setEditable(false);
				}
				else
				{
					noUserText.setVisible(false);
					String newUserName = textUserName.getText();
					newUserName = newUserName.trim();
					userName = newUserName;
					textUser.setText(newUserName);
					textUser.setEditable(false);
					DifficultyPanel.setVisible(true);
					UserPanel.setVisible(false);
				}
			}
		});
		btnRegisterUser.setBounds(172, 203, 89, 23);
		UserPanel.add(btnRegisterUser);

		textUserName = new JTextField(15);
		textUserName.setBounds(172, 172, 138, 20);
		UserPanel.add(textUserName);
		textUserName.setColumns(10);

		JLabel lblNewUser = new JLabel("New User? Enter Username");
		lblNewUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewUser.setForeground(Color.ORANGE);
		lblNewUser.setBounds(172, 144, 219, 23);
		UserPanel.add(lblNewUser);

		JLabel lblChooseName = new JLabel("Already Registered?");
		lblChooseName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseName.setForeground(Color.ORANGE);
		lblChooseName.setBounds(172, 237, 148, 14);
		UserPanel.add(lblChooseName);

		JLabel lblNewLabel_1 = new JLabel("Choose Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(172, 257, 138, 14);
		UserPanel.add(lblNewLabel_1);

		//String[] user1 = { "Han Solo", "Darth Vader" };
		final JComboBox<String> comboRegUsers = new JComboBox<String>();
		comboRegUsers.addItem("Han Solo");
		comboRegUsers.addItem("Darth Vader");
		comboRegUsers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Object selectedUser = comboRegUsers.getSelectedItem();
				userName = (String) selectedUser;
				textUser.setText(userName);
				textUser.setEditable(false);
				DifficultyPanel.setVisible(true);
				UserPanel.setVisible(false);
			}
		});
		comboRegUsers.setEditable(false);
		comboRegUsers.setBounds(172, 282, 138, 20);
		UserPanel.add(comboRegUsers);
		
		noUserText = new JTextField();
		noUserText.setForeground(Color.RED);
		noUserText.setSelectedTextColor(Color.RED);
		noUserText.setBorder(null);
		noUserText.setBackground(new Color(0, 102, 51));
		noUserText.setBounds(172, 313, 155, 20);
		UserPanel.add(noUserText);
		noUserText.setColumns(10);
		
		JLabel imageLabel2 = new JLabel("");
		Image bambooImage = new ImageIcon(this.getClass().getResource("/bambooframe.png")).getImage(); //set image for username screen
		imageLabel2.setIcon(new ImageIcon(bambooImage));
		imageLabel2.setBounds(135, 104, 256, 320);
		UserPanel.add(imageLabel2);

		JLabel label_1 = new JLabel("SUDOKU");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.ORANGE);
		label_1.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 70));
		label_1.setBounds(71, 23, 383, 70);
		DifficultyPanel.add(label_1);

		JButton DifficultyBackbutton = new JButton("<-Back");
		DifficultyBackbutton.setBackground(new Color(51, 102, 51));
		DifficultyBackbutton.setBorder(new EtchedBorder(EtchedBorder.LOWERED,
				null, null));
		DifficultyBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserPanel.setVisible(true);
				DifficultyPanel.setVisible(false);
			}
		});
		DifficultyBackbutton.setBounds(0, 0, 89, 23);
		DifficultyPanel.add(DifficultyBackbutton);

		JLabel lblWelcome = new JLabel("Welcome:");
		lblWelcome.setForeground(Color.ORANGE);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWelcome.setBounds(184, 104, 103, 14);
		DifficultyPanel.add(lblWelcome);

		JLabel lblChooseDifficulty = new JLabel("Choose Difficulty");
		lblChooseDifficulty.setForeground(Color.ORANGE);
		lblChooseDifficulty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseDifficulty.setBounds(184, 122, 121, 17);
		DifficultyPanel.add(lblChooseDifficulty);

		JButton btnEasy = new JButton("Easy");
		btnEasy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEasy.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		btnEasy.setBackground(Color.GREEN);
		btnEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Player gamePlayer = new Player(userName, getTag(userName), 1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				GamePanel.setVisible(true);
				DifficultyPanel.setVisible(false);
			}
		});
		btnEasy.setBounds(184, 150, 170, 47);
		DifficultyPanel.add(btnEasy);

		JButton btnMedium = new JButton("Medium");
		btnMedium.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMedium.setBorder(new BevelBorder(BevelBorder.RAISED, null, null,
				null, null));
		btnMedium.setBackground(Color.YELLOW);
		btnMedium.setBounds(184, 219, 170, 47);
		DifficultyPanel.add(btnMedium);

		JButton btnHard = new JButton("Hard");
		btnHard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHard.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		btnHard.setBackground(new Color(255, 153, 0));
		btnHard.setBounds(184, 288, 170, 47);
		DifficultyPanel.add(btnHard);

		JButton btnEvil = new JButton("EVIL!!");
		btnEvil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEvil.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null,
				null));
		btnEvil.setBackground(new Color(255, 0, 0));
		btnEvil.setBounds(184, 357, 170, 47);
		DifficultyPanel.add(btnEvil);

		textUser = new JTextField();
		textUser.setForeground(new Color(255, 102, 0));
		textUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		textUser.setBorder(null);
		textUser.setBackground(new Color(0, 102, 51));
		textUser.setBounds(256, 102, 139, 20);
		DifficultyPanel.add(textUser);
		textUser.setColumns(10);
		
		JLabel imageLabel3 = new JLabel("");
		Image bambooImage2 = new ImageIcon(this.getClass().getResource("/bamboostalks.png")).getImage(); //set image for difficulty screen
		imageLabel3.setIcon(new ImageIcon(bambooImage2));
		imageLabel3.setBounds(10, 54, 150, 432);
		DifficultyPanel.add(imageLabel3);
	}

	private JMenuItem makeMenuItem(String name) {
		JMenuItem m = new JMenuItem(name);
		m.addActionListener(this);
		return m;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static String getTag(String name) {
		String result = "";
		for (int ii = 0; ii < name.length(); ii++) {
			int number = (int) (Math.pow(
					(double) ((int) name.charAt(ii) - 'A' + 1), 37.0) % ((int) 'z' - (int) 'A'));
			result += number;
		}

		return result;
	}
}
