

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
	int re = 25;
	int gree = 150;
	int blu =  70;
	float[] hs = Color.RGBtoHSB(re, gree, blu, null);
	float hu = hs[0];
	float sat = hs[1];
	float bright = hs[2];
	int r = 150;
	int gre = 40;
	int bl =  70;
	float[] h = Color.RGBtoHSB(r, gre, bl, null);
	float hua = h[0];
	float sa = h[1];
	float brigh = h[2];
	int minutes = 44;
	int sec;
	int red = 15;
	int green = 80;
	int blue = 160;
	float[] hsb = Color.RGBtoHSB(red, green, blue, null);
	float hue = hsb[0];
	float saturation = hsb[1];
	float brightness = hsb[2];
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
	

		
		System.out.println("RGB [" + red + "," + green + "," + blue + "] converted to HGB" + hue + " , "+ saturation + " , " + brightness);
		button.add(penalty);
		//code.setBounds();
		check.setBounds(238, 180, 85, 30);
		check.setText("check");
		check.addActionListener(this);
		check.setOpaque(true);
		check.setBorderPainted(true);
		out.setVisible(true);
		out.setText("output");
		out.setOpaque(true);
		out.setBounds(0, 280, 600, 100);
		out.setBackground(Color.black);
		out.setFont(out.getFont().deriveFont(Font.BOLD, 15));
		out.setForeground(Color.WHITE);
		out.setHorizontalAlignment(NORMAL);
		output.setVisible(true);
		output.setText("code");
		output.setOpaque(false);
		output.setBounds(238, 115, 80, 40);
		output.setFont(output.getFont().deriveFont(Font.BOLD, 15));
		output.setHorizontalAlignment(NORMAL);
		output.setBackground(Color.cyan);
		input.setBounds(180, 152, 200, 30);
		panel.setLayout(null);
		panel.setBackground(Color.getHSBColor(hue, saturation, brightness));
		button.setBounds(227, 242, 95, 28);
		button.setHorizontalAlignment(NORMAL);
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
public void actionPerformed(ActionEvent e){
	// TODO Auto-generated method stub
String yes = input.getText();
if(yes.equals("reset")) {
	panel.setBackground(Color.getHSBColor(hue, saturation, brightness));

} else if(yes.equals("759375024731")) {
	out.setText("come in V.I.P., the code is 7304.");
	panel.setBackground(Color.getHSBColor(hu, sat, bright));
	
} else {
	out.setText("press penalty");
	panel.setBackground(Color.getHSBColor(hua, sa, brigh));
	
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
	panel.setBackground(Color.getHSBColor(hue, saturation, brightness));
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

