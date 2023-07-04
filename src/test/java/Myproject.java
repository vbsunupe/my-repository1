

import javax.swing.*;
import java.awt.*;
public class Myproject extends JFrame {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myproject mp=new Myproject();
		JFrame frame=new JFrame("Vishal");
		frame.setBounds(50, 100, 200, 30);
		frame.setSize(1000, 1000);

		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		frame.setLayout(null);
		frame.setVisible(true);
		

		JPanel p=new JPanel();
		
		p.setBounds(100,50,600,500);

		frame.getContentPane().add(p);
		JButton button1=new JButton("Ok");	button1.setBackground(Color.GREEN);
		JButton button2=new JButton("cancel");button2.setBackground(Color.pink);
		JButton button3=new JButton("submit");button3.setBackground(Color.gray);




		p.add(button1);
		p.add(button2);
		p.add(button3);

		//==== creating menubar                                  	=========
		JMenuBar menubar=new JMenuBar();
		menubar.setBounds(200,150,600,500);
		JMenu filemenu=new JMenu("new file");
		JMenu helpmenu=new JMenu("Help");
		JMenu newfilemenu=new JMenu("new file");
		JMenu ssaveasmenu=new JMenu("save as");

		menubar.add(filemenu);
		menubar.add(helpmenu);
		menubar.add(newfilemenu);
		menubar.add(ssaveasmenu);
	    p.add(menubar);
	
		//frame.getContentPane().add(BorderLayout.NORTH,menubar);
		
       //==== text fields============
		JLabel label=new JLabel("Enter text");
		label.setBounds(10, 10, 200, 30);
		JTextField textfield=new JTextField(10);
		textfield.setBounds(80, 10, 200, 30);

		frame.getContentPane().add(BorderLayout.SOUTH,label);
		frame.getContentPane().add(BorderLayout.SOUTH,textfield);
		
		//====checkboxes=====
		JCheckBox check1=new JCheckBox("java");check1.setBounds(200,150,600,500);
		JCheckBox check2=new JCheckBox("python");check2.setBounds(300,200,600,500);
		frame.add(check1);
		frame.add(check2,true);
		
		//========== Radiobuttons            =============================
		JRadioButton radio1=new JRadioButton("1)vishal");check1.setBounds(200,300,600,500);
		JRadioButton radio2=new JRadioButton("2)vishnu");check2.setBounds(200,350,600,500);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		frame.add(radio1);
		frame.add(radio2);
	}

}
