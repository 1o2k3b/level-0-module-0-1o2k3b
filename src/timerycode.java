

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
public class timerycode extends JFrame implements ActionListener, MouseListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	JLabel timer = new JLabel();
	JLabel penalty = new JLabel();
	JTextField input = new JTextField();
	JButton check = new JButton();
	JLabel output = new JLabel();
	JLabel out = new JLabel();
	JLabel code = new JLabel();
	long time = System.currentTimeMillis();
	int minutes = 44;
	int sec;

	public void run() throws InterruptedException {

		frame.add(panel);
		frame.setVisible(true);
		penalty.setText("penalty");
		panel.add(button);
		panel.add(timer);
		panel.add(input);
		panel.add(check);
		panel.add(output);
		panel.add(out);
		panel.add(code);
		
		timer.setFont(timer.getFont().deriveFont(Font.BOLD, 30));
		int red = 15;
		int green = 80;
		int blue = 160;
		float[] hsb = Color.RGBtoHSB(red, green, blue, null);
		float hue = hsb[0];
		float saturation = hsb[1];
		float brightness = hsb[2];
		System.out.println("RGB [" + red + "," + green + "," + blue + "] converted to HGB" + hue + " , "+ saturation + " , " + brightness);
		button.add(penalty);
		//code.setBounds();
		check.setBounds(238, 180, 70, 30);
		check.setText("check");
		check.addActionListener(this);
		check.setBackground(Color.green);
		out.setVisible(true);
		out.setText("output");
		out.setOpaque(true);
		out.setBounds(0, 280, 600, 100);
		out.setBackground(Color.black);
		out.setFont(out.getFont().deriveFont(Font.BOLD, 15));
		out.setForeground(Color.WHITE);
		out.setHorizontalAlignment(NORMAL);
		output.setVisible(true);
		output.setText("code/hint");
		output.setOpaque(true);
		output.setBounds(238, 115, 75, 40);
		output.setFont(output.getFont().deriveFont(Font.BOLD, 15));
		output.setHorizontalAlignment(NORMAL);
		output.setBackground(Color.cyan);
		input.setBounds(180, 152, 200, 30);
		panel.setLayout(null);
		panel.setBackground(Color.getHSBColor(hue, saturation, brightness));
		button.setBounds(235, 245, 75, 35);
		button.setBackground(Color.RED);
		button.setOpaque(true);
		button.addMouseListener(this);
		button.setBorderPainted(false);
		timer.setHorizontalAlignment(NORMAL);
		timer.setBounds(0, 0, 600, 100);
		timer.setOpaque(true);
		timer.setBackground(Color.yellow);
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


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String yes = input.getText();
if(yes.equals("72")) {
	out.setText("you did it");
} else {
	out.setText("press penalty");
}
}


@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	minutes-=3;
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




}

