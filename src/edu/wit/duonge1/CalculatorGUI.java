package edu.wit.duonge1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField numTextField;
	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnZero;
	private JButton btnBack;
	private JButton btnEqual;
	private int index = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 176, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		numTextField = new JTextField();
		numTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode() >= 48 && e.getKeyCode() <= 57) || (e.getKeyCode() >= 96 && e.getKeyCode() <= 107)) {
					numTextField.setText(numTextField.getText()+e.getKeyChar());
					index++;
				}
				if (e.getKeyCode() == 8) {
					try {
						numTextField.setText(numTextField.getText().substring(0, numTextField.getText().length()-1));
					} catch (StringIndexOutOfBoundsException e1) {
						System.out.println(e1.getMessage());
					}
					index--;
				}
			}
		});
		numTextField.setEditable(false);
		contentPane.add(numTextField, "cell 0 0,growx");
		numTextField.setColumns(10);
		
		JPanel buttonsPanel = new JPanel();
		contentPane.add(buttonsPanel, "cell 0 1,grow");
		
		btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnOne.getText());
				index++;
			}
		});
		buttonsPanel.setLayout(new MigLayout("wrap 3"));
		buttonsPanel.add(btnOne);
		
		btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnTwo.getText());
				index++;
			}
		});
		buttonsPanel.add(btnTwo);
		
		btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnThree.getText());
				index++;
			}
		});
		buttonsPanel.add(btnThree);
		
		btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnFour.getText());
				index++;
			}
		});
		buttonsPanel.add(btnFour);
		
		btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnFive.getText());
				index++;
			}
		});
		buttonsPanel.add(btnFive);
		
		btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnSix.getText());
				index++;
			}
		});
		buttonsPanel.add(btnSix);
		
		btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnSeven.getText());
				index++;
			}
		});
		buttonsPanel.add(btnSeven);
		
		btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnEight.getText());
				index++;
			}
		});
		buttonsPanel.add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnNine.getText());
				index++;
			}
		});
		buttonsPanel.add(btnNine);
		
		btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numTextField.setText(numTextField.getText().substring(0, numTextField.getText().length()-1));
				} catch (StringIndexOutOfBoundsException e1) {
					//System.out.println("There is nothing left in the numTextField");
					System.out.println(e1.getMessage());
				}
				index--;
			}
		});
		buttonsPanel.add(btnBack);
		
		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnZero.getText());
			}
		});
		buttonsPanel.add(btnZero);
		
		btnEqual = new JButton("=");
		buttonsPanel.add(btnEqual);
	}
	
	

}
