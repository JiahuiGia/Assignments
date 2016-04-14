package Assignment7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {

	private JTextField result;
	private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, radixPoint, plus, minus, multiply,
			devide, equal, allClean, plusOrMinus, percent;
	private boolean startNumber = true;
	private Logic calcLogic = new Logic();
	private String previousOp = "=";
	private String currentOp = "=";

	public Calculator() {
		setTitle("Calculator");
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
	}

	private void makeItVisible() {
		this.setSize(500, 750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void addListeners() {
		NumListener numListener = new NumListener();
		num1.addActionListener(numListener);
		num2.addActionListener(numListener);
		num3.addActionListener(numListener);
		num4.addActionListener(numListener);
		num5.addActionListener(numListener);
		num6.addActionListener(numListener);
		num7.addActionListener(numListener);
		num8.addActionListener(numListener);
		num9.addActionListener(numListener);
		num0.addActionListener(numListener);
		radixPoint.addActionListener(numListener);

		BinaryOpListener binaryOpListener = new BinaryOpListener();
		plus.addActionListener(binaryOpListener);
		minus.addActionListener(binaryOpListener);
		multiply.addActionListener(binaryOpListener);
		devide.addActionListener(binaryOpListener);
		equal.addActionListener(binaryOpListener);

		UnaryOpListener unaryOpListener = new UnaryOpListener();
		plusOrMinus.addActionListener(unaryOpListener);
		percent.addActionListener(unaryOpListener);

		ClearListener clearListener = new ClearListener();
		allClean.addActionListener(clearListener);

	}

	private void actionClear() {
		startNumber = true;
		result.setText("0");
		previousOp = "=";
		calcLogic.setTotal("0");
	}

	class BinaryOpListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (startNumber) {
				previousOp = e.getActionCommand();
			} else {
				startNumber = true;
				currentOp = e.getActionCommand();
				String displayText = result.getText();
				if (previousOp.equals("=")) {
					calcLogic.setTotal(displayText);
				} else if (previousOp.equals("+")) {
					calcLogic.plus(displayText);
				} else if (previousOp.equals("-")) {
					calcLogic.minus(displayText);
				} else if (previousOp.equals("¡Á")) {
					calcLogic.multiply(displayText);
				} else if (previousOp.equals("¡Â")) {
					calcLogic.divide(displayText);
				}
				result.setText("" + calcLogic.getTotalString());
			}
			if (!currentOp.equals("="))
				previousOp = e.getActionCommand();
		}
	}

	class UnaryOpListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			startNumber = true;
			currentOp = e.getActionCommand();
			String displayText = result.getText();
			if (currentOp.equals("+/-")) {
				calcLogic.plusOrMinus(displayText);
			} else if (currentOp.equals("%")) {
				calcLogic.percent(displayText);
			}
			result.setText("" + calcLogic.getTotalString());
		}

	}

	class ClearListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			actionClear();
		}
	}

	class NumListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String digit = e.getActionCommand();
			if (digit.equals(".")) {
				if (result.getText().contains(".")) {
				} else {
					result.setText(result.getText() + digit);
				}
			} else if (startNumber) {
				result.setText(digit);
				startNumber = false;
			} else {
				result.setText(result.getText() + digit);
			}
		}

	}

	private void addComponents() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 1));

		JPanel p1 = new JPanel();
		p1.add(result);
		con.add(p1);

		JPanel p2 = new JPanel();
		p2.add(allClean);
		p2.add(plusOrMinus);
		p2.add(percent);
		p2.add(devide);
		con.add(p2);

		JPanel p3 = new JPanel();
		p3.add(num7);
		p3.add(num8);
		p3.add(num9);
		p3.add(multiply);
		con.add(p3);

		JPanel p4 = new JPanel();
		p4.add(num4);
		p4.add(num5);
		p4.add(num6);
		p4.add(minus);
		con.add(p4);

		JPanel p5 = new JPanel();
		p5.add(num1);
		p5.add(num2);
		p5.add(num3);
		p5.add(plus);
		con.add(p5);

		JPanel p6 = new JPanel();
		p6.add(num0);
		p6.add(radixPoint);
		p6.add(equal);
		con.add(p6);

	}

	private void createComponents() {
		result = new JTextField("0", 20);
		result.setFont(new Font("Calibri", Font.BOLD, 20));
		result.setHorizontalAlignment(JTextField.RIGHT);

		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		radixPoint = new JButton(".");

		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("¡Á");
		devide = new JButton("¡Â");
		equal = new JButton("=");

		allClean = new JButton("AC");
		plusOrMinus = new JButton("+/-");
		percent = new JButton("%");
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
