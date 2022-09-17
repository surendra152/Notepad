package mypackage.notepad;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	
	JButton b1;
	About(){
		setBounds(600,200,700,600);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("mypackage/notepad/icons/windows.png"));
		Image i2=i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
				
		JLabel l1=new JLabel(i3);
		l1.setBounds(150,40,400,80);
		add(l1);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("mypackage/notepad/icons/notepad.png"));
		Image i5=i4.getImage().getScaledInstance(700, 70, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
				
		JLabel l2=new JLabel(i6);
		l2.setBounds(50,180,70,70);
		add(l2);
		
		JLabel l3=new JLabel("<Html>Welcome to Notepad<br>Notepad is a word processing programme<br> which allows chaning of text in a compiter file.<br>Notepad is simple text editor for basic text editing program<brWhich anables computer uses to create documents  ></html>");
		l3.setBounds(150,130,500,300);
		l3.setFont(new Font("SEN SERIF",Font.PLAIN,18));
		add(l3);
		b1=new JButton("Ok");
		b1.setBounds(580,500,80,25);
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About().setVisible(true);
	}

}
