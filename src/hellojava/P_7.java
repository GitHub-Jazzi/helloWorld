package hellojava;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class P_7 
{ public static void main(String[] args)
  { W1 win1 = new W1();
  }
}

class W1 extends JFrame implements ActionListener
{ 
	JFrame f1,f2;
	W1(){
		f1 = new JFrame("1");
	    f1.setSize(400,600);
	    JButton bt =new JButton("2");
	    bt.addActionListener(this);
	    f1.add(bt);
	    f1.setVisible(true);
	    f2 = new JFrame("3");
	    f2.setSize(600,400);
  }
  public void actionPerformed(ActionEvent e) 
  { f1.dispose();
    f2.setVisible(true);
  }
}