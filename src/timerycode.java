

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
public class timerycode extends JFrame implements ActionListener , MouseListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	JLabel timer = new JLabel();
	JLabel penalty = new JLabel();
	long time = System.currentTimeMillis();
	int minutes = 44;
	int sec;
	public void run() throws InterruptedException {

		

		frame.add(panel);
		frame.setVisible(true);
		penalty.setText("penalty");
		panel.add(button);
		panel.add(timer);
		panel.setBackground(Color.darkGray);
		button.add(penalty);
		panel.setLayout(null);
		button.setBounds(275,300, 90, 35);
		button.setBackground(Color.RED);
		button.setOpaque(true);

		button.addMouseListener(this);
		button.setBorderPainted(false);
		timer.setBounds(300, 10, 100, 50);
		frame.pack();

		frame.setSize(600, 400);
		panel.setAlignmentY(BOTTOM_ALIGNMENT);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		for(sec = 59; sec>-1; sec--) {
			String s = String.valueOf(sec);
			timer.setText(minutes + " : " + s);
			Thread.sleep(1000);
			if(sec == 0) {
				sec = 59;
				minutes-=1;
			}
			}
	}
		
		
public static void main(String[] args) throws InterruptedException {
timerycode code = new timerycode();
code.run();
	
	
	
	
}



public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub

}


@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	minutes-=1;
	button.setBackground(Color.LIGHT_GRAY);

}


@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	button.setBackground(Color.red);
}

}

