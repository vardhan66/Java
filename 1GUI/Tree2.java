import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;


public class Tree2
{
public static void main(String[] args)
{
SwingUtilities.invokeLater(new Runnable() {
public void run()
{
new A();
}
});

}//Closing the main method
}//Closing the class Combo


class A //implements ActionListener
{
JFrame jf;
JTree tree1; 
DefaultTreeModel dTree;
JLabel label1, label2;

A()
{
 
jf= new JFrame("JTree");
label1 = new JLabel("Displaying tree");

DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Nutritious Food");

//Creating 3 children of the root node, Nutritious Food.
DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
DefaultMutableTreeNode vegetables = new DefaultMutableTreeNode("Vegetables");
DefaultMutableTreeNode dryFruits = new DefaultMutableTreeNode("Dry Fruits");

//Adding 3 children - to Nutritious Food
rootNode.add(fruits);
rootNode.add(vegetables);
rootNode.add(dryFruits);


//Creating 3 children of fruits
DefaultMutableTreeNode fruit1 = new DefaultMutableTreeNode("Apple");
DefaultMutableTreeNode fruit2= new DefaultMutableTreeNode("Mango");
DefaultMutableTreeNode fruit3= new DefaultMutableTreeNode("Grapes");

//Adding 3 children to fruits
fruits.add(fruit1);
fruits.add(fruit2);
fruits.add(fruit3);


//Creating two children of vegetables
DefaultMutableTreeNode vegetable1 = new DefaultMutableTreeNode("Cabbage");
DefaultMutableTreeNode vegetable2= new DefaultMutableTreeNode("Tomato");
DefaultMutableTreeNode vegetable3 = new DefaultMutableTreeNode("Potato");

//Adding two child of vegetables
vegetables.add(vegetable1);
vegetables.add(vegetable2);
vegetables.add(vegetable3);


//Creating and adding one child dry fruits
DefaultMutableTreeNode dryFruit1 = new DefaultMutableTreeNode("Almonds");
DefaultMutableTreeNode dryFruit2 = new DefaultMutableTreeNode("Walnuts");
dryFruits.add(dryFruit1);
dryFruits.add(dryFruit2);


dTree= new DefaultTreeModel(rootNode);

//Creating a JTree from DefaultTreeModel, implementer of TreeModel Interface.
JTree tree = new JTree(dTree);

//Adding JTree to JScrollPane
JScrollPane scrollP = new JScrollPane(tree);

scrollP.setBorder(BorderFactory.createEmptyBorder()); //How to remove the border of JScrollPane.
scrollP.setPreferredSize(new Dimension(300, 230));

jf.add(label1);
jf.add(scrollP);


jf.setLayout(new FlowLayout());
jf.setSize(400,320);
jf.setVisible(true);
}

}