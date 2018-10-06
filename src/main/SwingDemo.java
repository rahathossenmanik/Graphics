package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class SwingDemo {
	private JTextField textfield;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	
	SwingDemo(){
		JFrame frame = new JFrame("Calculator");
		frame.setSize(404, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		textfield=new JTextField();
		textfield.setBounds(0,0,400,200);
		frame.getContentPane().add(textfield);
		textfield.setColumns(10);
		textfield.setFont(new Font("Didot",Font.BOLD,120));
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		
		ActionListener listener = new AddCalculatorListener();
		
		button1 = new JButton("7");
		button2 = new JButton("8");
		button3 = new JButton("9");
		button4 = new JButton("/");
		button5 = new JButton("4");
		button6 = new JButton("5");
		button7 = new JButton("6");
		button8 = new JButton("X");
		button9 = new JButton("1");
		button10 = new JButton("2");
		button11 = new JButton("3");
		button12 = new JButton("-");
		button13 = new JButton("0");
		button14 = new JButton(".");
		button15 = new JButton("=");
		button16 = new JButton("+");
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
		button1.setFont(new Font("Didot",Font.BOLD,96));
		button2.setFont(new Font("Didot",Font.BOLD,96));
		button3.setFont(new Font("Didot",Font.BOLD,96));
		button4.setFont(new Font("Didot",Font.BOLD,96));
		button5.setFont(new Font("Didot",Font.BOLD,96));
		button6.setFont(new Font("Didot",Font.BOLD,96));
		button7.setFont(new Font("Didot",Font.BOLD,96));
		button8.setFont(new Font("Didot",Font.BOLD,96));
		button9.setFont(new Font("Didot",Font.BOLD,96));
		button10.setFont(new Font("Didot",Font.BOLD,96));
		button11.setFont(new Font("Didot",Font.BOLD,96));
		button12.setFont(new Font("Didot",Font.BOLD,96));
		button13.setFont(new Font("Didot",Font.BOLD,96));
		button14.setFont(new Font("Didot",Font.BOLD,96));
		button15.setFont(new Font("Didot",Font.BOLD,96));
		button16.setFont(new Font("Didot",Font.BOLD,96));
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
		frame.add(button16);;
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		button10.addActionListener(listener);
		button11.addActionListener(listener);
		button12.addActionListener(listener);
		button13.addActionListener(listener);
		button14.addActionListener(listener);
		button15.addActionListener(listener);
		button16.addActionListener(listener);
	}
	class AddCalculatorListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton button = (JButton)event.getSource();
			if(button == button1)textfield.setText(textfield.getText()+"7");
			if(button == button2)textfield.setText(textfield.getText()+"8");
			if(button == button3)textfield.setText(textfield.getText()+"9");
			if(button == button4)textfield.setText(textfield.getText()+"/");
			if(button == button5)textfield.setText(textfield.getText()+"4");
			if(button == button6)textfield.setText(textfield.getText()+"5");
			if(button == button7)textfield.setText(textfield.getText()+"6");
			if(button == button8)textfield.setText(textfield.getText()+"X");
			if(button == button9)textfield.setText(textfield.getText()+"1");
			if(button == button10)textfield.setText(textfield.getText()+"2");
			if(button == button11)textfield.setText(textfield.getText()+"3");
			if(button == button12)textfield.setText(textfield.getText()+"-");
			if(button == button13)textfield.setText(textfield.getText()+"0");
			if(button == button14)textfield.setText(textfield.getText()+".");
			if(button == button15)textfield.setText(textfield.getText()+"=");
			if(button == button16)textfield.setText(textfield.getText()+"+");
		}
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new SwingDemo();
			}
		});
	}
}