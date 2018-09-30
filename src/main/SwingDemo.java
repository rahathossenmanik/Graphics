package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingDemo {
	SwingDemo(){
		JFrame frame = new JFrame("Calculator");
		frame.setSize(416, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JButton button1 = new JButton("7");
		JButton button2 = new JButton("8");
		JButton button3 = new JButton("9");
		JButton button4 = new JButton("/");
		JButton button5 = new JButton("4");
		JButton button6 = new JButton("5");
		JButton button7 = new JButton("6");
		JButton button8 = new JButton("X");
		JButton button9 = new JButton("1");
		JButton button10 = new JButton("2");
		JButton button11 = new JButton("3");
		JButton button12 = new JButton("-");
		JButton button13 = new JButton("0");
		JButton button14 = new JButton(".");
		JButton button15 = new JButton("=");
		JButton button16 = new JButton("+");
		button1.setBounds(0 , 200 , 100 , 100);
		button2.setBounds(100 , 200 , 100 , 100);
		button3.setBounds(200 , 200 , 100 , 100);
		button4.setBounds(300 , 200 , 100 , 100);
		button5.setBounds(0 , 300 , 100 , 100);
		button6.setBounds(100 , 300 , 100 , 100);
		button7.setBounds(200 , 300 , 100 , 100);
		button8.setBounds(300 , 300 , 100 , 100);
		button9.setBounds(0 , 400 , 100 , 100);
		button10.setBounds(100 , 400 , 100 , 100);
		button11.setBounds(200 , 400 , 100 , 100);
		button12.setBounds(300 , 400 , 100 , 100);
		button13.setBounds(0 , 500 , 100 , 100);
		button14.setBounds(100 , 500 , 100 , 100);
		button15.setBounds(200 , 500 , 100 , 100);
		button16.setBounds(300 , 500 , 100 , 100);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(button11);
		frame.add(button12);
		frame.add(button13);
		frame.add(button14);
		frame.add(button15);
		frame.add(button16);
		frame.setVisible(true);
	}	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new SwingDemo();
			}
		});
	}
}
