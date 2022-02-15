package calculator;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener {
   
	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();
	
	double number1,number2,result;
	int add=0,mul=0,sub=0,div=0;
	
	public calculator() {
		frame.setSize(500,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Sakshi Calculator");
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLUE,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder= BorderFactory.createLineBorder(Color.RED,3);
		textarea.setBorder(tborder);
		Font font= new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 1.jpeg"));
		
		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 2.jpeg"));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 3.jpeg"));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 4.jpeg"));
		
		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 5.jpeg"));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 6.jpeg"));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 7.jpeg"));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 8.jpeg"));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 9.jpeg"));
		
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button 0.jpeg"));
		
		
		buttonadd.setPreferredSize(new Dimension(100,40));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button add.jpeg"));
		
		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button sub.jpeg"));
		
		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button mul.jpeg"));
		
		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button div.jpeg"));
		
		buttonclear.setPreferredSize(new Dimension(100,40));
		buttonclear.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button clear.jpeg"));
		
		buttondot.setPreferredSize(new Dimension(100,40));
		buttondot.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button dot.jpeg"));
		
		buttonequal.setPreferredSize(new Dimension(100,40));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\ahana\\OneDrive\\Pictures\\button equal to.jpeg"));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonclear);
		panel.add(buttondot);
		panel.add(buttonequal);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		
		}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==buttonclear) {
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		if(source==button1) {
			textarea.setText("1");
		}
		if(source==button2) {
			textarea.setText("2");
		}
		if(source==button3) {
			textarea.setText("3");
		}
		if(source==button4) {
			textarea.append("4");
		}
		if(source==button5) {
			textarea.setText("5");
		}
		if(source==button6) {
			textarea.append("6");
		}
		if(source==button7) {
			textarea.setText("7");
		}
		if(source==button8) {
			textarea.setText("8");
		}
		if(source==button9) {
			textarea.setText("9");
		}
		if(source==button0) {
			textarea.setText("0");
		}
		if(source==buttondot) {
			textarea.setText(".");
		}
		if(source==buttonadd) {
			number1=number_reader();
			textarea.setText("+");
			add=1;
			sub=0;
			mul=0;
			div=0;
		}
		if(source==buttonsub) {
			number1=number_reader();
			textarea.setText("-");
			add=0;
			sub=1;
			mul=0;
			div=0;
		}
		if(source==buttonmul) {
			number1=number_reader();
			textarea.setText("*");
			add=0;
			sub=0;
			mul=1;
			div=0;
		}
		if(source==buttondiv) {
			number1=number_reader();
			textarea.setText("/");
			add=0;
			sub=0;
			mul=0;
			div=1;
		}
		if(source==buttonequal) {
			number2=number_reader();

			if(add>0) {
				result=number1+number2;
				textarea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=number1-number2;
				textarea.setText(Double.toString(result));
			}
			if(mul>0) {
				result=number1*number2;
				textarea.setText(Double.toString(result));
			}
			if(div>0) {
				result=number1/number2;
				textarea.setText(Double.toString(result));
			}
		}
	}
	
	public double number_reader() {
		double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
}
