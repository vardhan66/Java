import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class AddJTabbedPane 
{
	JTabbedPane tp;
	JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8;
	JPanel fruit, vegetable;
	JFrame frame;
	public void createUI()
	{
		frame=new JFrame("JTabbedPane Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fruit = new JPanel(new GridLayout(6,2));
		lab1=new JLabel("Apple");
		lab2=new JLabel("Orange");
		lab3=new JLabel("Papaya");
		lab4=new JLabel("Pine Apple");
		fruit.add(lab1);
		fruit.add(lab2);
		fruit.add(lab3);
		fruit.add(lab4);

		vegetable = new JPanel(new GridLayout(6,2));
		lab5=new JLabel("Cauliflower");
		lab6=new JLabel("Brinjal");
		lab7=new JLabel("Peas");
		lab8=new JLabel("Lady finger");
		vegetable.add(lab5);
		vegetable.add(lab6);
		vegetable.add(lab7);
		vegetable.add(lab8);
		
		tp=new JTabbedPane();
                Container pane = frame.getContentPane();
		pane.add(tp);
		tp.addTab("Fruit",fruit);
		tp.addTab("Vegetable",vegetable);

		frame.setSize(200,200);
		frame.setVisible(true);

	}	
	public static void main(String[] args) 
	{
		AddJTabbedPane tbp = new AddJTabbedPane();
		tbp.createUI();		
	}
}
