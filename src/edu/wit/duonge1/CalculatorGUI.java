package edu.wit.duonge1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
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
	private JButton btnDiv;
	private JButton btnMult;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnDot;
	private JButton btnPlusMinus;
	private JButton btnBlank;
	private JButton btnClear;
	private int index = -1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 225, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		numTextField = new JTextField();
		numTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ((e.getKeyCode() >= 48 && e.getKeyCode() <= 57) || (e.getKeyCode() >= 96 && e.getKeyCode() <= 111)) {
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
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					numTextField.setText(compute(numTextField.getText()));
					System.out.println("enter");
				}
			}
		});
		numTextField.setEditable(false);
		contentPane.add(numTextField, "cell 0 0,growx");
		numTextField.setColumns(10);
		
		JPanel buttonsPanel = new JPanel();
		contentPane.add(buttonsPanel, "cell 0 1,grow");
		buttonsPanel.setLayout(new MigLayout("wrap 4"));
		
		btnBlank = new JButton("  ");
		btnBlank.setFocusable(false);
		buttonsPanel.add(btnBlank, "growx");
		
		btnClear = new JButton("C");
		btnClear.setFocusable(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numTextField.setText(null);
				index = -1;
			}
		});
		buttonsPanel.add(btnClear, "growx");
		
		btnBack = new JButton("<");
		btnBack.setFocusable(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					numTextField.setText(numTextField.getText().substring(0, numTextField.getText().length()-1));
				} catch (StringIndexOutOfBoundsException e1) {
					System.out.println(e1.getMessage());
				}
				index--;
			}
		});
		buttonsPanel.add(btnBack, "growx");
		
		btnDiv = new JButton("/");
		btnDiv.setFocusable(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnDiv.getText());
				index++;
			}
		});
		buttonsPanel.add(btnDiv, "growx");
		
		btnOne = new JButton("1");
		btnOne.setFocusable(false);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnOne.getText());
				index++;
			}
		});
		buttonsPanel.add(btnOne, "growx");
		
		btnTwo = new JButton("2");
		btnTwo.setFocusable(false);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnTwo.getText());
				index++;
			}
		});
		buttonsPanel.add(btnTwo, "growx");
		
		btnThree = new JButton("3");
		btnThree.setFocusable(false);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnThree.getText());
				index++;
			}
		});
		buttonsPanel.add(btnThree, "growx");
		
		btnMult = new JButton("*");
		btnMult.setFocusable(false);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnMult.getText());
				index++;
			}
		});
		buttonsPanel.add(btnMult, "growx");
		
		btnFour = new JButton("4");
		btnFour.setFocusable(false);
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnFour.getText());
				index++;
			}
		});
		buttonsPanel.add(btnFour, "growx");
		
		btnFive = new JButton("5");
		btnFive.setFocusable(false);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnFive.getText());
				index++;
			}
		});
		buttonsPanel.add(btnFive, "growx");
		
		btnSix = new JButton("6");
		btnSix.setFocusable(false);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnSix.getText());
				index++;
			}
		});
		buttonsPanel.add(btnSix, "growx");
		
		btnSub = new JButton("-");
		btnSub.setFocusable(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnSub.getText());
				index++;
			}
		});
		buttonsPanel.add(btnSub, "growx");
		
		btnSeven = new JButton("7");
		btnSeven.setFocusable(false);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnSeven.getText());
				index++;
			}
		});
		buttonsPanel.add(btnSeven, "growx");
		
		btnEight = new JButton("8");
		btnEight.setFocusable(false);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnEight.getText());
				index++;
			}
		});
		buttonsPanel.add(btnEight, "growx");
		
		btnNine = new JButton("9");
		btnNine.setFocusable(false);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnNine.getText());
				index++;
			}
		});
		buttonsPanel.add(btnNine, "growx");
		
		btnAdd = new JButton("+");
		btnAdd.setFocusable(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnAdd.getText());
				index++;
			}
		});
		buttonsPanel.add(btnAdd, "growx");
		
		btnPlusMinus = new JButton("±");
		btnPlusMinus.setFocusable(false);
		buttonsPanel.add(btnPlusMinus, "growx");
		
		btnZero = new JButton("0");
		btnZero.setFocusable(false);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnZero.getText());
			}
		});
		buttonsPanel.add(btnZero, "growx");
		
		btnDot = new JButton(".");
		btnDot.setFocusable(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(numTextField.getText()+btnDot.getText());
				index++;
			}
		});
		buttonsPanel.add(btnDot, "growx");
		
		btnEqual = new JButton("=");
		btnEqual.setFocusable(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numTextField.setText(compute(numTextField.getText()));
			}
		});
		buttonsPanel.add(btnEqual, "growx");
	}
	
	public String compute(String numTextField) {
		double left;
		double right;
		String result = "";
		int op = -1;

		if (numTextField.contains("+")) {
			left = Double.valueOf(numTextField.substring(0, numTextField.indexOf('+')));
			op = 0;
			right = Double.valueOf(numTextField.substring(numTextField.indexOf('+')+1, numTextField.length()));
			result = String.valueOf(left+right);
		} else if (numTextField.contains("-")) {
			left = Double.valueOf(numTextField.substring(0, numTextField.indexOf('-')));
			right = Double.valueOf(numTextField.substring(numTextField.indexOf('-')+1, numTextField.length()));
			op = 1;
			result = String.valueOf(left-right);
		} else if (numTextField.contains("*")) {
			left = Double.valueOf(numTextField.substring(0, numTextField.indexOf('*')));
			right = Double.valueOf(numTextField.substring(numTextField.indexOf('*')+1, numTextField.length()));
			op = 2;
			result = String.valueOf(left*right);
		} else if (numTextField.contains("/")) {
			left = Double.valueOf(numTextField.substring(0, numTextField.indexOf('/')));
			right = Double.valueOf(numTextField.substring(numTextField.indexOf('/')+1, numTextField.length()));
			op = 3;
			result = String.valueOf(left/right);
		} else {
			result = numTextField;
		}
		
		return result;
	}
	
	

}
